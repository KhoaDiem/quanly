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
    @Column(name = "courseID")
    private int courseID;
    @Basic(optional = false)
    @Column(name = "traineeID")
    private int traineeID;

    public TraineeCoursePK() {
    }

    public TraineeCoursePK(int courseID, int traineeID) {
        this.courseID = courseID;
        this.traineeID = traineeID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getTraineeID() {
        return traineeID;
    }

    public void setTraineeID(int traineeID) {
        this.traineeID = traineeID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) courseID;
        hash += (int) traineeID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraineeCoursePK)) {
            return false;
        }
        TraineeCoursePK other = (TraineeCoursePK) object;
        if (this.courseID != other.courseID) {
            return false;
        }
        if (this.traineeID != other.traineeID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NKD.entity.TraineeCoursePK[ courseID=" + courseID + ", traineeID=" + traineeID + " ]";
    }
    
}
