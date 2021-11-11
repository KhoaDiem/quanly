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
@Table(name = "category_course")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoryCourse.findAll", query = "SELECT c FROM CategoryCourse c"),
    @NamedQuery(name = "CategoryCourse.findByCourseId", query = "SELECT c FROM CategoryCourse c WHERE c.categoryCoursePK.courseId = :courseId"),
    @NamedQuery(name = "CategoryCourse.findByCateforyId", query = "SELECT c FROM CategoryCourse c WHERE c.categoryCoursePK.cateforyId = :cateforyId")})
public class CategoryCourse implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CategoryCoursePK categoryCoursePK;

    public CategoryCourse() {
    }

    public CategoryCourse(CategoryCoursePK categoryCoursePK) {
        this.categoryCoursePK = categoryCoursePK;
    }

    public CategoryCourse(int courseId, int cateforyId) {
        this.categoryCoursePK = new CategoryCoursePK(courseId, cateforyId);
    }

    public CategoryCoursePK getCategoryCoursePK() {
        return categoryCoursePK;
    }

    public void setCategoryCoursePK(CategoryCoursePK categoryCoursePK) {
        this.categoryCoursePK = categoryCoursePK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoryCoursePK != null ? categoryCoursePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoryCourse)) {
            return false;
        }
        CategoryCourse other = (CategoryCourse) object;
        if ((this.categoryCoursePK == null && other.categoryCoursePK != null) || (this.categoryCoursePK != null && !this.categoryCoursePK.equals(other.categoryCoursePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NKD.entity.CategoryCourse[ categoryCoursePK=" + categoryCoursePK + " ]";
    }
    
}
