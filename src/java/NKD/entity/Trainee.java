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
    @NamedQuery(name = "Trainee.findByTraineeId", query = "SELECT t FROM Trainee t WHERE t.traineeId = :traineeId"),
    @NamedQuery(name = "Trainee.findByTraineeName", query = "SELECT t FROM Trainee t WHERE t.traineeName = :traineeName"),
    @NamedQuery(name = "Trainee.findByDateOfBirth", query = "SELECT t FROM Trainee t WHERE t.dateOfBirth = :dateOfBirth"),
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
    @Column(name = "trainee_id")
    private Integer traineeId;
    @Basic(optional = false)
    @Column(name = "traineeName")
    private String traineeName;
    @Basic(optional = false)
    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Basic(optional = false)
    @Column(name = "education")
    private String education;
    @Basic(optional = false)
    @Column(name = "programing_language")
    private String programingLanguage;
    @Basic(optional = false)
    @Column(name = "toeic_score")
    private String toeicScore;
    @Basic(optional = false)
    @Column(name = "expericen_detail")
    private String expericenDetail;
    @Basic(optional = false)
    @Column(name = "department")
    private String department;
    @Basic(optional = false)
    @Column(name = "location")
    private String location;

    public Trainee() {
    }

    public Trainee(Integer traineeId) {
        this.traineeId = traineeId;
    }

    public Trainee(Integer traineeId, String traineeName, Date dateOfBirth, String education, String programingLanguage, String toeicScore, String expericenDetail, String department, String location) {
        this.traineeId = traineeId;
        this.traineeName = traineeName;
        this.dateOfBirth = dateOfBirth;
        this.education = education;
        this.programingLanguage = programingLanguage;
        this.toeicScore = toeicScore;
        this.expericenDetail = expericenDetail;
        this.department = department;
        this.location = location;
    }

    public Integer getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(Integer traineeId) {
        this.traineeId = traineeId;
    }

    public String getTraineeName() {
        return traineeName;
    }

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
        hash += (traineeId != null ? traineeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainee)) {
            return false;
        }
        Trainee other = (Trainee) object;
        if ((this.traineeId == null && other.traineeId != null) || (this.traineeId != null && !this.traineeId.equals(other.traineeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NKD.entity.Trainee[ traineeId=" + traineeId + " ]";
    }
    
}
