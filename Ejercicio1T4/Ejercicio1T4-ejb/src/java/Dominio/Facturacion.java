/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Propietario
 */
@Entity
@Table(name = "FACTURACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facturacion.findAll", query = "SELECT f FROM Facturacion f"),
    @NamedQuery(name = "Facturacion.findByFacnId", query = "SELECT f FROM Facturacion f WHERE f.facnId = :facnId"),
    @NamedQuery(name = "Facturacion.findByFacName", query = "SELECT f FROM Facturacion f WHERE f.facName = :facName"),
    @NamedQuery(name = "Facturacion.findByFacAddress", query = "SELECT f FROM Facturacion f WHERE f.facAddress = :facAddress"),
    @NamedQuery(name = "Facturacion.findByFacCity", query = "SELECT f FROM Facturacion f WHERE f.facCity = :facCity"),
    @NamedQuery(name = "Facturacion.findByFacState", query = "SELECT f FROM Facturacion f WHERE f.facState = :facState"),
    @NamedQuery(name = "Facturacion.findByFacZip", query = "SELECT f FROM Facturacion f WHERE f.facZip = :facZip")})
public class Facturacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "FACN_ID")
    private Integer facnId;
    @Size(max = 250)
    @Column(name = "FAC_NAME")
    private String facName;
    @Size(max = 250)
    @Column(name = "FAC_ADDRESS")
    private String facAddress;
    @Size(max = 125)
    @Column(name = "FAC_CITY")
    private String facCity;
    @Size(max = 50)
    @Column(name = "FAC_STATE")
    private String facState;
    @Size(max = 5)
    @Column(name = "FAC_ZIP")
    private String facZip;
    @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID")
    @OneToOne(optional = false)
    private Usuarios userId;

    public Facturacion() {
    }

    public Facturacion(Integer facnId) {
        this.facnId = facnId;
    }

    public Integer getFacnId() {
        return facnId;
    }

    public void setFacnId(Integer facnId) {
        this.facnId = facnId;
    }

    public String getFacName() {
        return facName;
    }

    public void setFacName(String facName) {
        this.facName = facName;
    }

    public String getFacAddress() {
        return facAddress;
    }

    public void setFacAddress(String facAddress) {
        this.facAddress = facAddress;
    }

    public String getFacCity() {
        return facCity;
    }

    public void setFacCity(String facCity) {
        this.facCity = facCity;
    }

    public String getFacState() {
        return facState;
    }

    public void setFacState(String facState) {
        this.facState = facState;
    }

    public String getFacZip() {
        return facZip;
    }

    public void setFacZip(String facZip) {
        this.facZip = facZip;
    }

    public Usuarios getUserId() {
        return userId;
    }

    public void setUserId(Usuarios userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facnId != null ? facnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturacion)) {
            return false;
        }
        Facturacion other = (Facturacion) object;
        if ((this.facnId == null && other.facnId != null) || (this.facnId != null && !this.facnId.equals(other.facnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dominio.Facturacion[ facnId=" + facnId + " ]";
    }
    
}
