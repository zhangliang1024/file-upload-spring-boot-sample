package com.zhliang.pzy.file.upload;

import com.zhliang.pzy.file.config.EnableFileupLoad;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableFileupLoad
@SpringBootApplication(scanBasePackages = {"com.zhliang.pzy.file"})
public class FileUploadSpringBootStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileUploadSpringBootStarterApplication.class, args);
    }

}
