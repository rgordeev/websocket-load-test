# websocketloadtest

Для проверки возможности подключения к ендпойнтам приложения
сценария Gatling необходимо выполнить ряд шагов:

- Запустить keycloak. Для этого надо перейти в директорию с манифестами docker-compose, выполнив

```
cd src/main/docker/
```

далее запустить сервис, выполнив

```
docker-compose -f keycloak.yml up -d
```

- Запустить приложение из IDE (желательно в режиме отладки)
- Выполнить сценарий нагрузки

```
/src/test/scala/gatling/simulations/ru/rgordeev/WsSimulation

./gradlew gatlingRun-ru.targetcall.WsSimulation
```
