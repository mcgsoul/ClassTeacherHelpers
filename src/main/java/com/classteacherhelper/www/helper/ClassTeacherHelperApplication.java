package com.classteacherhelper.www.helper;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan(basePackages = "com.classteacherhelper.www.helper.dao")
public class ClassTeacherHelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClassTeacherHelperApplication.class, args);
    }

}
