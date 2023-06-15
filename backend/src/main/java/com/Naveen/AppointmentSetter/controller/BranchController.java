package com.Naveen.AppointmentSetter.controller;

import com.Naveen.AppointmentSetter.exception.ResourceNotFoundException;
import com.Naveen.AppointmentSetter.model.Appointments;
import com.Naveen.AppointmentSetter.model.Branch;
import com.Naveen.AppointmentSetter.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins= {"http://localhost:3000"}, allowCredentials = "true" )
@RestController
@RequestMapping("/api/v1")
public class BranchController {
    @Autowired
    private BranchRepository branchRepository;

    @GetMapping("/branch")
    public List<Branch> getAllBranches(){
        return branchRepository.findAll();
    }
    @GetMapping("/branch/user/{id}")
    public List<Branch> getBranchesByUser(@PathVariable  long id){
        return branchRepository.findBranchByBank(id);
    }
    @PostMapping("/branch")
    public Branch addBranch(@RequestBody Branch branch){
        return branchRepository.save(branch);
    }
    @GetMapping("/branch/{id}")
    public ResponseEntity<Branch> getBranchByid(@PathVariable int id){
        Branch branch = branchRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Branch with the specifies id not found"));
        return ResponseEntity.ok(branch);
    }
    @PutMapping("/branch/{id}")
    public ResponseEntity<Branch> updateBranch(@PathVariable int id, @RequestBody Branch branchDetails){
        Branch branch = branchRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Branch with given id does not exist"));
        branch.setBranchName(branchDetails.getBranchName());
        branch.setContact(branchDetails.getContact());
        branch.setLocation(branchDetails.getLocation());
        branch.setUserId(branchDetails.getUserId());
        branch.setNote(branchDetails.getNote());


        Branch updatedBranch = branchRepository.save(branch);
        return ResponseEntity.ok(updatedBranch);
    }
    @DeleteMapping("/branch/{id}")
    public ResponseEntity<Map<String, String>> deleteBranch(@PathVariable int id){
        Branch branch = branchRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Branch with the specifies id not found"));
        branchRepository.delete(branch);
        Map<String, String> response = new HashMap<>();
        response.put("Message","Branch Deleted successfully");
        return ResponseEntity.ok(response);
    }
}
