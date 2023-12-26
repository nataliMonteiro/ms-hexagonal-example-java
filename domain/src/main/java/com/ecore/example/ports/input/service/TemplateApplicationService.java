package com.ecore.example.ports.input.service;


import com.ecore.example.ports.input.dto.CreateTemplateCommand;
import com.ecore.example.ports.output.dto.CreateTemplateResponse;

public interface TemplateApplicationService {
    CreateTemplateResponse createTemplateExample(CreateTemplateCommand createTemplateCommand);
}
