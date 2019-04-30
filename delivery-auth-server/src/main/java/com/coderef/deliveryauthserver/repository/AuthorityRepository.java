package com.coderef.deliveryauthserver.repository;

import com.coderef.deliveryauthserver.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String>{
	
	Authority findByName(String name);
	
}