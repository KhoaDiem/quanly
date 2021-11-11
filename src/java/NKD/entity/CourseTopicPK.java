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
    @Column(name = "course_id")
    private int courseId;
    @Basic(optional = false)
    @Column(name = "topic_id")
    private int topicId;

    public CourseTopicPK() {
    }

    public CourseTopicPK(int courseId, int topicId) {
        this.courseId = courseId;
        this.topicId = topicId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) courseId;
        hash += (int) topicId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CourseTopicPK)) {
            return false;
        }
        CourseTopicPK other = (CourseTopicPK) object;
        if (this.courseId != other.courseId) {
            return false;
        }
        if (this.topicId != other.topicId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NKD.entity.CourseTopicPK[ courseId=" + courseId + ", topicId=" + topicId + " ]";
    }
    
}
