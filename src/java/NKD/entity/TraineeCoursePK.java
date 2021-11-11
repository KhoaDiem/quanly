/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NKD.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author DELL
 */
@Embeddable
public class TraineeCoursePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "course_id")
    private int courseId;
    @Basic(optional = false)
    @Column(name = "trainee_id")
    private int traineeId;

    public TraineeCoursePK() {
    }

    public TraineeCoursePK(int courseId, int traineeId) {
        this.courseId = courseId;
        this.traineeId = traineeId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(int traineeId) {
        this.traineeId = traineeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) courseId;
        hash += (int) traineeId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraineeCoursePK)) {
            return false;
        }
        TraineeCoursePK other = (TraineeCoursePK) object;
        if (this.courseId != other.courseId) {
            return false;
        }
        if (this.traineeId != other.traineeId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NKD.entity.TraineeCoursePK[ courseId=" + courseId + ", traineeId=" + traineeId + " ]";
    }
    
}
