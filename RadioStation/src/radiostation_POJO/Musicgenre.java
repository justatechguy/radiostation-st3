/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiostation_POJO;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Panos
 */
@Entity
@Table(name = "MUSICGENRE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Musicgenre.findAll", query = "SELECT m FROM Musicgenre m"),
    @NamedQuery(name = "Musicgenre.findByGenreId", query = "SELECT m FROM Musicgenre m WHERE m.genreId = :genreId"),
    @NamedQuery(name = "Musicgenre.findByGenreName", query = "SELECT m FROM Musicgenre m WHERE m.genreName = :genreName")})
public class Musicgenre implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "GENRE_ID")
    private Integer genreId;
    @Column(name = "GENRE_NAME")
    private String genreName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "genreId")
    private Collection<Artist> artistCollection;

    public Musicgenre() {
    }

    public Musicgenre(Integer genreId) {
        this.genreId = genreId;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    @XmlTransient
    public Collection<Artist> getArtistCollection() {
        return artistCollection;
    }

    public void setArtistCollection(Collection<Artist> artistCollection) {
        this.artistCollection = artistCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (genreId != null ? genreId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Musicgenre)) {
            return false;
        }
        Musicgenre other = (Musicgenre) object;
        if ((this.genreId == null && other.genreId != null) || (this.genreId != null && !this.genreId.equals(other.genreId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "radiostation_POJO.Musicgenre[ genreId=" + genreId + " ]";
    }
    
}
