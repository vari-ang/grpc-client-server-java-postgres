package com.learning.grpc.server.entity;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import org.junit.Test;

public class UserDAOTest {

  @Test
  public void create() {
    UserDAO u = new UserDAO();

    User user = new User();
    user.setId(new Random().nextInt(1000000));
    user.setName("Joni");
    user.setAge(15);

    u.create(user);
  }

  @Test
  public void getUser() {
    UserDAO u = new UserDAO();

    int randomId = new Random().nextInt(1000000);

    User user = new User();
    user.setId(randomId);
    user.setName("Joni");
    user.setAge(15);
    u.create(user);

    Optional userFound = u.getUser(randomId);

    assertTrue(userFound.isPresent());
  }

  @Test
  public void getAllUsers() {
    UserDAO u = new UserDAO();

    List<User> users = u.getAllUsers();

    assertFalse(users.isEmpty());
  }
}