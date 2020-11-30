/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.projet.lo54.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author loann
 */
@Entity
@Table(name = "CLIENT")
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    
    @Basic(optional = false)
    @Column(name = "LASTNAME")
    private String lastname;
    
    @Basic(optional = false)
    @Column(name = "FIRSTNAME")
    private String firstname;
    
    @Basic(optional = false)
    @Column(name = "ADDRESS")
    private String address;
    
    @Basic(optional = false)
    @Column(name = "PHONE")
    private String phone;
    
    @Column(name = "EMAIL")
    private String email;  
    
    @JoinColumn(name = "MAIN_ACTOR_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private CourseSession session;

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
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fr.utbm.projet.lo54.entity.Client[ id=" + id + " ]";
    }
    
}
