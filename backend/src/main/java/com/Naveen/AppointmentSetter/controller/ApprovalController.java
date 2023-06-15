package com.Naveen.AppointmentSetter.controller;

import com.Naveen.AppointmentSetter.exception.ResourceNotFoundException;
import com.Naveen.AppointmentSetter.model.Approval;
import com.Naveen.AppointmentSetter.model.Branch;
import com.Naveen.AppointmentSetter.repository.ApprovalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins= {"http://localhost:3000"}, allowCredentials = "true" )
@RestController
@RequestMapping("/api/v1")
public class ApprovalController {
    @Autowired
    private ApprovalRepository approvalRepository;

    @GetMapping("/approval")
    public List<Approval> getAllApprovals(){
        return approvalRepository.findAll();
    }

    @PostMapping("/approval")
    public Approval addApproval(@RequestBody Approval approval){
        return approvalRepository.save(approval);
    }
    @GetMapping("/approval/{id}")
    public ResponseEntity<Approval> getApprovalByid(@PathVariable int id){
        Approval approval = approvalRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Approval with the specifies id not found"));
        return ResponseEntity.ok(approval);
    }
    @PutMapping("/approval/{id}")
    public ResponseEntity<Approval> updateApproval(@RequestBody Approval approvalDetails, @PathVariable int id){
        Approval approval = approvalRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Approval with the specifies id not found"));
        approval.setApproved(approvalDetails.getApproved());
        approval.setAppointmentId(approvalDetails.getAppointmentId());
        approval.setComment(approvalDetails.getComment());
        return ResponseEntity.ok(approval);
    }
    @DeleteMapping("/approval/{id}")
    public ResponseEntity<Map<String, String>> deleteApproval(@PathVariable int id){
        Approval approval = approvalRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Approval with the specifies id not found"));
        approvalRepository.delete(approval);
        Map<String, String> response = new HashMap<>();
        response.put("Message","Approval Deleted successfully");
        return ResponseEntity.ok(response);
    }

}
