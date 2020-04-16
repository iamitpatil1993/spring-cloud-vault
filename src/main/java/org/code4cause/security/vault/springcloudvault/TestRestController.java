package org.code4cause.security.vault.springcloudvault;

import org.code4cause.security.vault.springcloudvault.model.UserCredentials;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = { "/credentials" })
@AllArgsConstructor
public class TestRestController {

	private UserCredentials credentials;

	@GetMapping(produces = { "application/json" })
	public UserCredentials getUserCredentials() {
		return credentials;
	}

}
