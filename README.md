# RabbitMQ example project

## Clone
```
git clone https://github.com/martinsladek/rabbitmqexample.git
```

## Build
```
mvn clean install
```

## Run with RabbitMQ in Docker
```
cd scripts
cd docker
001-run-rabbitmq-container.cmd
002-web-ui.cmd
003-run-spring-app.cmd
004-send-message.cmd
005-stop-rabbitmq-container.cmd
```

## Run with RabbitMQ in Docker Compose
```
cd scripts
cd docker-compose
001-run-rabbitmq-compose.cmd
002-web-ui.cmd
003-run-spring-app.cmd
004-send-message.cmd
005-stop-rabbitmq-compose.cmd
```

## Run only Spring Boot app
(The app requires running RabbitMQ - see previous Docker scenarios)
```
mvn spring-boot:run
```

