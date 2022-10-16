package net.javaguides.springdataresttutorial.repository;

import net.javaguides.springdataresttutorial.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.*;

@RepositoryRestResource(path="members")
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByFirstName(@Param("firstName") String firstName);
}
