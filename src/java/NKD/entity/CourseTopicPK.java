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
public class CourseTopicPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "courseID")
    private int courseID;
    @Basic(optional = false)
    @Column(name = "topicID")
    private int topicID;

    public CourseTopicPK() {
    }

    public CourseTopicPK(int courseID, int topicID) {
        this.courseID = courseID;
        this.topicID = topicID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getTopicID() {
        return topicID;
    }

    public void setTopicID(int topicID) {
        this.topicID = topicID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) courseID;
        hash += (int) topicID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CourseTopicPK)) {
            return false;
        }
        CourseTopicPK other = (CourseTopicPK) object;
        if (this.courseID != other.courseID) {
            return false;
        }
        if (this.topicID != other.topicID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NKD.entity.CourseTopicPK[ courseID=" + courseID + ", topicID=" + topicID + " ]";
    }
    
}
