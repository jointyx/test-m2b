package com.mobile2b.webfunction;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class WebFunctionInputParameter extends AbstractWebFunctionParameter {

    private boolean required;

}
