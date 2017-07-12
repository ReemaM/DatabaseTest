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
@Table(name = "MaterialCode", catalog = "TCIL", schema = "")
@NamedQueries({
    @NamedQuery(name = "MaterialCode.findAll", query = "SELECT m FROM MaterialCode m")
    , @NamedQuery(name = "MaterialCode.findByMicCode", query = "SELECT m FROM MaterialCode m WHERE m.micCode = :micCode")
    , @NamedQuery(name = "MaterialCode.findByMaterialName", query = "SELECT m FROM MaterialCode m WHERE m.materialName = :materialName")
    , @NamedQuery(name = "MaterialCode.findByMaterialDescription", query = "SELECT m FROM MaterialCode m WHERE m.materialDescription = :materialDescription")
    , @NamedQuery(name = "MaterialCode.findByProject", query = "SELECT m FROM MaterialCode m WHERE m.project = :project")})
public class MaterialCode implements Serializable {

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
    @Column(name = "MaterialDescription")
    private String materialDescription;
    @Basic(optional = false)
    @Column(name = "Project")
    private String project;

    public MaterialCode() {
    }

    public MaterialCode(Integer micCode) {
        this.micCode = micCode;
    }

    public MaterialCode(Integer micCode, String materialName, String project) {
        this.micCode = micCode;
        this.materialName = materialName;
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

    public String getMaterialDescription() {
        return materialDescription;
    }

    public void setMaterialDescription(String materialDescription) {
        String oldMaterialDescription = this.materialDescription;
        this.materialDescription = materialDescription;
        changeSupport.firePropertyChange("materialDescription", oldMaterialDescription, materialDescription);
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
        if (!(object instanceof MaterialCode)) {
            return false;
        }
        MaterialCode other = (MaterialCode) object;
        if ((this.micCode == null && other.micCode != null) || (this.micCode != null && !this.micCode.equals(other.micCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mysql.MaterialCode[ micCode=" + micCode + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
