package com.liming.file;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Liming
 */
@EnableSwaggerBootstrapUI
@SpringBootApplication
public class FileStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileStoreApplication.class, args);
    }

}
