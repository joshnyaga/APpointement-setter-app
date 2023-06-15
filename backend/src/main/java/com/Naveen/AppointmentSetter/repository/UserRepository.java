package com.Naveen.AppointmentSetter.repository;


import com.Naveen.AppointmentSetter.model.Login;
import com.Naveen.AppointmentSetter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);

    @Query(value = "SELECT * FROM users WHERE user_email = ?1", nativeQuery = true)
    User findByEmailAddress(String emailAddress);
    @Query(value = "SELECT * FROM users WHERE is_bank = 1", nativeQuery = true)
    List<User> findAllBanks();
}
