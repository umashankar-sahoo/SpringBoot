package com.cavendish.main;
/*
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
public class SecurityConfig {
//	private static final LogManager log = LogManager.getLogger();

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		log.info("Setting in-memory security using the user input...");

		Scanner scanner = new Scanner(System.in);
		String inputUser = null;
		String inputPassword = null;
		System.out.println("\nPlease set the admin credentials for this web application");
		while (true) {
			System.out.print("user: ");
			inputUser = scanner.nextLine();
			System.out.print("password: ");
			inputPassword = scanner.nextLine();
			System.out.print("confirm password: ");
			String inputPasswordConfirm = scanner.nextLine();

			if (inputUser.isEmpty()) {
				System.out.println("Error: user must be set - please try again");
			} else if (inputPassword.isEmpty()) {
				System.out.println("Error: password must be set - please try again");
			} else if (!inputPassword.equals(inputPasswordConfirm)) {
				System.out.println("Error: password and password confirm do not match - please try again");
			} else {
				// log.info("Setting the in-memory security using the provided credentials...");
				break;
			}
			System.out.println("");
		}
		scanner.close();

		if (inputUser != null && inputPassword != null) {
			auth.inMemoryAuthentication().withUser(inputUser).password(inputPassword).roles("USER");
		}
	}
}*/

public class SecurityConfig {}