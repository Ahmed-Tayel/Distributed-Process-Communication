package com.grpcGenCode;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: grpcSer.proto")
public final class grpcSerGrpc {

  private grpcSerGrpc() {}

  public static final String SERVICE_NAME = "com.grpcGenCode.grpcSer";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.grpcGenCode.grpcSerRequest,
      com.grpcGenCode.grpcSerResponse> METHOD_GETSTATUS =
      io.grpc.MethodDescriptor.<com.grpcGenCode.grpcSerRequest, com.grpcGenCode.grpcSerResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.grpcGenCode.grpcSer", "getstatus"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpcGenCode.grpcSerRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpcGenCode.grpcSerResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static grpcSerStub newStub(io.grpc.Channel channel) {
    return new grpcSerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static grpcSerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new grpcSerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static grpcSerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new grpcSerFutureStub(channel);
  }

  /**
   */
  public static abstract class grpcSerImplBase implements io.grpc.BindableService {

    /**
     */
    public void getstatus(com.grpcGenCode.grpcSerRequest request,
        io.grpc.stub.StreamObserver<com.grpcGenCode.grpcSerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GETSTATUS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GETSTATUS,
            asyncUnaryCall(
              new MethodHandlers<
                com.grpcGenCode.grpcSerRequest,
                com.grpcGenCode.grpcSerResponse>(
                  this, METHODID_GETSTATUS)))
          .build();
    }
  }

  /**
   */
  public static final class grpcSerStub extends io.grpc.stub.AbstractStub<grpcSerStub> {
    private grpcSerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private grpcSerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected grpcSerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new grpcSerStub(channel, callOptions);
    }

    /**
     */
    public void getstatus(com.grpcGenCode.grpcSerRequest request,
        io.grpc.stub.StreamObserver<com.grpcGenCode.grpcSerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GETSTATUS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class grpcSerBlockingStub extends io.grpc.stub.AbstractStub<grpcSerBlockingStub> {
    private grpcSerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private grpcSerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected grpcSerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new grpcSerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpcGenCode.grpcSerResponse getstatus(com.grpcGenCode.grpcSerRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GETSTATUS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class grpcSerFutureStub extends io.grpc.stub.AbstractStub<grpcSerFutureStub> {
    private grpcSerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private grpcSerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected grpcSerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new grpcSerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpcGenCode.grpcSerResponse> getstatus(
        com.grpcGenCode.grpcSerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GETSTATUS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GETSTATUS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final grpcSerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(grpcSerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GETSTATUS:
          serviceImpl.getstatus((com.grpcGenCode.grpcSerRequest) request,
              (io.grpc.stub.StreamObserver<com.grpcGenCode.grpcSerResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class grpcSerDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpcGenCode.GrpcSer.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (grpcSerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new grpcSerDescriptorSupplier())
              .addMethod(METHOD_GETSTATUS)
              .build();
        }
      }
    }
    return result;
  }
}
