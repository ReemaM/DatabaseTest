/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author ReemaM
 */
@Entity
@Table(name = "Inventory", catalog = "TCIL", schema = "")
@NamedQueries({
    @NamedQuery(name = "Inventory.findAll", query = "SELECT i FROM Inventory i")
    , @NamedQuery(name = "Inventory.findByMicCode", query = "SELECT i FROM Inventory i WHERE i.micCode = :micCode")
    , @NamedQuery(name = "Inventory.findByMaterialName", query = "SELECT i FROM Inventory i WHERE i.materialName = :materialName")
    , @NamedQuery(name = "Inventory.findByQuantityIssued", query = "SELECT i FROM Inventory i WHERE i.quantityIssued = :quantityIssued")
    , @NamedQuery(name = "Inventory.findByQuantityLeft", query = "SELECT i FROM Inventory i WHERE i.quantityLeft = :quantityLeft")
    , @NamedQuery(name = "Inventory.findByProject", query = "SELECT i FROM Inventory i WHERE i.project = :project")})
public class Inventory implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MicCode")
    private Integer micCode;
    @Basic(optional = false)
    @Column(name = "MaterialName")
    private String materialName;
    @Basic(optional = false)
    @Column(name = "QuantityIssued")
    private String quantityIssued;
    @Basic(optional = false)
    @Column(name = "QuantityLeft")
    private String quantityLeft;
    @Basic(optional = false)
    @Column(name = "Project")
    private String project;

    public Inventory() {
    }

    public Inventory(Integer micCode) {
        this.micCode = micCode;
    }

    public Inventory(Integer micCode, String materialName, String quantityIssued, String quantityLeft, String project) {
        this.micCode = micCode;
        this.materialName = materialName;
        this.quantityIssued = quantityIssued;
        this.quantityLeft = quantityLeft;
        this.project = project;
    }

    public Integer getMicCode() {
        return micCode;
    }

    public void setMicCode(Integer micCode) {
        Integer oldMicCode = this.micCode;
        this.micCode = micCode;
        changeSupport.firePropertyChange("micCode", oldMicCode, micCode);
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        String oldMaterialName = this.materialName;
        this.materialName = materialName;
        changeSupport.firePropertyChange("materialName", oldMaterialName, materialName);
    }

    public String getQuantityIssued() {
        return quantityIssued;
    }

    public void setQuantityIssued(String quantityIssued) {
        String oldQuantityIssued = this.quantityIssued;
        this.quantityIssued = quantityIssued;
        changeSupport.firePropertyChange("quantityIssued", oldQuantityIssued, quantityIssued);
    }

    public String getQuantityLeft() {
        return quantityLeft;
    }

    public void setQuantityLeft(String quantityLeft) {
        String oldQuantityLeft = this.quantityLeft;
        this.quantityLeft = quantityLeft;
        changeSupport.firePropertyChange("quantityLeft", oldQuantityLeft, quantityLeft);
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        String oldProject = this.project;
        this.project = project;
        changeSupport.firePropertyChange("project", oldProject, project);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (micCode != null ? micCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventory)) {
            return false;
        }
        Inventory other = (Inventory) object;
        if ((this.micCode == null && other.micCode != null) || (this.micCode != null && !this.micCode.equals(other.micCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mysql.Inventory[ micCode=" + micCode + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
