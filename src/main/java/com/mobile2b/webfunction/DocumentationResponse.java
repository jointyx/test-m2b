package com.mobile2b.webfunction;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DocumentationResponse {

    @NotBlank
    private String description;

    private List<@Valid WebFunctionInputParameter> input;

    @NotEmpty
    private List<@Valid WebFunctionOutputParameter> output;

}
