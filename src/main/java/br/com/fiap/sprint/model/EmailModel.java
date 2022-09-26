package br.com.fiap.sprint.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.fiap.sprint.command.UseCase;

@Entity
public class EmailModel implements UseCase{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String mensagem;
	private Instant dataEnvio;
	private String remetente;
	private String destinatario;
	
	public EmailModel() {
		
	}

	public EmailModel(Long id, String mensagem, String destinatario, String remetente) {
		this.id = id;
		this.mensagem = mensagem;
		this.remetente = remetente;
		this.destinatario = destinatario;
		this.dataEnvio = Instant.now();
	}
	
	public EmailModel(Long id, String mensagem, String destinatario, String remetente, Instant dataEnvio) {
		this.id = id;
		this.mensagem = mensagem;
		this.destinatario = destinatario;
		this.remetente = remetente;
		this.dataEnvio = dataEnvio;
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

	public void setDataEnvio(Instant dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	@Override
	public void enviar() {
		this.dataEnvio = Instant.now();
		System.out.println("Enviando email...");
		System.out.println("De: " + this.remetente);
		System.out.println("Para: " + this.destinatario);
		System.out.println("Mensagem: " + this.mensagem);
		System.out.println("Data do envio: " + this.dataEnvio);
	}
	
}
