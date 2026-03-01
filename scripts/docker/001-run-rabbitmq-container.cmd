@echo off
docker run -d --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management

echo 5672 - AMQP port which connects to Spring Boot
echo 15672 - web UI (http://localhost:15672)
echo login: guest / guest