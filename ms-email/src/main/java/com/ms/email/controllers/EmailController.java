package com.ms.email.controllers;


import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.email.dtos.EmailDto;
import com.ms.email.models.EmailModel;
import com.ms.email.services.EmailService;

@RestController
public class EmailController {
	
	@Autowired
	EmailService emailService;
	
	/**
	 * a anotation @Valid retorna bad requast se algo nao estiver como requisitado
	 * copyProperties converte DTO pra Model
	 * @param emailDto
	 * @return retorna o model salvo e o status da requisisção
	 */
	@PostMapping("/sending-email")
	public ResponseEntity<EmailModel> sendingEmail(@RequestBody @Valid EmailDto emailDto){
		EmailModel emailModel = new EmailModel();
		BeanUtils.copyProperties(emailDto, emailModel);
		emailService.sendEmail(emailModel);
		return new ResponseEntity<>(emailModel, HttpStatus.CREATED);
	}
	
	
}
