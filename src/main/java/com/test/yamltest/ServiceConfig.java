package com.test.yamltest;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@Getter
@Setter
public class ServiceConfig {

	private Boolean enableLog;
	private Boolean authRequired;
	private String appEnv;
	private Integer timeoutInMs;
	private String serviceUrl;
	private String serviceName;
	private String serviceVersion;
	private String serviceNamespace;

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
	}
}
