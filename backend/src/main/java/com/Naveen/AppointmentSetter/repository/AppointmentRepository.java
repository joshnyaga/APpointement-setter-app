package com.Naveen.AppointmentSetter.repository;

import com.Naveen.AppointmentSetter.model.Appointments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointments, Integer> , JpaSpecificationExecutor<Appointments> {
    List<Appointments> findAllByUserId(long id);

}
