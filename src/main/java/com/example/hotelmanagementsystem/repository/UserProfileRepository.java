package com.example.hotelmanagementsystem.repository;

import com.example.hotelmanagementsystem.model.UserProfile;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile,Long> {



        Optional<UserProfile> findByEmail(String email);
}
