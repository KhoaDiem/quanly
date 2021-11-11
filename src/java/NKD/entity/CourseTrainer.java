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
@Table(name = "course_trainer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CourseTrainer.findAll", query = "SELECT c FROM CourseTrainer c"),
    @NamedQuery(name = "CourseTrainer.findByUserId", query = "SELECT c FROM CourseTrainer c WHERE c.courseTrainerPK.userId = :userId"),
    @NamedQuery(name = "CourseTrainer.findByCourseId", query = "SELECT c FROM CourseTrainer c WHERE c.courseTrainerPK.courseId = :courseId")})
public class CourseTrainer implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CourseTrainerPK courseTrainerPK;

    public CourseTrainer() {
    }

    public CourseTrainer(CourseTrainerPK courseTrainerPK) {
        this.courseTrainerPK = courseTrainerPK;
    }

    public CourseTrainer(int userId, int courseId) {
        this.courseTrainerPK = new CourseTrainerPK(userId, courseId);
    }

    public CourseTrainerPK getCourseTrainerPK() {
        return courseTrainerPK;
    }

    public void setCourseTrainerPK(CourseTrainerPK courseTrainerPK) {
        this.courseTrainerPK = courseTrainerPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (courseTrainerPK != null ? courseTrainerPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CourseTrainer)) {
            return false;
        }
        CourseTrainer other = (CourseTrainer) object;
        if ((this.courseTrainerPK == null && other.courseTrainerPK != null) || (this.courseTrainerPK != null && !this.courseTrainerPK.equals(other.courseTrainerPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NKD.entity.CourseTrainer[ courseTrainerPK=" + courseTrainerPK + " ]";
    }
    
}
