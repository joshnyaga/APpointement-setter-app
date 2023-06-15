package com.Naveen.AppointmentSetter.model;

import javax.persistence.*;

@Entity
@Table(name="Approval")
public class Approval {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="approval_id")
    private int appovalId;
    @Column(name="appointment_id")
    private int appointmentId;
    @Column(name ="comment")
    private String comment;
    @Column(name ="approved")
    private int approved;


    public Approval() {
    }

    public Approval(int appointmentId, String comment, int approved) {
        this.appointmentId = appointmentId;
        this.comment = comment;
        this.approved = approved;

    }

    public int getAppovalId() {
        return appovalId;
    }

    public void setAppovalId(int appovalId) {
        this.appovalId = appovalId;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getApproved() {
        return approved;
    }

    public void setApproved(int approved) {
        this.approved = approved;
    }

}
