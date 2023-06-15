package com.Naveen.AppointmentSetter.model;

import javax.persistence.*;

@Entity
@Table(name="Appointments")
public class Appointments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id")
    private int appointmentId;
    @Column(name = "user_id")
    private Long userId;
    @Column(name="user_name")
    private String userName;
    @Column(name="user_email")
    private String userEmail;
    @Column(name = "bank_name")
    private String bankName;
    @Column(name = "bank_location")
    private  String bankLocation;
    @Column(name = "bank_purpose")
    private String purpose;
    @Column(name = "date")
    private String date;
    @Column(name = "time")
    private String time;
    @Column(name = "status")
    private String status;

    public Appointments() {
    }

    public Appointments(Long userId, String bankName, String userEmail, String bankLocation, String userName, String purpose, String date, String time, String status) {
        this.userId = userId;
        this.bankName = bankName;
        this.bankLocation = bankLocation;
        this.purpose = purpose;
        this.date = date;
        this.time = time;
        this.status = status;
        this.userName = userName;
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankLocation() {
        return bankLocation;
    }

    public void setBankLocation(String bankLocation) {
        this.bankLocation = bankLocation;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
