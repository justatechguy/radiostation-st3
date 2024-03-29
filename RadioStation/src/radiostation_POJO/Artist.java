/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiostation_POJO;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Panos
 */
@Entity
@Table(name = "ARTIST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Artist.findAll", query = "SELECT a FROM Artist a"),
    @NamedQuery(name = "Artist.findByArtistId", query = "SELECT a FROM Artist a WHERE a.artistId = :artistId"),
    @NamedQuery(name = "Artist.findByFirstName", query = "SELECT a FROM Artist a WHERE a.firstName = :firstName"),
    @NamedQuery(name = "Artist.findByLastName", query = "SELECT a FROM Artist a WHERE a.lastName = :lastName"),
    @NamedQuery(name = "Artist.findByArtisticName", query = "SELECT a FROM Artist a WHERE a.artisticName = :artisticName"),
    @NamedQuery(name = "Artist.findBySex", query = "SELECT a FROM Artist a WHERE a.sex = :sex"),
    @NamedQuery(name = "Artist.findByBirthDay", query = "SELECT a FROM Artist a WHERE a.birthDay = :birthDay"),
    @NamedQuery(name = "Artist.findByBirthPlace", query = "SELECT a FROM Artist a WHERE a.birthPlace = :birthPlace")})
public class Artist implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ARTIST_ID")
    private Integer artistId;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "ARTISTIC_NAME")
    private String artisticName;
    @Basic(optional = false)
    @Column(name = "SEX")
    private String sex;
    @Column(name = "BIRTH_DAY")
    @Temporal(TemporalType.DATE)
    private Date birthDay;
    @Column(name = "BIRTH_PLACE")
    private String birthPlace;
    @JoinTable(name = "MUSICGROUP_ARTIST", joinColumns = {
        @JoinColumn(name = "ARTIST_ID", referencedColumnName = "ARTIST_ID")}, inverseJoinColumns = {
        @JoinColumn(name = "MUSICGROUP_ID", referencedColumnName = "MUSICGROUP_ID")})
    @ManyToMany
    private Collection<Musicgroup> musicgroupCollection;
    @JoinColumn(name = "GENRE_ID", referencedColumnName = "GENRE_ID")
    @ManyToOne(optional = false)
    private Musicgenre genreId;
    @OneToMany(mappedBy = "artistId")
    private Collection<Album> albumCollection;

    public Artist() {
    }

    public Artist(Integer artistId) {
        this.artistId = artistId;
    }

    public Artist(Integer artistId, String artisticName, String sex) {
        this.artistId = artistId;
        this.artisticName = artisticName;
        this.sex = sex;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        Integer oldArtistId = this.artistId;
        this.artistId = artistId;
        changeSupport.firePropertyChange("artistId", oldArtistId, artistId);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        String oldFirstName = this.firstName;
        this.firstName = firstName;
        changeSupport.firePropertyChange("firstName", oldFirstName, firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        String oldLastName = this.lastName;
        this.lastName = lastName;
        changeSupport.firePropertyChange("lastName", oldLastName, lastName);
    }

    public String getArtisticName() {
        return artisticName;
    }

    public void setArtisticName(String artisticName) {
        String oldArtisticName = this.artisticName;
        this.artisticName = artisticName;
        changeSupport.firePropertyChange("artisticName", oldArtisticName, artisticName);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        String oldSex = this.sex;
        this.sex = sex;
        changeSupport.firePropertyChange("sex", oldSex, sex);
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        Date oldBirthDay = this.birthDay;
        this.birthDay = birthDay;
        changeSupport.firePropertyChange("birthDay", oldBirthDay, birthDay);
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        String oldBirthPlace = this.birthPlace;
        this.birthPlace = birthPlace;
        changeSupport.firePropertyChange("birthPlace", oldBirthPlace, birthPlace);
    }

    @XmlTransient
    public Collection<Musicgroup> getMusicgroupCollection() {
        return musicgroupCollection;
    }

    public void setMusicgroupCollection(Collection<Musicgroup> musicgroupCollection) {
        this.musicgroupCollection = musicgroupCollection;
    }

    public Musicgenre getGenreId() {
        return genreId;
    }

    public void setGenreId(Musicgenre genreId) {
        Musicgenre oldGenreId = this.genreId;
        this.genreId = genreId;
        changeSupport.firePropertyChange("genreId", oldGenreId, genreId);
    }

    @XmlTransient
    public Collection<Album> getAlbumCollection() {
        return albumCollection;
    }

    public void setAlbumCollection(Collection<Album> albumCollection) {
        this.albumCollection = albumCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (artistId != null ? artistId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Artist)) {
            return false;
        }
        Artist other = (Artist) object;
        if ((this.artistId == null && other.artistId != null) || (this.artistId != null && !this.artistId.equals(other.artistId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "radiostation_POJO.Artist[ artistId=" + artistId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
