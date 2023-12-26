package com.ecore.example.rest;

import com.ecore.example.ports.input.service.TemplateApplicationService;
import com.ecore.example.ports.input.dto.CreateTemplateCommand;
import com.ecore.example.ports.output.dto.CreateTemplateResponse;
import com.ecore.example.rest.swaggerdoc.TemplateSwaggerDoc;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TemplateController implements TemplateSwaggerDoc {

    private final TemplateApplicationService templateApplicationService;

    @PostMapping("/template")
    public ResponseEntity<CreateTemplateResponse> createTemplateExample(CreateTemplateCommand createTemplateCommand) {
        return new ResponseEntity<>(templateApplicationService.createTemplateExample(createTemplateCommand), HttpStatus.CREATED);

    }
}
