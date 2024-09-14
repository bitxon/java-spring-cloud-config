# Java Spring Cloud Config

## Run
```shell
./gradlew :config-server:bootRun --args='--spring.profiles.active=composite,classpath'
```
```shell
./gradlew :config-client:bootRun
```

---
## Test

```shell
curl 'http://localhost:8888/user-service/local/main'
```

```shell
curl 'http://localhost:8080/hello'
```


---
## Useful Links
[Config First Bootstrap](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#config-first-bootstrap)\
