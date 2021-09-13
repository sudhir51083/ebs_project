package com.capgemini.ebs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.ebs.entity.Consumer;

@Repository
public interface ConnectionRepositoty extends JpaRepository<Consumer, Long>{

}
