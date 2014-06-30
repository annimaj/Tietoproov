/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Toomas
 */
@Entity
@Table(name = "kinod")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kinod.findAll", query = "SELECT k FROM Kinod k"),
    @NamedQuery(name = "Kinod.findByNimi", query = "SELECT k FROM Kinod k WHERE k.nimi = :nimi"),
    @NamedQuery(name = "Kinod.findByAsukoht", query = "SELECT k FROM Kinod k WHERE k.asukoht = :asukoht"),
    @NamedQuery(name = "Kinod.findByHinne", query = "SELECT k FROM Kinod k WHERE k.hinne = :hinne"),
    @NamedQuery(name = "Kinod.findByHinnanguid", query = "SELECT k FROM Kinod k WHERE k.hinnanguid = :hinnanguid")})
public class Kinod implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Nimi")
    private String nimi;
    @Size(max = 45)
    @Column(name = "Asukoht")
    private String asukoht;
    @Column(name = "Hinne")
    private Integer hinne;
    @Column(name = "Hinnanguid")
    private Integer hinnanguid;

    public Kinod() {
    }

    public Kinod(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getAsukoht() {
        return asukoht;
    }

    public void setAsukoht(String asukoht) {
        this.asukoht = asukoht;
    }

    public Integer getHinne() {
        return hinne;
    }

    public void setHinne(Integer hinne) {
        this.hinne = hinne;
    }

    public Integer getHinnanguid() {
        return hinnanguid;
    }

    public void setHinnanguid(Integer hinnanguid) {
        this.hinnanguid = hinnanguid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nimi != null ? nimi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kinod)) {
            return false;
        }
        Kinod other = (Kinod) object;
        if ((this.nimi == null && other.nimi != null) || (this.nimi != null && !this.nimi.equals(other.nimi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Kinod[ nimi=" + nimi + " ]";
    }
    
}
