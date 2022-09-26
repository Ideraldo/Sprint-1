package br.com.fiap.sprint.mapper;

import org.springframework.stereotype.Component;

import br.com.fiap.sprint.builder.EmailBuilder;
import br.com.fiap.sprint.builder.EmailDtoBuilder;
import br.com.fiap.sprint.dto.EmailDTO;
import br.com.fiap.sprint.model.EmailModel;

@Component
public class EmailMapper {
	
	public EmailModel toEmailModel(EmailDTO emailDTO) {
		//return new EmailModel(emailDTO.getId(), emailDTO.getMensagem(), emailDTO.getDestinatario(), emailDTO.getRemetente());
		return new EmailBuilder()
				.addDestinatario(emailDTO.getDestinatario())
				.addMensagem(emailDTO.getMensagem())
				.addRemetente(emailDTO.getRemetente())
				.build();
	}
	
	public EmailDTO toEmailDTO(EmailModel emailModel) {
		//return new EmailDTO(emailModel.getId(), emailModel.getMensagem(), emailModel.getDestinatario(), emailModel.getRemetente(), emailModel.getDataEnvio());
		return new EmailDtoBuilder()
				.addDestinatario(emailModel.getDestinatario())
				.addMensagem(emailModel.getMensagem())
				.addRemetente(emailModel.getRemetente())
				.addDataEnvio(emailModel.getDataEnvio())
				.addId(emailModel.getId())
				.build();
	
	}
	
}
