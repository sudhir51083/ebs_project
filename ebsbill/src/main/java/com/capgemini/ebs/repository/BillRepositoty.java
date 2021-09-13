package com.capgemini.ebs.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.ebs.entity.Bill;

@Repository
public interface BillRepositoty extends JpaRepository<Bill, Long>{

	Optional<Bill> findByConsumerNumber(long consumerNumber); //extends JpaRepository<EnergyBill, Long>{

	Optional<Bill> findByBillNumber(long billNumber);

}
