package com.learning.grpc.server.entity;

import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserDAO implements DAO {

  EntityManagerFactory entityManagerFactory;
  EntityManager entityManager;

  public UserDAO() {
    entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
    entityManager = entityManagerFactory.createEntityManager();
  }

  @Override
  public List getAllUsers() {
    return null;
  }

  @Override
  public Optional getUser(String id) {
    return Optional.empty();
  }

  @Override
  public void create(Object o) {
    User user = (User) o;

    System.out.println("Starting Transaction");
    entityManager.getTransaction().begin();

    System.out.println("Saving User to Database");

    entityManager.persist(user);
    entityManager.getTransaction().commit();

    // close the entity manager
    entityManager.close();
    entityManagerFactory.close();
  }

  @Override
  public void update(Object o) {

  }

  @Override
  public void delete(Object o) {

  }
}
