package com.poc.templatepublisher.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name="TEMPLATES")
public class Templates  implements Serializable {

    @Serial
    private static final long serialVersionUID=0;

    @Id
    @Column(name="Template_Id")
    private String templateId;

    @Column(name="Template_Name")
    private String templateName;

    @Column(name="Message_Type")
    private String message_Type;

    @Column(name="Last_Updated_Time")
    private Timestamp lastUpdatedTime;
}
