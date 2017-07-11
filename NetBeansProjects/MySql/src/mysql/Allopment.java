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
@Table(name = "Allopment", catalog = "TCIL", schema = "")
@NamedQueries({
    @NamedQuery(name = "Allopment.findAll", query = "SELECT a FROM Allopment a")
    , @NamedQuery(name = "Allopment.findByMicCode", query = "SELECT a FROM Allopment a WHERE a.micCode = :micCode")
    , @NamedQuery(name = "Allopment.findByMaterialName", query = "SELECT a FROM Allopment a WHERE a.materialName = :materialName")
    , @NamedQuery(name = "Allopment.findByMaterialDescription", query = "SELECT a FROM Allopment a WHERE a.materialDescription = :materialDescription")
    , @NamedQuery(name = "Allopment.findByQuantity", query = "SELECT a FROM Allopment a WHERE a.quantity = :quantity")
    , @NamedQuery(name = "Allopment.findByProject", query = "SELECT a FROM Allopment a WHERE a.project = :project")})
public class Allopment implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MicCode")
    private Integer micCode;
    @Column(name = "MaterialName")
    private String materialName;
    @Column(name = "MaterialDescription")
    private String materialDescription;
    @Column(name = "Quantity")
    private String quantity;
    @Column(name = "Project")
    private String project;

    public Allopment() {
    }

    public Allopment(Integer micCode) {
        this.micCode = micCode;
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

    public String getMaterialDescription() {
        return materialDescription;
    }

    public void setMaterialDescription(String materialDescription) {
        String oldMaterialDescription = this.materialDescription;
        this.materialDescription = materialDescription;
        changeSupport.firePropertyChange("materialDescription", oldMaterialDescription, materialDescription);
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        String oldQuantity = this.quantity;
        this.quantity = quantity;
        changeSupport.firePropertyChange("quantity", oldQuantity, quantity);
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
        if (!(object instanceof Allopment)) {
            return false;
        }
        Allopment other = (Allopment) object;
        if ((this.micCode == null && other.micCode != null) || (this.micCode != null && !this.micCode.equals(other.micCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mysql.Allopment[ micCode=" + micCode + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
