## Setup
### Install Kafka on Mac
```
$ brew install kafka
```

### Start Zoo Keeper
```
$ zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties
```

### Start Kafka Server
```
$ kafka-server-start /usr/local/etc/kafka/server.properties
```

### Create Topic
```
$ kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka-Demo
```

### Start consumer 
```
kafka-console-consumer --bootstrap-server localhost:9092 --topic Kafka-Demo --from-beginning
```


## Running the Application
```
mvn spring-boot:run
```

## References
* [Spring Kafka Docs](https://docs.spring.io/spring-kafka/docs/current/reference/html/#introduction) <br>
* [Kafka Fundamentals](https://www.youtube.com/watch?v=B5j3uNBH8X4)
