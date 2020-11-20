package com.dd.schoolAdminPanel.classesSubjectsMappingBean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.dd.schoolAdminPanel.constants.DataUtilsTO;

@Entity
@Table(name = "classes_subjects_mapping")
public class ClassesSubjectsMapping {

    @Id
    @Column(name = "classesSubjectsMappingId")
    private int classesSubjectsMappingId;

    @Column(name = "classId")
    private int classId;

    public ClassesSubjectsMapping(int classId, String className, int subjectId, String subjectName, String createdBy,
			Date createdDt, String updatedBy, Date updatedDt) {
		super();
		this.classId = classId;
		this.className = className;
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.createdBy = createdBy;
		this.createdDt = createdDt;
		this.updatedBy = updatedBy;
		this.updatedDt = updatedDt;
	}

	@Column(name = "className")
    private String className;
    
	@Column(name = "subjectId")
    private int subjectId;

    @Column(name = "subjectName")
    private String subjectName;

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



    public ClassesSubjectsMapping() {

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

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getClassesSubjectsMappingId() {
		return classesSubjectsMappingId;
	}

	public void setClassesSubjectsMappingId(int classesSubjectsMappingId) {
		this.classesSubjectsMappingId = classesSubjectsMappingId;
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

	



}