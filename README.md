# Java Spring Cloud Config

## Run

**Note: Open `application-file.yaml` and make sure it contains valid path to config files**

```shell
docker compose up
```
```shell
./gradlew :config-server:bootRun --args='--spring.profiles.active=composite,file'
```
```shell
./gradlew :config-client:bootRun
```

---
## Test

1. Send Request
    ```shell
    curl 'http://localhost:8080/hello'
    ```
2. Manually Update any user-service related file for example `/configs/user-service/application-local.yaml`
3. Send Request
    ```shell
    curl 'http://localhost:8080/hello'
    ```
4. Check that response contains updated values
5. Also you can check refresh messages in [Kafka-UI](http://localhost:9000)

## Additional requests
Get Configuration from Config Server 
```shell
curl 'http://localhost:8888/user-service/local/main'
```
Manually trigger Config Server Refresh
```shell
curl -X POST 'http://localhost:8888/monitor?path=user-service' -d '{}'
```


---
## Useful Links
[Config First Bootstrap](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#config-first-bootstrap)\
