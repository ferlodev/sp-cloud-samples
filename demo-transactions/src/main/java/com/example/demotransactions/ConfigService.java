package com.example.demotransactions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class ConfigService {

	@Value("${message:}")
	private String message;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
}
