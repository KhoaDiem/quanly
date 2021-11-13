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
    @Column(name = "courseID")
    private int courseID;
    @Basic(optional = false)
    @Column(name = "categoryID")
    private int categoryID;

    public CategoryCoursePK() {
    }

    public CategoryCoursePK(int courseID, int categoryID) {
        this.courseID = courseID;
        this.categoryID = categoryID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) courseID;
        hash += (int) categoryID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoryCoursePK)) {
            return false;
        }
        CategoryCoursePK other = (CategoryCoursePK) object;
        if (this.courseID != other.courseID) {
            return false;
        }
        if (this.categoryID != other.categoryID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NKD.entity.CategoryCoursePK[ courseID=" + courseID + ", categoryID=" + categoryID + " ]";
    }
    
}
