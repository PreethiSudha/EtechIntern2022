package com.example.demo.ifaces.bidirectional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.bidirectional.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {

}
