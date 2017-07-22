package jp.a2kaido.grpc.service

import io.grpc.stub.StreamObserver
import jp.a2kaido.helloworld.GreeterGrpc
import jp.a2kaido.helloworld.HelloReply
import jp.a2kaido.helloworld.HelloRequest
import org.lognet.springboot.grpc.GRpcService

/**
 * Created by anikaido on 2017/07/22.
 */
@GRpcService
class HelloService : GreeterGrpc.GreeterImplBase() {

    override fun sayHello(request: HelloRequest?, responseObserver: StreamObserver<HelloReply>?) {
        val reply = HelloReply.newBuilder().setMessage("Hello " + request?.name).build()
        responseObserver?.onNext(reply)
        responseObserver?.onCompleted()
    }
}