
# 前置准备

## 引入 Spring Boot Starter 父工程

```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.1.3-RELEASE</version>
    <relativePath/>
</parent>
```

## 添加阿里云镜像

```xml
<repositories>
    <repository>
        <id>nexus-aliyun</id>
        <name>nexus-aliyun</name>
        <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
        <releases>
            <enabled>true</enabled>
        </releases>
        <snapshots>
            <enabled>false</enabled>
        </snapshots>
    </repository>
</repositories>

<pluginRepositories>
    <pluginRepository>
        <id>public</id>
        <name>aliyun nexus</name>
        <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
        <releases>
            <enabled>true</enabled>
        </releases>
        <snapshots>
            <enabled>false</enabled>
        </snapshots>
    </pluginRepository>
</pluginRepositories>
```

# 方法一：SpringBoot 使用 JdbcTemplate

## 添加pom依赖

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

## application.yml中hikari数据源配置
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

## 测试

```java
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(value = SpringRunner.class)
@SpringBootTest(classes = SpringBootMybatisApplication.class)
public class SpringBootMybatisApplicationTests {

}

--------------------

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class JdbcTemplateTest extends SpringBootMybatisApplicationTests {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void contextLoads() {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from user");
        System.out.println(maps);
    }

}
```

# 方法二：SpringBoot 使用 mybatis

> [springboot集成mybatis](https://cloud.tencent.com/developer/article/2102778)  
> [springboot集成mybatis](https://cloud.tencent.com/developer/article/2371895?areaId=106001)

## 添加pom依赖

```xml
<!-- MyBatis -->
<dependency>
    <groupId>org.mybatis.spring.boot</groupId>
    <artifactId>mybatis-spring-boot-starter</artifactId>
    <version>2.2.0</version>
</dependency>

<!-- MySQL 驱动包-->
<!--MySQL Server 版本为 8.x时，mysql-connector-java使用5.1.35时会报错-->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.11</version>
</dependency>
```

## application.yml中数据源和mybatis配置

```yaml
spring:
  datasource:
    #通用配置
    driver-class-name: com.mysql.jdbc.Driver
    password: root
    username: root
    url: jdbc:mysql://localhost:3306/learn?serverTimezone=Asia/Shanghai&useUnicode=true&charcterEncoding=UTF-8&useSSL=false

mybatis:
  mapper-locations: com/programmer/springboot/mybatis/mapper
```

## mapper接口和xml生成




# 方法三：SpringBoot 使用 mybatis-plus

> [mybatis-plus官方文档](https://baomidou.com/pages/779a6e/#%E5%BF%AB%E9%80%9F%E5%85%A5%E9%97%A8)

## 配置依赖 pom
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

<!-- mybatis-plus 依赖包-->
<dependency>
    <groupId>com.baomidou</groupId>
    <artifactId>mybatis-plus-boot-starter</artifactId>
    <version>3.5.5</version>
</dependency>
```

## 配置 application.yml 连接数据库

```yaml
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

## 使用 mybatis-plus 进行映射

## 创建 UserPO 实体

使用 mybatis-plus 进行映射

```
```

## 创建 XXXMapper 类


## 在启动类增加注解 @MapperScan("Mapper类所在的包名")

这里 @MapperScan 配置的路径下的 mapper 类会被mybatis识别并生成代理类



