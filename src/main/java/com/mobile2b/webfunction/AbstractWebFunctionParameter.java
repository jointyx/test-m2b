package com.mobile2b.webfunction;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public abstract class AbstractWebFunctionParameter {

    @NotBlank
    private String id;

    @NotEmpty
    private I18nString label;

    @NotNull
    private WebFunctionParameterType type;

}