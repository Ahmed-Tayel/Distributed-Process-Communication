package com.implclasses;
import com.grpcGenCode.*;
import com.grpcGenCode.grpcSerGrpc.grpcSerImplBase;
import com.grpcGenCode.grpcSerRequest;
import com.grpcGenCode.grpcSerResponse;
import io.grpc.stub.StreamObserver;

public class grpcSerImpl extends grpcSerImplBase {
    @Override
    public void getstatus(grpcSerRequest request, StreamObserver<grpcSerResponse> responseObserver) {
        String tag = request.getIpTag();
        grpcSerResponse response = grpcSerResponse.newBuilder().setOpTag(tag)
                .setPkg("grpc")
                .setStatus("Confirmed")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}