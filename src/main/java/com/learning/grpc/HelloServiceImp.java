package com.learning.grpc;

import com.learning.grpc.HelloServiceGrpc.HelloServiceImplBase;
import io.grpc.stub.StreamObserver;

public class HelloServiceImp extends HelloServiceImplBase {

  public HelloServiceImp() {}

  @Override
  public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
    String greeting = new StringBuilder()
        .append("Hello, ")
        .append(request.getFirstName())
        .append(" ")
        .append(request.getLastName())
        .toString();

    HelloResponse response = HelloResponse.newBuilder()
        .setGreeting(greeting)
        .build();

    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void hello() {}
}
