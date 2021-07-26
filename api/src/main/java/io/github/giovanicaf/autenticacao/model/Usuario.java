package io.github.giovanicaf.autenticacao.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	private String telefone;
	
	@Column
	private String email;
	
	@Column
	private String senha;	
	
	@Column
	private LocalDate dtNascimento;
	
	@Column
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "pt-BR", timezone = "Brazil/East")
	private LocalDateTime createdDate;
	
	@Column
	private String createdUser;
		
	@PrePersist
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	public void beforeSave() {
		setCreatedDate(LocalDateTime.now());
	}

}
