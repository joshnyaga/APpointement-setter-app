package com.Naveen.AppointmentSetter.controller;

import com.Naveen.AppointmentSetter.exception.ResourceNotFoundException;
import com.Naveen.AppointmentSetter.model.Appointments;
import com.Naveen.AppointmentSetter.model.EmailDetails;
import com.Naveen.AppointmentSetter.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins= {"http://localhost:3000"}, allowCredentials = "true" )
@RestController
@RequestMapping("/api/v1")
public class AppointmentsController {


    @Autowired
    private AppointmentRepository appointmentRepository;

    @GetMapping("/appointments")
    public List<Appointments> getAllAppointments(){
        return  appointmentRepository.findAll();
    }

    @PostMapping("/appointments")
    public ResponseEntity<Appointments> addAppointment(@RequestBody Appointments appointments){
        Appointments appointments1 = appointmentRepository.save(appointments);
        ;
        return ResponseEntity.ok(appointments1);
    }

    @GetMapping("/appointments/{id}")
    public ResponseEntity<Appointments> getAppointmentById(@PathVariable int id){
        Appointments appointments = appointmentRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Appointment with given id does not exist"));
        return ResponseEntity.ok(appointments);

    }
    @GetMapping("/appointments/users/{id}")
    public List<Appointments> getAppointmentByUserId(@PathVariable long id){
        return appointmentRepository.findAllByUserId(id);



    }
    @PutMapping("/appointments/{id}")
    public ResponseEntity<Appointments> updateAppointment( @PathVariable int id,@RequestBody Appointments appointmentDetails){
        Appointments appointments = appointmentRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Appointment with given id does not exist"));
        appointments.setBankName(appointmentDetails.getBankName());
        appointments.setBankLocation(appointmentDetails.getBankLocation());
        appointments.setPurpose(appointmentDetails.getPurpose());
        appointments.setDate(appointmentDetails.getDate());
        appointments.setTime(appointmentDetails.getTime());
        appointments.setUserId((appointmentDetails.getUserId()));
        appointments.setUserName((appointmentDetails.getUserName()));
        appointments.setUserEmail((appointmentDetails.getUserEmail()));
        appointments.setStatus((appointmentDetails.getStatus()));

        Appointments updatedAppointment = appointmentRepository.save(appointments);
        return ResponseEntity.ok(updatedAppointment);
    }
    @DeleteMapping("/appointments/{id}")
    public ResponseEntity<Map<String, String>> deleteAppointment(@PathVariable int id){
        Appointments appointments = appointmentRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Appointment with given id does not exist"));
        appointmentRepository.delete(appointments);
        Map<String, String> response = new HashMap<>();
        response.put("Message", "Appointment deleted successfully");
        return ResponseEntity.ok(response);
    }
}
