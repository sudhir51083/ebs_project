package com.capgemini.ebs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.capgemini.ebs.dto.User;
import com.capgemini.ebs.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	boolean existsByEmail(String email);

}
