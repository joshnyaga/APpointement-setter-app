package com.Naveen.AppointmentSetter.repository;

import com.Naveen.AppointmentSetter.model.Appointments;
import com.Naveen.AppointmentSetter.model.Branch;
import com.Naveen.AppointmentSetter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer> {

    @Query(value = "SELECT * FROM branch WHERE user_id = ?1", nativeQuery = true)
    List<Branch> findBranchByBank(long id);

}
