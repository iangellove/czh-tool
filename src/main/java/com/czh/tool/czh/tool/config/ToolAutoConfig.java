package com.czh.tool.czh.tool.config;

import com.czh.tool.czh.tool.exception.CzhExceptionControllerAdvice;
import com.czh.tool.czh.tool.exception.GrNotVoidResponseBodyAdvice;
import com.czh.tool.czh.tool.response.ResponseFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToolAutoConfig {

    @Bean
    public CzhExceptionControllerAdvice controllerAdvice() {
        return new CzhExceptionControllerAdvice();
    }

    @Bean
    public GlobalResponseHandlerConfig globalResponseHandler() {
        return new GlobalResponseHandlerConfig();
    }

    @Bean
    public ValidatedExceptionConfig validatedExceptionConfig() {
        return new ValidatedExceptionConfig();
    }

    @Bean
    public ValidatedSuccessConfig validatedSuccessConfig() {
        return new ValidatedSuccessConfig();
    }

    @Bean
    public ResponseFactory responseFactory() {
        return new ResponseFactory();
    }

    @Bean
    public GrNotVoidResponseBodyAdvice grNotVoidResponseBodyAdvice() {
        return new GrNotVoidResponseBodyAdvice();
    }

}