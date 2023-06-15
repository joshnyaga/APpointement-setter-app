package com.Naveen.AppointmentSetter.controller;

import com.Naveen.AppointmentSetter.exception.ResourceNotFoundException;
import com.Naveen.AppointmentSetter.model.Login;
import com.Naveen.AppointmentSetter.model.User;
import com.Naveen.AppointmentSetter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins= {"http://localhost:3000"}, allowCredentials = "true" )
@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserRepository userRepository;


    //get all users
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return  userRepository.findAll();
    }
    @PostMapping("/users")
    public User registerUser(@RequestBody User user){
        return userRepository.save(user);
    }


    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        User user = userRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("User does not exist with id "+id));
        return ResponseEntity.ok(user);
    }
    @GetMapping("/banks")
    public List<User> getBank(){
        return userRepository.findAllBanks();
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateEmployee(@PathVariable Long id, @RequestBody User userDetails){
        User user = userRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("User does not exist with id "+id));
        user.setUsername(userDetails.getUsername());
        user.setEmail(userDetails.getEmail());
        user.setPassword(userDetails.getPassword());
        user.setBank(userDetails.getBank());

        User updatedUser = userRepository.save(user);
        return ResponseEntity.ok(updatedUser);

    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
        User user = userRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("User does not exist with id "+id));

        userRepository.delete(user);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}
