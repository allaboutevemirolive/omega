package com.omega.watch.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.omega.watch.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {

    @EntityGraph(attributePaths = "roles")
    Optional<User> findByEmail(String email);

    @EntityGraph(attributePaths = "roles")
    Optional<User> findByActivationCode(String code);

    @Query("SELECT user.email FROM User user WHERE user.passwordResetCode = :code")
    Optional<String> findEmailByPasswordResetCode(@Param("code") String code);

    @EntityGraph(attributePaths = "roles")
    @Query("SELECT u FROM User u WHERE " +
            "(:searchType IS NULL OR UPPER(u.firstName) LIKE UPPER(CONCAT('%',:text,'%'))) OR " +
            "(:searchType IS NULL OR UPPER(u.lastName) LIKE UPPER(CONCAT('%',:text,'%'))) OR " +
            "(:searchType IS NULL OR UPPER(u.email) LIKE UPPER(CONCAT('%',:text,'%')))")
    Page<User> searchUsers(@Param("searchType") String searchType, @Param("text") String text, Pageable pageable);

    @EntityGraph(attributePaths = "roles")
    @Query("SELECT u FROM User u JOIN u.roles r WHERE r.name IN :roleNames")
    List<User> findByRoles_NameIn(@Param("roleNames") List<String> roleNames);

    boolean existsByEmailAndIdNot(String email, Long id);

    @Query("SELECT COUNT(u) FROM User u JOIN u.roles r WHERE r.name = :roleName")
    long countByRoles_Name(@Param("roleName") String roleName);

    @EntityGraph(attributePaths = "activationCode") // or "passwordResetCode"
    List<User> findByActivationCodeExpiryDateBefore(LocalDateTime dateTime);
}
