package br.com.fiap.sprint.builder;

import java.time.Instant;

import br.com.fiap.sprint.dto.EmailDTO;

public class EmailDtoBuilder {
	
	private Long id;
	private String mensagem;
	private Instant dataEnvio;
	private String remetente;
	private String destinatario;
	
	public EmailDtoBuilder addDataEnvio(Instant dataEnvio) {
		this.dataEnvio = dataEnvio;
		return this;
	}
	
	public EmailDtoBuilder addId(Long id) {
		this.id = id;
		return this;
	}
	
	public EmailDtoBuilder addMensagem(String mensagem) {
		this.mensagem = mensagem;
		return this;
	}
	
	public EmailDtoBuilder addRemetente(String remetente) {
		this.remetente = remetente;
		return this;
	}
	
	public EmailDtoBuilder addDestinatario(String destinatario) {
		this.destinatario = destinatario;
		return this;
	}
	
	public EmailDTO build() {
		EmailDTO email = new EmailDTO(id, mensagem, destinatario, remetente, dataEnvio);
		return email;
	}
	
}