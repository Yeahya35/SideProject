package com.userservice.test.fakeRepo;

import com.userservice.entity.User;
import com.userservice.enums.Role;
import com.userservice.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

class UserRepositoryTest {

    @Autowired
    private UserRepository underTest;

    @Test
    public void checkFindByEmail() {
        User user = new User();
        user.setEmail("yahya@mail");
        user.setRole(Role.ROLE_USER);
        user.setName("yahya");
        user.setPhoneNumber("3456543");
        user.setStatus(Boolean.FALSE);

        underTest.save(user);
        String email = "yahya@mail";
        User user1 = underTest.findByEmail(email);

        assertThat(user1).isNotNull();

    }


}