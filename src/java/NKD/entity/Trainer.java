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
    @NamedQuery(name = "Trainer.findByUserId", query = "SELECT t FROM Trainer t WHERE t.userId = :userId"),
    @NamedQuery(name = "Trainer.findByTrainerName", query = "SELECT t FROM Trainer t WHERE t.trainerName = :trainerName"),
    @NamedQuery(name = "Trainer.findByEducation", query = "SELECT t FROM Trainer t WHERE t.education = :education"),
    @NamedQuery(name = "Trainer.findByTypeWork", query = "SELECT t FROM Trainer t WHERE t.typeWork = :typeWork"),
    @NamedQuery(name = "Trainer.findByWorkingPlace", query = "SELECT t FROM Trainer t WHERE t.workingPlace = :workingPlace"),
    @NamedQuery(name = "Trainer.findByTelephone", query = "SELECT t FROM Trainer t WHERE t.telephone = :telephone"),
    @NamedQuery(name = "Trainer.findByEmailAddress", query = "SELECT t FROM Trainer t WHERE t.emailAddress = :emailAddress")})
public class Trainer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_id")
    private Integer userId;
    @Basic(optional = false)
    @Column(name = "trainerName")
    private String trainerName;
    @Basic(optional = false)
    @Column(name = "education")
    private String education;
    @Basic(optional = false)
    @Column(name = "type_work")
    private String typeWork;
    @Basic(optional = false)
    @Column(name = "working_place")
    private String workingPlace;
    @Basic(optional = false)
    @Column(name = "telephone")
    private String telephone;
    @Basic(optional = false)
    @Column(name = "email_address")
    private String emailAddress;

    public Trainer() {
    }

    public Trainer(Integer userId) {
        this.userId = userId;
    }

    public Trainer(Integer userId, String trainerName, String education, String typeWork, String workingPlace, String telephone, String emailAddress) {
        this.userId = userId;
        this.trainerName = trainerName;
        this.education = education;
        this.typeWork = typeWork;
        this.workingPlace = workingPlace;
        this.telephone = telephone;
        this.emailAddress = emailAddress;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public String getTypeWork() {
        return typeWork;
    }

    public void setTypeWork(String typeWork) {
        this.typeWork = typeWork;
    }

    public String getWorkingPlace() {
        return workingPlace;
    }

    public void setWorkingPlace(String workingPlace) {
        this.workingPlace = workingPlace;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainer)) {
            return false;
        }
        Trainer other = (Trainer) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NKD.entity.Trainer[ userId=" + userId + " ]";
    }
    
}
