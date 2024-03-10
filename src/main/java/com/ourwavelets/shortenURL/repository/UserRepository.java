package com.ourwavelets.shortenURL.repository;

import com.ourwavelets.shortenURL.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
