/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NKD.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "trainee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trainee.findAll", query = "SELECT t FROM Trainee t"),
    @NamedQuery(name = "Trainee.findByTraineeID", query = "SELECT t FROM Trainee t WHERE t.traineeID = :traineeID"),
    @NamedQuery(name = "Trainee.findByTraineeName", query = "SELECT t FROM Trainee t WHERE t.traineeName = :traineeName"),
    @NamedQuery(name = "Trainee.findByDob", query = "SELECT t FROM Trainee t WHERE t.dob = :dob"),
    @NamedQuery(name = "Trainee.findByEducation", query = "SELECT t FROM Trainee t WHERE t.education = :education"),
    @NamedQuery(name = "Trainee.findByProgramingLanguage", query = "SELECT t FROM Trainee t WHERE t.programingLanguage = :programingLanguage"),
    @NamedQuery(name = "Trainee.findByToeicScore", query = "SELECT t FROM Trainee t WHERE t.toeicScore = :toeicScore"),
    @NamedQuery(name = "Trainee.findByExpericenDetail", query = "SELECT t FROM Trainee t WHERE t.expericenDetail = :expericenDetail"),
    @NamedQuery(name = "Trainee.findByDepartment", query = "SELECT t FROM Trainee t WHERE t.department = :department"),
    @NamedQuery(name = "Trainee.findByLocation", query = "SELECT t FROM Trainee t WHERE t.location = :location")})
public class Trainee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "traineeID")
    private Integer traineeID;
    @Basic(optional = false)
    @Column(name = "traineeName")
    private String traineeName;
    @Basic(optional = false)
    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Basic(optional = false)
    @Column(name = "education")
    private String education;
    @Basic(optional = false)
    @Column(name = "programingLanguage")
    private String programingLanguage;
    @Basic(optional = false)
    @Column(name = "toeicScore")
    private String toeicScore;
    @Basic(optional = false)
    @Column(name = "expericenDetail")
    private String expericenDetail;
    @Basic(optional = false)
    @Column(name = "department")
    private String department;
    @Basic(optional = false)
    @Column(name = "location")
    private String location;

    public Trainee() {
    }

    public Trainee(Integer traineeID) {
        this.traineeID = traineeID;
    }

    public Trainee(Integer traineeID, String traineeName, Date dob, String education, String programingLanguage, String toeicScore, String expericenDetail, String department, String location) {
        this.traineeID = traineeID;
        this.traineeName = traineeName;
        this.dob = dob;
        this.education = education;
        this.programingLanguage = programingLanguage;
        this.toeicScore = toeicScore;
        this.expericenDetail = expericenDetail;
        this.department = department;
        this.location = location;
    }

    public Integer getTraineeID() {
        return traineeID;
    }

    public void setTraineeID(Integer traineeID) {
        this.traineeID = traineeID;
    }

    public String getTraineeName() {
        return traineeName;
    }

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public void setProgramingLanguage(String programingLanguage) {
        this.programingLanguage = programingLanguage;
    }

    public String getToeicScore() {
        return toeicScore;
    }

    public void setToeicScore(String toeicScore) {
        this.toeicScore = toeicScore;
    }

    public String getExpericenDetail() {
        return expericenDetail;
    }

    public void setExpericenDetail(String expericenDetail) {
        this.expericenDetail = expericenDetail;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (traineeID != null ? traineeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainee)) {
            return false;
        }
        Trainee other = (Trainee) object;
        if ((this.traineeID == null && other.traineeID != null) || (this.traineeID != null && !this.traineeID.equals(other.traineeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NKD.entity.Trainee[ traineeID=" + traineeID + " ]";
    }
    
}
