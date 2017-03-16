package com.alis.annotations;

import java.util.*;

public class PasswordUnits {
	@UseCase(id = 47, description = "PSW must contain at list one numeric")
	public Boolean validatePassword(String password) {
		return (password.matches("\\w*\\d\\w*"));
	}
	@UseCase(id = 48)
	public String encryptPassword(String password) {
		return new StringBuilder(password).reverse().toString();
	}
	@UseCase(id = 49, description = "New psw can't equal...")
	public boolean checkForNewPassword(List<String> prevPasswords, String password) {
		return !prevPasswords.contains(password);
	}
}
