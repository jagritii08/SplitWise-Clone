
package com.splitwise.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.splitwise.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{}
