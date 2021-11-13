/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NKD.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "topic")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Topic.findAll", query = "SELECT t FROM Topic t"),
    @NamedQuery(name = "Topic.findByTopicID", query = "SELECT t FROM Topic t WHERE t.topicID = :topicID"),
    @NamedQuery(name = "Topic.findByTopicName", query = "SELECT t FROM Topic t WHERE t.topicName = :topicName"),
    @NamedQuery(name = "Topic.findByDescription", query = "SELECT t FROM Topic t WHERE t.description = :description")})
public class Topic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "topicID")
    private Integer topicID;
    @Basic(optional = false)
    @Column(name = "topicName")
    private String topicName;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;

    public Topic() {
    }

    public Topic(Integer topicID) {
        this.topicID = topicID;
    }

    public Topic(Integer topicID, String topicName, String description) {
        this.topicID = topicID;
        this.topicName = topicName;
        this.description = description;
    }

    public Integer getTopicID() {
        return topicID;
    }

    public void setTopicID(Integer topicID) {
        this.topicID = topicID;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (topicID != null ? topicID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Topic)) {
            return false;
        }
        Topic other = (Topic) object;
        if ((this.topicID == null && other.topicID != null) || (this.topicID != null && !this.topicID.equals(other.topicID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NKD.entity.Topic[ topicID=" + topicID + " ]";
    }
    
}
