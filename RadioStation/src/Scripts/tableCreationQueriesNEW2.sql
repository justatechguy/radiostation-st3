/*ALTER TABLE SONG
    DROP CONSTRAINT SONG_ALBUM_FK;

ALTER TABLE ALBUM
    DROP PRIMARY KEY;

ALTER TABLE ALBUM
    ALBUM_ID BIGINT GENERATED BY DEFAULT AS IDENTITY;

ALTER TABLE ALBUM
    ADD PRIMARY KEY (ALBUM_ID);

ALTER TABLE SONG
    ADD CONSTRAINT SONG_ALBUM_FK FOREIGN KEY (ALBUM_ID)
            REFERENCES ALBUM(ALBUM_ID);/*

/*Δημιουργία πινάκων*/
/*Αλλαγές σε σχέση με το tableCreationQueriesNEW στις σειρές: 58, 67, 82, 123*/
CREATE TABLE MUSICGENRE (
    GENRE_ID BIGINT GENERATED BY DEFAULT AS IDENTITY,/**/
    GENRE_NAME VARCHAR(45),
    PRIMARY KEY (GENRE_NAME) /*Αλλαγή PK*/
);

CREATE TABLE ARTIST (
    ARTIST_ID BIGINT GENERATED BY DEFAULT AS IDENTITY,
    FIRST_NAME VARCHAR(45),
    LAST_NAME VARCHAR(45),
    ARTISTIC_NAME VARCHAR(100) NOT NULL,
    SEX VARCHAR(45) NOT NULL,
    BIRTH_DAY TIMESTAMP, /*Διαγραφή παραμέτρου*/
    BIRTH_PLACE VARCHAR(45), /*Διαγραφή παραμέτρου*/
    GENRE_NAME VARCHAR(45) NOT NULL, /*Αλλαγή στήλης*/
    /*ALBUM_ID BIGINT,*/
    /*DISC_NUMBER INTEGER,*/
    PRIMARY KEY (ARTIST_ID)
);

CREATE TABLE MUSICGROUP (
    MUSICGROUP_ID BIGINT GENERATED BY DEFAULT AS IDENTITY,/**/
    MUSICGROUP_NAME VARCHAR(100) NOT NULL,
    FORMATION_DATE TIMESTAMP, /*Διαγραφή παραμέτρου*/
    /*ALBUM_ID BIGINT,*/
    /*DISC_NUMBER INTEGER,*/
    PRIMARY KEY (MUSICGROUP_NAME) /*Αλλαγή PK*/
);

CREATE TABLE MUSICPRODUCTIONCOMPANY (
    MPC_ID BIGINT GENERATED BY DEFAULT AS IDENTITY,/**/
    MPC_NAME VARCHAR(100) NOT NULL,
    ADDRESS VARCHAR(100), /*Αλλαγή παραμέτρου*/
    TELEPHONE VARCHAR(15), /*Αλλαγή παραμέτρου*/
    PRIMARY KEY (MPC_NAME) /*Αλλαγή PK*/
);

CREATE TABLE ALBUM (
    ALBUM_ID BIGINT GENERATED BY DEFAULT AS IDENTITY,
    /*ALBUM_ID BIGINT NOT NULL,*/  /*ΑΛΛΑΓΗ 20/02/15*/
    TITLE VARCHAR(255) NOT NULL,
    RELEASE_DATE TIMESTAMP NOT NULL,
    ALBUM_TYPE VARCHAR(45) NOT NULL,
    DISC_NUMBER INTEGER NOT NULL,
    MPC_NAME VARCHAR(100) NOT NULL, /*Αλλαγή στήλης*/
    MUSICGROUP_NAME VARCHAR(100), /*Αλλαγή στήλης*/
    ARTIST_ID BIGINT,
    PRIMARY KEY (ALBUM_ID)
    /*PRIMARY KEY (ALBUM_ID, DISC_NUMBER)*/ /*ΑΛΛΑΓΗ 20/02/15*/
);

CREATE TABLE PLAYLIST (
    PLAYLIST_ID BIGINT GENERATED BY DEFAULT AS IDENTITY,
    PL_NAME VARCHAR(100) NOT NULL, /*Αλλαγή μεγέθους*/
    PL_DESCRIPTION VARCHAR(255),
    PL_CREATION_DATE TIMESTAMP NOT NULL, /*Τροποποίηση στήλης ώστε να δημιουργείται αυτόματα η ημερομηνία*/
    PRIMARY KEY (PLAYLIST_ID)
);

CREATE TABLE SONG (
    SONG_ID BIGINT GENERATED BY DEFAULT AS IDENTITY,
    TITLE VARCHAR(100) NOT NULL, /*Αλλαγή μεγέθους*/
    DURATION INTEGER NOT NULL,
    /*DURATION TIMESTAMP NOT NULL,*/ /*ΑΛΛΑΓΗ 20/02/15*/
    TRACK_NR INTEGER NOT NULL,
    ALBUM_ID BIGINT NOT NULL,
    DISC_NUMBER INTEGER NOT NULL,
    PRIMARY KEY (SONG_ID)
);


/*Προσθήκη πεδίων (συγκεκριμένα foreign keys)*/
/*Η προσθήκη πεδίων στον εκάστοτε πίνακα μπορεί να γίνει με μία μόνο εντολή ALTER TABLE & ADD ανά πίνακα
(multiple columns), αλλά για κάποιο περίεργο λόγο το NetBeans δεν δέχεται την πολλαπλή προσθήκη πεδίων. 
Γι' αυτό παρακάτω γίνεται προσθήκη ενός πεδίου (και συγκεκριμένα η σύνδεση των foreign keys) κάθε φορά*/

ALTER TABLE ARTIST
    ADD CONSTRAINT MUSICGENRE_FK FOREIGN KEY (GENRE_NAME) /*Αλλαγή στήλης*/
            REFERENCES MUSICGENRE(GENRE_NAME);

/*ALTER TABLE ARTIST
    ADD CONSTRAINT ARTIST_ALBUM_FK FOREIGN KEY (ALBUM_ID, DISC_NUMBER)
            REFERENCES ALBUM(ALBUM_ID, DISC_NUMBER);*/

/*ALTER TABLE MUSICGROUP
    ADD CONSTRAINT GROUP_ALBUM_FK FOREIGN KEY (ALBUM_ID, DISC_NUMBER)
            REFERENCES ALBUM(ALBUM_ID, DISC_NUMBER);*/

ALTER TABLE ALBUM
    ADD CONSTRAINT MUSICPRODUCTIONCOMPANY_FK FOREIGN KEY (MPC_NAME) /*Αλλαγή στήλης*/
            REFERENCES MUSICPRODUCTIONCOMPANY(MPC_NAME);

ALTER TABLE ALBUM
    ADD CONSTRAINT ALBUM_ARTIST_FK FOREIGN KEY (ARTIST_ID)
            REFERENCES ARTIST(ARTIST_ID);

ALTER TABLE ALBUM
    ADD CONSTRAINT ALBUM_MUSICGROUP_FK FOREIGN KEY (MUSICGROUP_NAME) /*Αλλαγή FK*/
            REFERENCES MUSICGROUP(MUSICGROUP_NAME);

/*ALTER TABLE SONG
    ADD CONSTRAINT SONG_ALBUM_FK FOREIGN KEY (ALBUM_ID, DISC_NUMBER)
            REFERENCES ALBUM(ALBUM_ID, DISC_NUMBER);*/ /*ΑΛΛΑΓΗ 20/02/15*/

ALTER TABLE SONG
    ADD CONSTRAINT SONG_ALBUM_FK FOREIGN KEY (ALBUM_ID)
            REFERENCES ALBUM(ALBUM_ID);
        

/*Δημιουργία πινάκων σύνδεσης σχέσεων Many-to-Many*/

CREATE TABLE MUSICGROUP_ARTIST (
    ARTIST_ID BIGINT NOT NULL,
    MUSICGROUP_NAME VARCHAR(100) NOT NULL, /*Αλλαγή στήλης*/
    PRIMARY KEY (ARTIST_ID, MUSICGROUP_NAME),
    CONSTRAINT ARTIST_FK FOREIGN KEY (ARTIST_ID)
    	REFERENCES ARTIST(ARTIST_ID),
    CONSTRAINT MUSICGROUP_FK FOREIGN KEY (MUSICGROUP_NAME)
    	REFERENCES MUSICGROUP(MUSICGROUP_NAME)
);

CREATE TABLE PLAYLIST_SONG (
    PLAYLIST_ID BIGINT NOT NULL,
    SONG_ID BIGINT NOT NULL,
    /*ORDER_NUMBER INTEGER NOT NULL,*/
    PRIMARY KEY (PLAYLIST_ID, SONG_ID), /*Νέο PK*/
    CONSTRAINT PLAYLIST_FK FOREIGN KEY (PLAYLIST_ID)
    	REFERENCES PLAYLIST(PLAYLIST_ID),
    CONSTRAINT SONG_FK FOREIGN KEY (SONG_ID)
    	REFERENCES SONG(SONG_ID)
);
