package com.lemndo.devicemanage;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSwaggerBootstrapUI
@SpringBootApplication
@MapperScan("com/lemndo/devicemanage/mapper")
public class ManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageApplication.class, args);
		System.out.println("| ---------------------------------------------------------------------------------- |");
		System.out.println("|                                    Started Success                                 |");
		System.out.println("| ---------------------------------------------------------------------------------- |");
	}

}
