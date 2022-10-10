package com.learning.grpc.client;

import com.learning.grpc.HelloRequest;
import com.learning.grpc.HelloResponse;
import com.learning.grpc.HelloServiceGrpc;
import com.learning.grpc.HelloServiceGrpc.HelloServiceBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
  public static void main(String[] args) {
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
        .usePlaintext()
        .build();

    HelloServiceBlockingStub stub
        = HelloServiceGrpc.newBlockingStub(channel);

    HelloResponse helloResponse = stub.hello(HelloRequest.newBuilder()
        .setFirstName("Vari")
        .setLastName("Ang")
        .build());

    System.out.println(helloResponse.getGreeting());

    channel.shutdown();
  }
}
