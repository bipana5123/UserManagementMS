package com.tekarch.usermanagementservice.Repository;


import com.tekarch.usermanagementservice.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserModel, Long> {
}