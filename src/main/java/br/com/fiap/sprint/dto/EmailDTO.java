package br.com.fiap.sprint.dto;

import java.time.Instant;

public class EmailDTO {
	private Long id;
	private String mensagem;
	private Instant dataEnvio;
	private String remetente;
	private String destinatario;	
	
	public EmailDTO(){
		this.dataEnvio = Instant.now();
	}
	
	public EmailDTO(Long id, String mensagem, String remetente, String destinatario) {
		this.mensagem = mensagem;
		this.id = id;
		this.remetente = remetente;
		this.destinatario = destinatario;
		this.dataEnvio = Instant.now();
	}
	
	public EmailDTO(Long id, String mensagem, String destinatario, String remetente, Instant dataEnvio) {
		this.id = id;
		this.mensagem = mensagem;
		this.remetente = remetente;
		this.destinatario = destinatario;
		this.dataEnvio =  dataEnvio;
	 }

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public Instant getDataEnvio() {
		return dataEnvio;
	}

	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
}
