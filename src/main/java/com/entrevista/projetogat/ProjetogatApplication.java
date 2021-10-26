package com.entrevista.projetogat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.entrevista.projetogat.services.SendEmailService;
/***
 * 
 * @author viniciusmontes@outlook.com.br
 * 
 * Conseguir apenas configurar o application.properties e fazer com que suba o email para o gmail
 * (deixei sem a senha no application.properties pois usei o pessoal.
 *
 */
@SpringBootApplication
public class ProjetogatApplication {
	
	
	@Autowired
	private SendEmailService sendEmailService;

	public static void main(String[] args) {
		SpringApplication.run(ProjetogatApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void dispararEmail() {
		sendEmailService.sendEmail("viniciusmontees@gmail.com", "Deu certo", "Teste");
	}
}
