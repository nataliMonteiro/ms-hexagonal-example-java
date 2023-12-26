package com.ecore.example.service;

import com.ecore.example.mapper.TemplateDataMapper;
import com.ecore.example.model.Template;
import com.ecore.example.ports.input.dto.CreateTemplateCommand;
import com.ecore.example.ports.input.service.TemplateApplicationService;
import com.ecore.example.ports.output.dto.CreateTemplateResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TemplateApplicationServiceImpl implements TemplateApplicationService {

    private final TemplateCreatorHelper templateCreatorHelper;
    private final TemplateDataMapper templateDataMapper;

    @Override
    public CreateTemplateResponse createTemplateExample(CreateTemplateCommand createTemplateCommand) {
        Template template = templateCreatorHelper.persistTemplate(createTemplateCommand);
        return templateDataMapper.templateToCreateTemplateResponse(template);
    }

}
