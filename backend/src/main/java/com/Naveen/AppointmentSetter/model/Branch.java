package com.Naveen.AppointmentSetter.model;

import javax.persistence.*;

@Entity
@Table(name="Branch")
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="branch_id")
    private int branchId;
    @Column(name="branch_name")
    private String branchName;
    @Column(name="location")
    private String location;
    @Column(name="phone_contact")
    private String contact;
    @Column(name="note")
    private String note;
    @Column(name="user_id")
    private long userId;

    public Branch() {
    }



    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Branch(String branchName, String location, String contact, String note, int userId) {

        this.branchName = branchName;
        this.location = location;
        this.contact = contact;
        this.userId = userId;
        this.note = note;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
