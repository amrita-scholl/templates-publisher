package dto;

import com.poc.templatepublisher.model.Templates;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TemplateDto {

    Templates templates = new Templates();

}
