package com.entrevista.projetogat.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendEmailService {

	@Autowired
	private JavaMailSender javaMailSender;

	public void sendEmail(String to, String body, String topic) {

		SimpleMailMessage smm = new SimpleMailMessage();

		smm.setFrom("viniciusmontees@gmail.com");
		smm.setTo(to);
		smm.setSubject(topic);
		smm.setText(body);

		javaMailSender.send(smm);

	}

}
