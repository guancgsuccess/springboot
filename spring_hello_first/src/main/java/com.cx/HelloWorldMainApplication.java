package com.cx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 或者使用
 * Spring Boot Maven插件包含一个run可用于快速编译和运行应用程序的目标。应用程序以分解形式运行，就像在IDE中一样。以下示例显示了运行Spring Boot应用程序的典型Maven命令：
 *
 * mvn spring-boot：run
 *
 * @SpringBootAppication来标注一个主程序类,说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication{
    public static void main(String[] args) {
        //Spring应用启动
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
