package com.qhx.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.9.1)",
    comments = "Source: pos.proto")
public final class PosServiceGrpc {

  private PosServiceGrpc() {}

  public static final String SERVICE_NAME = "PosService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getNotifyHandleMethod()} instead.
  public static final io.grpc.MethodDescriptor<OrderNotifyRequestProto,
          com.qhx.proto.OrderNotifyResponseProto> METHOD_NOTIFY_HANDLE = getNotifyHandleMethod();

  private static volatile io.grpc.MethodDescriptor<OrderNotifyRequestProto,
          com.qhx.proto.OrderNotifyResponseProto> getNotifyHandleMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<OrderNotifyRequestProto,
          com.qhx.proto.OrderNotifyResponseProto> getNotifyHandleMethod() {
    io.grpc.MethodDescriptor<OrderNotifyRequestProto, com.qhx.proto.OrderNotifyResponseProto> getNotifyHandleMethod;
    if ((getNotifyHandleMethod = PosServiceGrpc.getNotifyHandleMethod) == null) {
      synchronized (PosServiceGrpc.class) {
        if ((getNotifyHandleMethod = PosServiceGrpc.getNotifyHandleMethod) == null) {
          PosServiceGrpc.getNotifyHandleMethod = getNotifyHandleMethod = 
              io.grpc.MethodDescriptor.<OrderNotifyRequestProto, com.qhx.proto.OrderNotifyResponseProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PosService", "NotifyHandle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OrderNotifyRequestProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.qhx.proto.OrderNotifyResponseProto.getDefaultInstance()))
                  .setSchemaDescriptor(new PosServiceMethodDescriptorSupplier("NotifyHandle"))
                  .build();
          }
        }
     }
     return getNotifyHandleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PosServiceStub newStub(io.grpc.Channel channel) {
    return new PosServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PosServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PosServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PosServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PosServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PosServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void notifyHandle(OrderNotifyRequestProto request,
                             io.grpc.stub.StreamObserver<com.qhx.proto.OrderNotifyResponseProto> responseObserver) {
      asyncUnimplementedUnaryCall(getNotifyHandleMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNotifyHandleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                OrderNotifyRequestProto,
                      com.qhx.proto.OrderNotifyResponseProto>(
                  this, METHODID_NOTIFY_HANDLE)))
          .build();
    }
  }

  /**
   */
  public static final class PosServiceStub extends io.grpc.stub.AbstractStub<PosServiceStub> {
    private PosServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PosServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PosServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PosServiceStub(channel, callOptions);
    }

    /**
     */
    public void notifyHandle(OrderNotifyRequestProto request,
                             io.grpc.stub.StreamObserver<com.qhx.proto.OrderNotifyResponseProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNotifyHandleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PosServiceBlockingStub extends io.grpc.stub.AbstractStub<PosServiceBlockingStub> {
    private PosServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PosServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PosServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PosServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.qhx.proto.OrderNotifyResponseProto notifyHandle(OrderNotifyRequestProto request) {
      return blockingUnaryCall(
          getChannel(), getNotifyHandleMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PosServiceFutureStub extends io.grpc.stub.AbstractStub<PosServiceFutureStub> {
    private PosServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PosServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PosServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PosServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.qhx.proto.OrderNotifyResponseProto> notifyHandle(
        OrderNotifyRequestProto request) {
      return futureUnaryCall(
          getChannel().newCall(getNotifyHandleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NOTIFY_HANDLE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PosServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PosServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NOTIFY_HANDLE:
          serviceImpl.notifyHandle((OrderNotifyRequestProto) request,
              (io.grpc.stub.StreamObserver<com.qhx.proto.OrderNotifyResponseProto>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PosServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PosServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.qhx.proto.PosProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PosService");
    }
  }

  private static final class PosServiceFileDescriptorSupplier
      extends PosServiceBaseDescriptorSupplier {
    PosServiceFileDescriptorSupplier() {}
  }

  private static final class PosServiceMethodDescriptorSupplier
      extends PosServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PosServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PosServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PosServiceFileDescriptorSupplier())
              .addMethod(getNotifyHandleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
