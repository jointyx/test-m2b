package com.mobile2b.webfunction;

import java.util.List;
import java.util.Map;

public interface WebFunction {

    String getDescription();

    List<WebFunctionInputParameter> getInput();

    List<WebFunctionOutputParameter> getOutput();

    Map<String, Object> execute(Map<String, Object> input);

}