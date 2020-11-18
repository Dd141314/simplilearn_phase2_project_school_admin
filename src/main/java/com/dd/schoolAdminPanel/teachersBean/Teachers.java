package com.dd.schoolAdminPanel.teachersBean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teachers")
public class Teachers {

    @Id
    @Column(name = "teacherId")
    private int teacherId;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "contactNumber")
    private String contactNumber;

    @Column(name = "emailId")
    private String emailId;

    @Column(name = "qualification")
    private String qualification;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age")
    private int age;

    @Column(name = "martialStatus")
    private String martialStatus;

    @Column(name = "address")
    private String address;

    @Column(name = "createdBy")
    private String createdBy;

    @Column(name = "createdDt")
    private Date createdDt;

    @Column(name = "updatedBy")
    private String updatedBy;
    
    @Column(name = "updatedDt")
    private Date updatedDt;


    public Teachers(String firstName, String lastName, String contactNumber, String emailId, String qualification,
        String gender, int age, String martialStatus, String address, String createdBy, Date createdDt,
        String updatedBy, Date updatedDt) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.emailId = emailId;
        this.qualification = qualification;
        this.gender = gender;
        this.age = age;
        this.martialStatus = martialStatus;
        this.address = address;
        this.createdBy = createdBy;
        this.createdDt = createdDt;
        this.updatedBy = updatedBy;
        this.updatedDt = updatedDt;
    }

    public Teachers() {

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


    public int getTeacherId() {
        return teacherId;
    }


    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getContactNumber() {
        return contactNumber;
    }


    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }




    public String getEmailId() {
        return emailId;
    }




    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }




    public String getQualification() {
        return qualification;
    }




    public void setQualification(String qualification) {
        this.qualification = qualification;
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




    public String getMartialStatus() {
        return martialStatus;
    }




    public void setMartialStatus(String martialStatus) {
        this.martialStatus = martialStatus;
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




}