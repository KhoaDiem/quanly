/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NKD.entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "trainee_course")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TraineeCourse.findAll", query = "SELECT t FROM TraineeCourse t"),
    @NamedQuery(name = "TraineeCourse.findByCourseId", query = "SELECT t FROM TraineeCourse t WHERE t.traineeCoursePK.courseId = :courseId"),
    @NamedQuery(name = "TraineeCourse.findByTraineeId", query = "SELECT t FROM TraineeCourse t WHERE t.traineeCoursePK.traineeId = :traineeId")})
public class TraineeCourse implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TraineeCoursePK traineeCoursePK;

    public TraineeCourse() {
    }

    public TraineeCourse(TraineeCoursePK traineeCoursePK) {
        this.traineeCoursePK = traineeCoursePK;
    }

    public TraineeCourse(int courseId, int traineeId) {
        this.traineeCoursePK = new TraineeCoursePK(courseId, traineeId);
    }

    public TraineeCoursePK getTraineeCoursePK() {
        return traineeCoursePK;
    }

    public void setTraineeCoursePK(TraineeCoursePK traineeCoursePK) {
        this.traineeCoursePK = traineeCoursePK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (traineeCoursePK != null ? traineeCoursePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraineeCourse)) {
            return false;
        }
        TraineeCourse other = (TraineeCourse) object;
        if ((this.traineeCoursePK == null && other.traineeCoursePK != null) || (this.traineeCoursePK != null && !this.traineeCoursePK.equals(other.traineeCoursePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NKD.entity.TraineeCourse[ traineeCoursePK=" + traineeCoursePK + " ]";
    }
    
}
