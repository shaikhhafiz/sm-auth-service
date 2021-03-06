package com.hafiz.sm.auth.repositories;

import com.hafiz.sm.auth.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    User findByUsername(String name);
    List<User> findAllByIdIn(Set<UUID> idSet);
}
