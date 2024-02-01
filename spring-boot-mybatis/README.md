
# SpringBoot使用JdbcTemplate

添加pom依赖

```xml
<!-- JDBC -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-jdbc</artifactId>
</dependency>

<!-- MySQL 驱动包-->
<!--MySQL Server 版本为 8.x时，mysql-connector-java使用5.1.35时会报错-->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.11</version>
</dependency>
```

application.yml中hikari数据源配置
```yaml
server:
  port: 9999

spring:
  datasource:
    #通用配置
    driver-class-name: com.mysql.jdbc.Driver
    password: root
    username: root
    url: jdbc:mysql://localhost:3306/learn?serverTimezone=Asia/Shanghai&useUnicode=true&charcterEncoding=UTF-8&useSSL=false
    #数据源连接池配置
    hikari:
      minimum-idle: 10
      maximum-pool-size: 20
      idle-timeout: 500000
      max-lifetime: 540000
      connection-timeout: 60000
      connection-test-query: select 1
```