package com.Naveen.AppointmentSetter.controller;

import com.Naveen.AppointmentSetter.model.EmailDetails;
import com.Naveen.AppointmentSetter.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins= {"http://localhost:3000"}, allowCredentials = "true" )
@RestController
@RequestMapping("/api/v1")
public class EmailController {
    @Value("${spring.mail.username}") private String sender;
    @Autowired private JavaMailSender javaMailSender;

    @PostMapping("/sendEmail")
    public String sendEmail(@RequestBody EmailDetails details){
       try{
           // Creating a simple mail message
           SimpleMailMessage mailMessage
                   = new SimpleMailMessage();

           // Setting up necessary details
           mailMessage.setFrom(sender);
           mailMessage.setTo(details.getRecipient());
           mailMessage.setText(details.getMsgBody());
           mailMessage.setSubject(details.getSubject());

           // Sending the mail
           javaMailSender.send(mailMessage);
           return "Mail Sent Successfully...";
       }
       // Catch block to handle the exceptions
       catch (Exception e) {
           return "Error while Sending Mail"+e.getLocalizedMessage();
       }
    }

}