package com.GRPCClient;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.grpcGenCode.grpcSerRequest;
import com.grpcGenCode.grpcSerResponse;
import com.grpcGenCode.grpcSerGrpc;

public class GRPCClient {
    String op = null;
    public String start_grpc(int tag){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        grpcSerGrpc.grpcSerBlockingStub stub
                = grpcSerGrpc.newBlockingStub(channel);

        grpcSerResponse grpcResponse = stub.getstatus(grpcSerRequest.newBuilder()
                .setIpTag(String.valueOf(tag))
                .build());
        op = "pkgname: " + grpcResponse.getPkg() + ", Tag: " + grpcResponse.getOpTag() + ", Status: " + grpcResponse.getStatus();
        return op;
    }
}
