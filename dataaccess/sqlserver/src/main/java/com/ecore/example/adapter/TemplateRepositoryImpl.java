package com.ecore.example.adapter;


import com.ecore.example.mapper.TemplateDataAccessMapper;
import com.ecore.example.model.Template;
import com.ecore.example.ports.output.repository.TemplateRepository;
import com.ecore.example.repository.TemplateJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TemplateRepositoryImpl implements TemplateRepository {

    private final TemplateJpaRepository templateJpaRepository;
    private final TemplateDataAccessMapper templateDataAccessMapper;

    @Override
    public Template save(Template template) {
        return templateDataAccessMapper.templateEntityToTemplate(templateJpaRepository
                .save(templateDataAccessMapper.templateToTemplateEntity(template)));
    }

}
