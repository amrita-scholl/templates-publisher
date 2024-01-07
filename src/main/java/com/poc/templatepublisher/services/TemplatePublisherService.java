package com.poc.templatepublisher.services;

import com.poc.templatepublisher.entity.Templates;
import com.poc.templatepublisher.repository.TemplatePublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemplatePublisherService {

    TemplatePublisherRepository templatePublisherRepository;

    @Autowired
    public TemplatePublisherService(TemplatePublisherRepository templatePublisherRepository) {
        this.templatePublisherRepository = templatePublisherRepository;
    }
    public List<Templates> getAllTemplates(){

        List<Templates> data = templatePublisherRepository.getAllTemplates();

        return data;
    }

}
