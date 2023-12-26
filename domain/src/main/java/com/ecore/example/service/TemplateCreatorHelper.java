package com.ecore.example.service;


import com.ecore.example.mapper.TemplateDataMapper;
import com.ecore.example.model.Template;
import com.ecore.example.ports.input.dto.CreateTemplateCommand;
import com.ecore.example.ports.output.repository.TemplateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TemplateCreatorHelper {

    private final TemplateRepository templateRepository;
    private final TemplateDataMapper templateDataMapper;


    public Template persistTemplate(CreateTemplateCommand createTemplateCommand) {
        Template template = templateDataMapper.createTemplateCommandToTemplate(createTemplateCommand);
        saveTemplate(template);
        return template;
    }

    private void saveTemplate(Template template) {
        templateRepository.save(template);
    }
}
