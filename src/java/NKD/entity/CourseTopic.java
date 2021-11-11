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
@Table(name = "course_topic")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CourseTopic.findAll", query = "SELECT c FROM CourseTopic c"),
    @NamedQuery(name = "CourseTopic.findByCourseId", query = "SELECT c FROM CourseTopic c WHERE c.courseTopicPK.courseId = :courseId"),
    @NamedQuery(name = "CourseTopic.findByTopicId", query = "SELECT c FROM CourseTopic c WHERE c.courseTopicPK.topicId = :topicId")})
public class CourseTopic implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CourseTopicPK courseTopicPK;

    public CourseTopic() {
    }

    public CourseTopic(CourseTopicPK courseTopicPK) {
        this.courseTopicPK = courseTopicPK;
    }

    public CourseTopic(int courseId, int topicId) {
        this.courseTopicPK = new CourseTopicPK(courseId, topicId);
    }

    public CourseTopicPK getCourseTopicPK() {
        return courseTopicPK;
    }

    public void setCourseTopicPK(CourseTopicPK courseTopicPK) {
        this.courseTopicPK = courseTopicPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (courseTopicPK != null ? courseTopicPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CourseTopic)) {
            return false;
        }
        CourseTopic other = (CourseTopic) object;
        if ((this.courseTopicPK == null && other.courseTopicPK != null) || (this.courseTopicPK != null && !this.courseTopicPK.equals(other.courseTopicPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NKD.entity.CourseTopic[ courseTopicPK=" + courseTopicPK + " ]";
    }
    
}
