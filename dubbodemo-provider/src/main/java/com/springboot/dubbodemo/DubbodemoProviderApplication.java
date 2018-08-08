package com.springboot.dubbodemo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan({"com.springboot.dubbodemo.mapper"})
@EnableDubboConfiguration //开启dubbo的自动配置
public class DubbodemoProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubbodemoProviderApplication.class, args);
	}
}
