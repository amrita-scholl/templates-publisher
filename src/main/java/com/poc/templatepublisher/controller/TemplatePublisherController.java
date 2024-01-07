package com.poc.templatepublisher.controller;

import com.poc.templatepublisher.entity.Templates;
import com.poc.templatepublisher.services.TemplatePublisherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class TemplatePublisherController {

    private final TemplatePublisherService templatePublisherService;

    @GetMapping("/getAllTemplates")
    public  ResponseEntity getCustomerData(){
        List<Templates> data = templatePublisherService.getAllTemplates();

        for(Templates templates:data) {
            log.info(" data from table : {}", templates);
        }

        return new ResponseEntity<>("success", HttpStatus.OK);
    }

}
