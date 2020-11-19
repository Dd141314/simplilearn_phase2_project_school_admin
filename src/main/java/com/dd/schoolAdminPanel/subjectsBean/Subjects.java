package com.dd.schoolAdminPanel.subjectsBean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.dd.schoolAdminPanel.constants.DataUtilsTO;

@Entity
@Table(name = "subjects")
public class Subjects {

    @Id
    @Column(name = "subjectId")
    private int subjectId;

    @Column(name = "subjectName")
    private String subjectName;

    @Column(name = "subjectDescription")
    private String subjectDescription;

    @Column(name = "createdBy")
    private String createdBy;

    @Column(name = "createdDt")
    private Date createdDt;

    @Column(name = "updatedBy")
    private String updatedBy;
    
    @Column(name = "updatedDt")
    private Date updatedDt;

    @Transient
    private String createdDtDisp;
    
    @Transient
    private String updatedDtDisp;


    public Subjects(String subjectName, String subjectDescription, String createdBy, Date createdDt,
        String updatedBy, Date updatedDt) {
        super();
        this.subjectName = subjectName;
        this.subjectDescription = subjectDescription;
        this.createdBy = createdBy;
        this.createdDt = createdDt;
        this.updatedBy = updatedBy;
        this.updatedDt = updatedDt;
    }

    public Subjects() {

    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }

    public Date getUpdatedDt() {
        return updatedDt;
    }

    public void setUpdatedDt(Date updatedDt) {
        this.updatedDt = updatedDt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }


    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

	public String getCreatedDtDisp() {
		if(this.createdDt != null) {
			DataUtilsTO dataUtilsTO = new DataUtilsTO();
			createdDtDisp = dataUtilsTO.formatDate_DD_MM_YYYY_HH_MM(createdDt);
		}
		return createdDtDisp;
	}

	public void setCreatedDtDisp(String createdDtDisp) {
		this.createdDtDisp = createdDtDisp;
	}

	public String getUpdatedDtDisp() {
		if(this.updatedDt != null) {
			DataUtilsTO dataUtilsTO = new DataUtilsTO();
			updatedDtDisp = dataUtilsTO.formatDate_DD_MM_YYYY_HH_MM(updatedDt);
		}
		return updatedDtDisp;
	}

	public void setUpdatedDtDisp(String updatedDtDisp) {
		
		this.updatedDtDisp = updatedDtDisp;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectDescription() {
		return subjectDescription;
	}

	public void setSubjectDescription(String subjectDescription) {
		this.subjectDescription = subjectDescription;
	}




}