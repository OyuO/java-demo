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
    comments = "Source: pay.proto")
public final class PaymentServiceGrpc {

  private PaymentServiceGrpc() {}

  public static final String SERVICE_NAME = "PaymentService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getPrePayMethod()} instead.
  public static final io.grpc.MethodDescriptor<PrepayRequestProto,
          com.qhx.proto.WxPayInvokeProto> METHOD_PRE_PAY = getPrePayMethod();

  private static volatile io.grpc.MethodDescriptor<PrepayRequestProto,
          com.qhx.proto.WxPayInvokeProto> getPrePayMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<PrepayRequestProto,
          com.qhx.proto.WxPayInvokeProto> getPrePayMethod() {
    io.grpc.MethodDescriptor<PrepayRequestProto, com.qhx.proto.WxPayInvokeProto> getPrePayMethod;
    if ((getPrePayMethod = PaymentServiceGrpc.getPrePayMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getPrePayMethod = PaymentServiceGrpc.getPrePayMethod) == null) {
          PaymentServiceGrpc.getPrePayMethod = getPrePayMethod = 
              io.grpc.MethodDescriptor.<PrepayRequestProto, com.qhx.proto.WxPayInvokeProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PaymentService", "PrePay"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PrepayRequestProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.qhx.proto.WxPayInvokeProto.getDefaultInstance()))
                  .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("PrePay"))
                  .build();
          }
        }
     }
     return getPrePayMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PaymentServiceStub newStub(io.grpc.Channel channel) {
    return new PaymentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PaymentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PaymentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PaymentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PaymentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PaymentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void prePay(PrepayRequestProto request,
                       io.grpc.stub.StreamObserver<com.qhx.proto.WxPayInvokeProto> responseObserver) {
      asyncUnimplementedUnaryCall(getPrePayMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPrePayMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                PrepayRequestProto,
                      com.qhx.proto.WxPayInvokeProto>(
                  this, METHODID_PRE_PAY)))
          .build();
    }
  }

  /**
   */
  public static final class PaymentServiceStub extends io.grpc.stub.AbstractStub<PaymentServiceStub> {
    private PaymentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PaymentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PaymentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PaymentServiceStub(channel, callOptions);
    }

    /**
     */
    public void prePay(PrepayRequestProto request,
                       io.grpc.stub.StreamObserver<com.qhx.proto.WxPayInvokeProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPrePayMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PaymentServiceBlockingStub extends io.grpc.stub.AbstractStub<PaymentServiceBlockingStub> {
    private PaymentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PaymentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PaymentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PaymentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.qhx.proto.WxPayInvokeProto prePay(PrepayRequestProto request) {
      return blockingUnaryCall(
          getChannel(), getPrePayMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PaymentServiceFutureStub extends io.grpc.stub.AbstractStub<PaymentServiceFutureStub> {
    private PaymentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PaymentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected PaymentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PaymentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.qhx.proto.WxPayInvokeProto> prePay(
        PrepayRequestProto request) {
      return futureUnaryCall(
          getChannel().newCall(getPrePayMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PRE_PAY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PaymentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PaymentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PRE_PAY:
          serviceImpl.prePay((PrepayRequestProto) request,
              (io.grpc.stub.StreamObserver<com.qhx.proto.WxPayInvokeProto>) responseObserver);
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

  private static abstract class PaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PaymentServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.qhx.proto.PayProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PaymentService");
    }
  }

  private static final class PaymentServiceFileDescriptorSupplier
      extends PaymentServiceBaseDescriptorSupplier {
    PaymentServiceFileDescriptorSupplier() {}
  }

  private static final class PaymentServiceMethodDescriptorSupplier
      extends PaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PaymentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PaymentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PaymentServiceFileDescriptorSupplier())
              .addMethod(getPrePayMethod())
              .build();
        }
      }
    }
    return result;
  }
}
