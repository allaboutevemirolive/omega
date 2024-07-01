package com.omega.watch.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.omega.watch.modal.User;

// mvn test -Dtest=UserRepositoryIntegrationTest
@DataJpaTest
class UserRepositoryIntegrationTest {

    // @Autowired
    // private UserRepository userRepository;

    // @Test
    // void testFindByEmailWithH2() {
    //     User user = new User();
    //     user.setEmail("test@example.com");
    //     userRepository.save(user);

    //     Optional<User> foundUser = userRepository.findByEmail("test@example.com");

    //     assertTrue(foundUser.isPresent());
    //     assertEquals("test@example.com", foundUser.get().getEmail());
    // }
}
