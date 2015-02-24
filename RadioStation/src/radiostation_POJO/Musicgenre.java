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
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
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
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "GENRE_ID")
    private long genreId;
    @Id
    @Basic(optional = false)
    @Column(name = "GENRE_NAME")
    private String genreName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "genreName")
    private Collection<Artist> artistCollection;

    public Musicgenre() {
    }

    public Musicgenre(String genreName) {
        this.genreName = genreName;
    }

    public Musicgenre(String genreName, long genreId) {
        this.genreName = genreName;
        this.genreId = genreId;
    }

    public long getGenreId() {
        return genreId;
    }

    public void setGenreId(long genreId) {
        long oldGenreId = this.genreId;
        this.genreId = genreId;
        changeSupport.firePropertyChange("genreId", oldGenreId, genreId);
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        String oldGenreName = this.genreName;
        this.genreName = genreName;
        changeSupport.firePropertyChange("genreName", oldGenreName, genreName);
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
        hash += (genreName != null ? genreName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Musicgenre)) {
            return false;
        }
        Musicgenre other = (Musicgenre) object;
        if ((this.genreName == null && other.genreName != null) || (this.genreName != null && !this.genreName.equals(other.genreName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "radiostation_POJO.Musicgenre[ genreName=" + genreName + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
