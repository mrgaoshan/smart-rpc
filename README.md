# smart-rpc


### 主要用到的组件

Spring  

Netty：它使 NIO 编程更加容易，屏蔽了 Java 底层的 NIO 细节。  

Protostuff：它基于 Protobuf 序列化框架，面向 POJO，无需编写 .proto 文件。  

ZooKeeper：提供服务注册与发现功能，开发分布式系统的必备选择，同时它也具备天生的集群能力。  


### 实现流程以及步骤

#### 1. rpc-sample-api :编写服务为接口包，将该接口放在独立的客户端 jar 包中，提供给客户端使用，访问接口

#### 2. rpc-smaple-server :   
a. 编写服务接口实现类，实现了 rpc-smaple-api 的接口  
b. @RpcService注解定义在服务接口的实现类上，需要对该实现类指定远程接口，  
因为实现类可能会实现多个接口，一定要告诉框架哪个才是远程接口。  
c.  加入 spring.xml 配置   配置服务注册组件 和 RPC 服务器
d. 运行RpcBootstrap类的main方法即可启动服务端

#### 3. rpc-regist 提供了服务注册的接口，包含服务名，服务地址.  rpc-regist-zookper ,通过zookeeper 实现了服务注册的功能


#### 4. rpc-server RPC 服务器（用于发布 RPC 服务）


#### 5.
