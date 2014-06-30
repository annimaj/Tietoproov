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
@Table(name = "s\u00f6\u00f6gikohad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "S\u00f6\u00f6gikohad.findAll", query = "SELECT s FROM S\u00f6\u00f6gikohad s"),
    @NamedQuery(name = "S\u00f6\u00f6gikohad.findByNimi", query = "SELECT s FROM S\u00f6\u00f6gikohad s WHERE s.nimi = :nimi"),
    @NamedQuery(name = "S\u00f6\u00f6gikohad.findByAsukoht", query = "SELECT s FROM S\u00f6\u00f6gikohad s WHERE s.asukoht = :asukoht"),
    @NamedQuery(name = "S\u00f6\u00f6gikohad.findByHinne", query = "SELECT s FROM S\u00f6\u00f6gikohad s WHERE s.hinne = :hinne"),
    @NamedQuery(name = "S\u00f6\u00f6gikohad.findByHinnanguid", query = "SELECT s FROM S\u00f6\u00f6gikohad s WHERE s.hinnanguid = :hinnanguid")})
public class Söögikohad implements Serializable {
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

    public Söögikohad() {
    }

    public Söögikohad(String nimi) {
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
        if (!(object instanceof Söögikohad)) {
            return false;
        }
        Söögikohad other = (Söögikohad) object;
        if ((this.nimi == null && other.nimi != null) || (this.nimi != null && !this.nimi.equals(other.nimi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.S\u00f6\u00f6gikohad[ nimi=" + nimi + " ]";
    }
    
}
