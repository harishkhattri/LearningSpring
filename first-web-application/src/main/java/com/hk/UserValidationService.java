package com.hk;

public class UserValidationService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("Harish") && password.equals("khattri")) {
			return true;
		}

		return false;
	}
}
