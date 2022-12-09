package com.mobile2b.webfunction;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Getter
@Setter
@ToString
public class WebFunctionRequest {

    @NotBlank
    private String requestId;
    
    private Map<String, Object> data;

}
