package com.nelioAlves.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.nelioAlves.cursomc.domain.Pedido;

public interface EmailService {
	void sendOrderConfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);
}