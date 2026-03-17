package com.kraiem.ecommerce.backend.repository;
import com.kraiem.ecommerce.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
/**
 * @author : Kraiem Brahim
 * @Project: backend
 * @Date : 17 3/17/2026 8:12 AM
 **/



public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
