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
public class CourseTrainerPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "trainerID")
    private int trainerID;
    @Basic(optional = false)
    @Column(name = "courseID")
    private int courseID;

    public CourseTrainerPK() {
    }

    public CourseTrainerPK(int trainerID, int courseID) {
        this.trainerID = trainerID;
        this.courseID = courseID;
    }

    public int getTrainerID() {
        return trainerID;
    }

    public void setTrainerID(int trainerID) {
        this.trainerID = trainerID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) trainerID;
        hash += (int) courseID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CourseTrainerPK)) {
            return false;
        }
        CourseTrainerPK other = (CourseTrainerPK) object;
        if (this.trainerID != other.trainerID) {
            return false;
        }
        if (this.courseID != other.courseID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NKD.entity.CourseTrainerPK[ trainerID=" + trainerID + ", courseID=" + courseID + " ]";
    }
    
}
