package com.springboot.di.app.conf.messages;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
  @PropertySource("classpath:messages/data_messages.properties")
})
public class Messages {

}
