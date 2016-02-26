/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author admin
 */
@Entity
public class Insee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String numeroInsee;
    
    @OneToOne(mappedBy = "numInsee")
    private Utilisateur numUtil;

    public String getNumeroInsee() {
        return numeroInsee;
    }

    public void setNumeroInsee(String numeroInsee) {
        this.numeroInsee = numeroInsee;
    }

    public Utilisateur getNumUtil() {
        return numUtil;
    }

    public void setNumUtil(Utilisateur numUtil) {
        this.numUtil = numUtil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Insee)) {
            return false;
        }
        Insee other = (Insee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "forum.entity.Insee[ id=" + id + " ]";
    }
    
}
