# JPA-Hibernate

**Step1**：添加依赖

*pom.xml*

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
</dependency>
```



**Step2**：配置文件

*applications.yml*

```yml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/randomlink_test
    username: randomlink
    password: linkstart
    driver-class-name: com.mysql.cj.jdbc.Driver
  
  jackson:
    serialization: 
      indent-output:
        true

  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
```

