package com.poc.templatepublisher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.poc.templatepublisher.entity.Templates;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemplatePublisherRepository extends JpaRepository<Templates, String> {

    @Query(value = "select Template_ID,Template_Name,Message_Type,Last_Updated_Time " +
            "from messageservicedb.Templates", nativeQuery = true)
    public List<Templates> getAllTemplates();

}
