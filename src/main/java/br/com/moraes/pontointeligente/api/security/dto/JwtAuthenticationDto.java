package br.com.moraes.pontointeligente.api.security.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JwtAuthenticationDto {
	
	private String email;
	private String senha;

	@NotEmpty(message = "Email não pode ser vazio.")
	@Email(message = "Email inválido.")
	public String getEmail() {
		return email;
	}

	@NotEmpty(message = "Senha não pode ser vazia.")
	public String getSenha() {
		return senha;
	}
}
