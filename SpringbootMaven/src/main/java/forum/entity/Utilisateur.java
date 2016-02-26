/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.entity;

import forum.enumeration.TypeUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.eclipse.persistence.annotations.CascadeOnDelete;

/**
 *
 * @author admin
 */
@Entity
public class Utilisateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String mdp;
    private String mail;
    private TypeUtil typeUtil;
    private String login;
    private Boolean inscrit = false;

    
    @OneToMany(mappedBy = "createur", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}) // /!\ dans les () on indique la relation réciproque déjà mappée, à savoir la clé étrangère manytoone
    @CascadeOnDelete
    private List<Forum> forumCrees = new ArrayList<Forum>();

    @OneToMany(mappedBy = "postePar", cascade = CascadeType.PERSIST)
    private List<Sujet> sujetPostes = new ArrayList<Sujet>();

    @OneToMany(mappedBy = "postePar", cascade = CascadeType.PERSIST)
    private List<Message> messagePostes = new ArrayList<Message>();
    
    @OneToOne
    @JoinColumn(name = "INSEE_ID")
    private Insee numInsee;

    public Insee getNumInsee() {
        return numInsee;
    }

    public void setNumInsee(Insee numInsee) {
        this.numInsee = numInsee;
    }

    public List<Sujet> getSujetPostes() {
        return sujetPostes;
    }

    public void setSujetPostes(List<Sujet> sujetPostes) {
        this.sujetPostes = sujetPostes;
    }


    public List<Message> getMessagePostes() {
        return messagePostes;
    }

    public void setMessagePostes(List<Message> messagePostes) {
        this.messagePostes = messagePostes;
    }

    public List<Forum> getForumCrees() {
        return forumCrees;
    }

    public void setForumCrees(List<Forum> forumCrees) {
        this.forumCrees = forumCrees;
    }

    public Boolean getInscrit() {
        return inscrit;
    }

    public void setInscrit(Boolean inscrit) {
        this.inscrit = inscrit;
    }

    public TypeUtil getTypeUtil() {
        return typeUtil;
    }

    public void setTypeUtil(TypeUtil typeUtil) {
        this.typeUtil = typeUtil;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "forum.entity.Utilisateur[ id=" + id + " ]";
    }

}
