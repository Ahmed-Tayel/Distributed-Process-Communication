package com.implclasses;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import com.grpcGenCode.*;

public class grpcSerMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server;
        server = ServerBuilder
                .forPort(8080)
                .addService(new grpcSerImpl()).build();

        server.start();
        server.awaitTermination();
    }
}
