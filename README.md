# kotlin-springboot-grpc-sample

KotlinでSpringbootでgRPCするよ


## 動作確認

- サーバー起動
```
./gradlew clean generateProto bootRun
```

- クライアントから叩く
```
echo "{'name': 'world'}" | java -jar ~/polyglot.jar --command=call --endpoint=localhost:6565 --full_method=helloworld.Greeter/SayHello --proto_discovery_root=src/main/proto/ --use_tls=false
```

## gRPCクライアントツール
https://github.com/grpc-ecosystem/polyglot
