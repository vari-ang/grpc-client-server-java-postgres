package com.learning.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GrpcServer {
  public static void main(String[] args) {
    Server server = ServerBuilder
        .forPort(8080)
        .addService(new HelloServiceImp()).build();

    try {
      server.start();
      server.awaitTermination();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
