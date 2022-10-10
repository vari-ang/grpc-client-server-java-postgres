package com.learning.grpc.server;

import com.learning.grpc.HelloServiceImp;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

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
