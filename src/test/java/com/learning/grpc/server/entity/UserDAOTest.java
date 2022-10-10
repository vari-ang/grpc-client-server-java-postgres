package com.learning.grpc.server.entity;

import static org.junit.Assert.*;

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
}