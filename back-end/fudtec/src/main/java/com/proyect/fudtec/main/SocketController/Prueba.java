package com.proyect.fudtec.main.SocketController;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class Prueba {

	
	@MessageMapping("/prueba")
	@SendTo("/envio/prueba")
	public String estaEscribiendo(String username) {
		return "conectado";
	}
	
}
