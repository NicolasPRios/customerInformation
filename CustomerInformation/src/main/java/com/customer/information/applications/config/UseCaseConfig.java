package com.customer.information.applications.config;

import com.customer.information.domain.model.customer.gateways.CustomerRepository;
import com.customer.information.domain.usecase.CustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "com.customer.information.domain.usecase",
        includeFilters = {
                    @ComponentScan.Filter(type = FilterType.REGEX, pattern = "^.+UseCase$")
         },
        useDefaultFilters = false)
public class UseCaseConfig {


}
