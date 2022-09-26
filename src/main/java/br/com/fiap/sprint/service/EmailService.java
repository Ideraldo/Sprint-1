package br.com.fiap.sprint.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.sprint.dto.EmailDTO;
import br.com.fiap.sprint.mapper.EmailMapper;
import br.com.fiap.sprint.model.EmailModel;
import br.com.fiap.sprint.repository.EmailRepository;

@Service
public class EmailService {

	@Autowired
	private EmailMapper emailMapper;
	
	@Autowired
	private EmailRepository emailRepository;
	
	public EmailDTO enviarEmail(EmailDTO emailDTO) {
		EmailModel email = emailMapper.toEmailModel(emailDTO);
		email.enviar();
		return emailMapper.toEmailDTO(emailRepository.save(email));
	}

	public List<EmailDTO> getAll() {
		return emailRepository.findAll().stream().map(e -> emailMapper.toEmailDTO(e)).collect(Collectors.toList());
	}

	public EmailDTO getEmailById(Long id) {
		return emailMapper.toEmailDTO(emailRepository.getById(id));
	}

	public void deleteEmail(Long id) {
		emailRepository.deleteById(id);
	}
		
}
