package br.com.fiap.sprint.builder;

import java.time.Instant;

import br.com.fiap.sprint.model.EmailModel;

public class EmailBuilder {

	private Long id;
	private String mensagem;
	private Instant dataEnvio;
	private String remetente;
	private String destinatario;
	
	public EmailBuilder addMensagem(String mensagem) {
		this.mensagem = mensagem;
		return this;
	}
	
	public EmailBuilder addRemetente(String remetente) {
		this.remetente = remetente;
		return this;
	}
	
	public EmailBuilder addDestinatario(String destinatario) {
		this.destinatario = destinatario;
		return this;
	}
	
	public EmailModel build() {
		EmailModel email = new EmailModel(id, mensagem, destinatario, remetente, dataEnvio);
		return email;
	}
	
}
