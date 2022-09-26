package br.com.fiap.sprint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.sprint.dto.EmailDTO;
import br.com.fiap.sprint.service.EmailService;

@RestController
@RequestMapping("/emails")
public class EmailController {

	@Autowired
	private EmailService emailService;

	//Como não podemos atualizar um email depois de enviado, criamos apenas os métodos para envio, busca e deleção de emails.
	
	@PostMapping
	public ResponseEntity<EmailDTO> create(@RequestBody EmailDTO email) {
		EmailDTO emailSalvo = emailService.enviarEmail(email);
		return ResponseEntity.ok(emailSalvo);
	}

	@GetMapping
	public ResponseEntity<List<EmailDTO>> get(){
		return ResponseEntity.ok(emailService.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EmailDTO> getById(@PathVariable Long id) {
		return ResponseEntity.ok(emailService.getEmailById(id));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteById(@PathVariable Long id) {
		emailService.deleteEmail(id);
		return ResponseEntity.ok("Email apagado com sucesso!");
	}
	
}
