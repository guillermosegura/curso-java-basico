package com.axity.course.sintaxis;

import com.axity.course.sintaxis.a.UserDO;
import com.axity.course.sintaxis.b.UserTO;

public class UserApp {
	public static void main(String[] args) {

		UserDO usuario = new UserDO();
		usuario.name = "gsegura";

		UserTO otroUsuario = new UserTO();
		otroUsuario.username = "guillermo.segura";

	}
}
