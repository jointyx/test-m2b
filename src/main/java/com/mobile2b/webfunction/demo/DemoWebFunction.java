package com.mobile2b.webfunction.demo;

import com.mobile2b.webfunction.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoWebFunction implements WebFunction {

    private static final String VAR_ID_NUM1 = "num1";
    private static final String VAR_ID_NUM2 = "num2";
    private static final String VAR_ID_SUM = "sum";

    @Override
    public String getDescription() {
        return "This is a demo web function that adds to numbers to create a sum.";
    }

    @Override
    public List<WebFunctionInputParameter> getInput() {
        return Arrays.asList(
                WebFunctionInputParameter.builder().id(VAR_ID_NUM1).label(I18nString.en("First number")).type(WebFunctionParameterType.NUMBER).required(true).build(),
                WebFunctionInputParameter.builder().id(VAR_ID_NUM2).label(I18nString.en("Second number")).type(WebFunctionParameterType.NUMBER).required(true).build()
        );
    }

    @Override
    public List<WebFunctionOutputParameter> getOutput() {
        return Arrays.asList(
                WebFunctionOutputParameter.builder().id(VAR_ID_SUM).label(I18nString.en("Sum")).type(WebFunctionParameterType.NUMBER).build()
        );
    }

    @Override
    public Map<String, Object> execute(Map<String, Object> input) {
        //Parse the parameter values from the input
        Double num1 = Double.valueOf(input.get(VAR_ID_NUM1).toString());
        Double num2 = Double.valueOf(input.get(VAR_ID_NUM2).toString());

        //Execute the actual web function
        Double sum = num1 + num2;

        //Construct the response with the output value
        Map<String, Object> response = new HashMap<>();
        response.put(VAR_ID_SUM, sum);
        return response;
    }

}
