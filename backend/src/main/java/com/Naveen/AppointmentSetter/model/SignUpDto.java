package com.Naveen.AppointmentSetter.model;

import lombok.Data;

@Data
public class SignUpDto {
    private String username;
    private String email;
    private String password;
    private int bank;
}