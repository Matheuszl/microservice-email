package com.ms.email.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * Na classe dto fazemos a validacao
 * 
 * @author matza
 *
 */
public class EmailDto {

	@NotBlank
	private String ownerRef; // ref do proprietario que esta mandando
	@NotBlank
	@Email
	private String emailFrom; // de quem é o email
	@NotBlank
	@Email
	private String emailTo; // para quem esta indo o email
	@NotBlank
	private String subject; // titulo do email
	@NotBlank
	private String text; // corpo do email

	public EmailDto() {
	}

	public String getOwnerRef() {
		return ownerRef;
	}

	public void setOwnerRef(String ownerRef) {
		this.ownerRef = ownerRef;
	}

	public String getEmailFrom() {
		return emailFrom;
	}

	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}

	public String getEmailTo() {
		return emailTo;
	}

	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
