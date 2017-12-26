# smart-rpc 基于Springboot+zookeeper 分布式RPC框架


### 主要用到的组件

Spring-boot;

Netty：它使 NIO 编程更加容易，屏蔽了 Java 底层的 NIO 细节。  

Protostuff：它基于 Protobuf 序列化框架，面向 POJO，无需编写 .proto 文件。  

ZooKeeper：提供服务注册与发现功能，开发分布式系统的必备选择，同时它也具备天生的集群能力。  

-----
### 各个模块说明
##### rpc-sample-api:定义RPC服务的接口 （如：HelloService）.   
##### rpc-sample-provider : 实现 rpc-sample-api ,对外提供服务.  
##### rpc-sample-client:  调用远程服务，即 rpc-sample-provider 提供的服务. 
  
##### rpc-common:  框架基础类，包含序列化工具类， RPC 编码器/解码器，RPC 通用请求/响应类
##### rpc-registry-discovery:  框架服务注册与发现接口的定义，可以自定义实现服务注册与发现接口（如zookeeper，redis等），该框架用的zookeeper实现
##### rpc-registry-discovery-zookeeper: 使用zookeeper实现服务注册发现接口 rpc-registry-discovery
##### rpc-server:  rpc 服务器，用于发布 RPC 服务
##### rpc-client:  rpc 客户端，用于发送 RPC 请求

------
### 如何使用：

#### 0.   使用maven打包 smart-rpc pom.xml ， mvn clean install package.

#### 1.   rpc-smaple-provider, 修改appllcation.properties  定义服务的端口，zookeeper的地址 ，启动 RpcBootStrapApplication. 发布服务

#### 2.   rpc-sample-client , 修改appllcation.properties  定义服务起的端口，zookeeper的地址 ，启动 ClientApplication.  调用服务

#### 3. 浏览器访问，查看如 ：http://localhost:9000/test , 即可查看RPC调用结果。

-------
### 流程图

![](https://github.com/mrgaoshan/smart-rpc/raw/master/rpc-sample-api.png)


