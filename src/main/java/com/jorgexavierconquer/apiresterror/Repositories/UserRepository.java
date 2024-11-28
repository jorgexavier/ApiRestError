package com.jorgexavierconquer.apiresterror.Repositories;

import com.jorgexavierconquer.apiresterror.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
