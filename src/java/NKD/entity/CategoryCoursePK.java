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
public class CategoryCoursePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "course_id")
    private int courseId;
    @Basic(optional = false)
    @Column(name = "catefory_id")
    private int cateforyId;

    public CategoryCoursePK() {
    }

    public CategoryCoursePK(int courseId, int cateforyId) {
        this.courseId = courseId;
        this.cateforyId = cateforyId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getCateforyId() {
        return cateforyId;
    }

    public void setCateforyId(int cateforyId) {
        this.cateforyId = cateforyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) courseId;
        hash += (int) cateforyId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoryCoursePK)) {
            return false;
        }
        CategoryCoursePK other = (CategoryCoursePK) object;
        if (this.courseId != other.courseId) {
            return false;
        }
        if (this.cateforyId != other.cateforyId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NKD.entity.CategoryCoursePK[ courseId=" + courseId + ", cateforyId=" + cateforyId + " ]";
    }
    
}
