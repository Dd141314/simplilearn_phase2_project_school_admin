package com.dd.schoolAdminPanel.studentsBean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.dd.schoolAdminPanel.constants.DataUtilsTO;

@Entity
@Table(name = "students")
public class Students {

    @Id
    @Column(name = "studentId")
    private int studentId;

    @Column(name = "studentName")
    private String studentName;

    @Column(name = "fathersName")
    private String fathersName;

    @Column(name = "mothersName")
    private String mothersName;

    @Column(name = "emergencyContactNumber")
    private String emergencyContactNumber;

    @Column(name = "bloodGroup")
    private String bloodGroup;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age")
    private int age;
    
    @Column(name = "classId")
    private int classId;

    @Column(name = "className")
    private String className;

    @Column(name = "address")
    private String address;

    @Column(name = "createdBy")
    private String createdBy;

    @Column(name = "createdDt")
    private Date createdDt;

    @Column(name = "updatedBy")
    private String updatedBy;
    
    public Students(String studentName, String fathersName, String mothersName, String emergencyContactNumber,
			String bloodGroup, String gender, int age, int classId, String className, String address, String createdBy,
			Date createdDt, String updatedBy, Date updatedDt, String createdDtDisp, String updatedDtDisp) {
		super();
		this.studentName = studentName;
		this.fathersName = fathersName;
		this.mothersName = mothersName;
		this.emergencyContactNumber = emergencyContactNumber;
		this.bloodGroup = bloodGroup;
		this.gender = gender;
		this.age = age;
		this.classId = classId;
		this.className = className;
		this.address = address;
		this.createdBy = createdBy;
		this.createdDt = createdDt;
		this.updatedBy = updatedBy;
		this.updatedDt = updatedDt;
		this.createdDtDisp = createdDtDisp;
		this.updatedDtDisp = updatedDtDisp;
	}

	@Column(name = "updatedDt")
    private Date updatedDt;

    @Transient
    private String createdDtDisp;
    
    @Transient
    private String updatedDtDisp;



    public Students() {

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

    public String getGender() {
        return gender;
    }




    public void setGender(String gender) {
        this.gender = gender;
    }




    public int getAge() {
        return age;
    }




    public void setAge(int age) {
        this.age = age;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

	public int getStudentId() {
		return studentId;
	}

	public void setStudentsId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getMothersName() {
		return mothersName;
	}

	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}

	public String getEmergencyContactNumber() {
		return emergencyContactNumber;
	}

	public void setEmergencyContactNumber(String emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
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




}