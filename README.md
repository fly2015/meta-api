# meta-api
Spring Boot Rest API with many as possible relevant modern technologies
- Spring Boot 3.2.3
- Java 17
- JWT
- ELK (elastic search, logstash, kibana)
- prometheus
- grafana
- Jenkin
- postgresdb/h2

## Run local
- Setting in pom.xml (default)

    <flyway.url>jdbc:h2:file:./metadb</flyway.url>
    <flyway.user>sa</flyway.user>
    <flyway.password></flyway.password> 
- mvn clean + package
- java -jar meta-api-0.0.1-SNAPSHOT-exec.jar
- access http://localhost:8080/swagger-ui/index.html#/

## Run full stack with docker compose
- Ref docker-compose.yml
