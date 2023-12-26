package com.ecore.example.rest.swaggerdoc;

import com.ecore.example.ports.input.dto.CreateTemplateCommand;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;

public interface TemplateSwaggerDoc {

    @Operation(summary = "Swagger Example", description = "Swagger Example")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Template created successfully",
                    content = {@Content(mediaType = "application/json")}),
    })
    ResponseEntity<com.ecore.example.ports.output.dto.CreateTemplateResponse> createTemplateExample(@Valid CreateTemplateCommand createTemplateCommand);
}