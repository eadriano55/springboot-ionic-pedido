package br.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import br.cursomc.domain.Cliente;
import br.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);

	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
