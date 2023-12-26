package com.ecore.example.mapper;

import com.ecore.example.model.Template;
import com.ecore.example.ports.input.dto.CreateTemplateCommand;
import com.ecore.example.ports.output.dto.CreateTemplateResponse;
import org.springframework.stereotype.Component;

@Component
public class TemplateDataMapper {


    public Template createTemplateCommandToTemplate(CreateTemplateCommand createTemplateCommand) {
        return new Template();
    }

    public CreateTemplateResponse templateToCreateTemplateResponse(Template template) {
        return new CreateTemplateResponse();
    }
}
