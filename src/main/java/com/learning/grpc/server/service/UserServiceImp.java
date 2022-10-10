package com.learning.grpc.server.service;

import com.google.protobuf.Empty;
import com.learning.grpc.GeneralResponse;
import com.learning.grpc.UserObj;
import com.learning.grpc.UserRequest;
import com.learning.grpc.UserServiceGrpc.UserServiceImplBase;
import com.learning.grpc.UsersResponse;
import com.learning.grpc.server.entity.User;
import com.learning.grpc.server.entity.UserDAO;
import io.grpc.stub.StreamObserver;

public class UserServiceImp extends UserServiceImplBase {

  UserDAO userDao;

  public UserServiceImp() {
    this.userDao = new UserDAO();
  }

  @Override
  public void getAllUsers(Empty emptyReq, StreamObserver<UsersResponse> UsersResponse) {

  }

  @Override
  public void getUser(UserRequest request, StreamObserver<UserObj> responseObserver) {

  }

  @Override
  public void create(UserObj request, StreamObserver<GeneralResponse> responseObserver) {
    User user = new User();
    user.setId(request.getId());
    user.setName(request.getName());
    user.setAge(request.getAge());

    userDao.create(user);
  }

  @Override
  public void update(UserObj request, StreamObserver<GeneralResponse> responseObserver) {

  }

  @Override
  public void delete(UserRequest request, StreamObserver<GeneralResponse> responseObserver) {

  }
}
