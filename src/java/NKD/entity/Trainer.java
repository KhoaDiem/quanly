/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NKD.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "trainer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trainer.findAll", query = "SELECT t FROM Trainer t"),
    @NamedQuery(name = "Trainer.findByTrainerID", query = "SELECT t FROM Trainer t WHERE t.trainerID = :trainerID"),
    @NamedQuery(name = "Trainer.findByTrainerName", query = "SELECT t FROM Trainer t WHERE t.trainerName = :trainerName"),
    @NamedQuery(name = "Trainer.findByEducation", query = "SELECT t FROM Trainer t WHERE t.education = :education"),
    @NamedQuery(name = "Trainer.findByTypework", query = "SELECT t FROM Trainer t WHERE t.typework = :typework"),
    @NamedQuery(name = "Trainer.findByWorkingplace", query = "SELECT t FROM Trainer t WHERE t.workingplace = :workingplace"),
    @NamedQuery(name = "Trainer.findByTelephone", query = "SELECT t FROM Trainer t WHERE t.telephone = :telephone"),
    @NamedQuery(name = "Trainer.findByEmail", query = "SELECT t FROM Trainer t WHERE t.email = :email")})
public class Trainer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "trainerID")
    private Integer trainerID;
    @Basic(optional = false)
    @Column(name = "trainerName")
    private String trainerName;
    @Basic(optional = false)
    @Column(name = "education")
    private String education;
    @Basic(optional = false)
    @Column(name = "typework")
    private String typework;
    @Basic(optional = false)
    @Column(name = "workingplace")
    private String workingplace;
    @Basic(optional = false)
    @Column(name = "telephone")
    private String telephone;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;

    public Trainer() {
    }

    public Trainer(Integer trainerID) {
        this.trainerID = trainerID;
    }

    public Trainer(Integer trainerID, String trainerName, String education, String typework, String workingplace, String telephone, String email) {
        this.trainerID = trainerID;
        this.trainerName = trainerName;
        this.education = education;
        this.typework = typework;
        this.workingplace = workingplace;
        this.telephone = telephone;
        this.email = email;
    }

    public Integer getTrainerID() {
        return trainerID;
    }

    public void setTrainerID(Integer trainerID) {
        this.trainerID = trainerID;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getTypework() {
        return typework;
    }

    public void setTypework(String typework) {
        this.typework = typework;
    }

    public String getWorkingplace() {
        return workingplace;
    }

    public void setWorkingplace(String workingplace) {
        this.workingplace = workingplace;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trainerID != null ? trainerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainer)) {
            return false;
        }
        Trainer other = (Trainer) object;
        if ((this.trainerID == null && other.trainerID != null) || (this.trainerID != null && !this.trainerID.equals(other.trainerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NKD.entity.Trainer[ trainerID=" + trainerID + " ]";
    }
    
}
