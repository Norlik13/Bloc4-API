package com.example.bloc4_api;

import com.example.bloc4_api.filter.ApiKeyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiKeyFilterConfig {

	@Bean
	public FilterRegistrationBean<ApiKeyFilter> apiKeyFilter() {
		FilterRegistrationBean<ApiKeyFilter> registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter(new ApiKeyFilter());
		registrationBean.addUrlPatterns("/api/*");
		return registrationBean;
	}
}