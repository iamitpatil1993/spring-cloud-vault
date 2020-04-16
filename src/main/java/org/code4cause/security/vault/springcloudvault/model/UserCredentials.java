package org.code4cause.security.vault.springcloudvault.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@ConfigurationProperties(prefix = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserCredentials {

	private String username;

	private String password;

}
