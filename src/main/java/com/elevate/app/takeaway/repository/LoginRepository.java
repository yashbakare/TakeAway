package com.elevate.app.takeaway.repository;

import com.elevate.app.takeaway.dto.user.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<UserLogin, Long> {
}
