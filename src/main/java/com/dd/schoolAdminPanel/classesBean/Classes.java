package com.dd.schoolAdminPanel.classesBean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.dd.schoolAdminPanel.constants.DataUtilsTO;

@Entity
@Table(name = "classes")
public class Classes {

    @Id
    @Column(name = "classId")
    private int classId;

    @Column(name = "className")
    private String className;

    @Column(name = "sectionName")
    private String sectionName;
    
    @Column(name = "totalNumberOfStudents")
    private int totalNumberOfStudents;

    @Column(name = "roomNo")
    private String roomNo;

    @Column(name = "classTeacherName")
    private String classTeacherName;


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


    public Classes(String className, String sectionName, int totalNumberOfStudents, String roomNo, String classTeacherName,String createdBy, Date createdDt,
        String updatedBy, Date updatedDt) {
        super();
        this.className = className;
        this.sectionName = sectionName;
        this.totalNumberOfStudents = totalNumberOfStudents;
        this.roomNo = roomNo;
        this.classTeacherName = classTeacherName;
        this.createdBy = createdBy;
        this.createdDt = createdDt;
        this.updatedBy = updatedBy;
        this.updatedDt = updatedDt;
    }

    public Classes() {

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

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public int getTotalNumberOfStudents() {
		return totalNumberOfStudents;
	}

	public void setTotalNumberOfStudents(int totalNumberOfStudents) {
		this.totalNumberOfStudents = totalNumberOfStudents;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getClassTeacherName() {
		return classTeacherName;
	}

	public void setClassTeacherName(String classTeacherName) {
		this.classTeacherName = classTeacherName;
	}




}