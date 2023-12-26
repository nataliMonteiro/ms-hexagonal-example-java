package com.ecore.example.mapper;

import com.ecore.example.entity.TemplateEntity;
import com.ecore.example.model.Template;
import org.springframework.stereotype.Component;

@Component
public class TemplateDataAccessMapper {

    public TemplateEntity templateToTemplateEntity(Template template) {
        return new TemplateEntity();
    }

    public Template templateEntityToTemplate(TemplateEntity templateEntity) {
        return new Template();
    }
}
