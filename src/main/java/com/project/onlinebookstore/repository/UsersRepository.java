package com.project.onlinebookstore.repository;

import com.project.onlinebookstore.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;


@RepositoryRestResource(collectionResourceRel="usersRepo", path="users")
public interface UsersRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByUsername(String username);
}
