package com.capgemini.ebs.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.ebs.dto.EnergyBill;

@Repository
public interface BillRepositoty extends JpaRepository<EnergyBill, Long>{ //extends JpaRepository<EnergyBill, Long>{

}
