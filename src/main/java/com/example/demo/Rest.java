package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Rest {

    private static final Logger logger = LoggerFactory.getLogger(Rest.class);

    @GetMapping("/logs")
    @ResponseStatus(value = HttpStatus.OK)
    public String getAssetStatuses() {

        logger.info("Test pasha App 1.3");
        return "Test logging 1.3";
    }

}
