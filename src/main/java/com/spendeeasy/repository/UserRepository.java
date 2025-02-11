package com.spendeeasy.repository;

	import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spendeeasy.entity.Users;
@Repository
	public interface UserRepository extends JpaRepository<Users, Long> {
	    // Custom query method to find user by email
	    Users findByEmail(String email);
	}

