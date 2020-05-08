package com.youtube_ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youtube_ecommerce.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

	Optional<User> findByMobile(String mobile);
}
