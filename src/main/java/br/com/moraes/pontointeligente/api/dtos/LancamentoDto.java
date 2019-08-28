package br.com.moraes.pontointeligente.api.dtos;

import java.util.Optional;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LancamentoDto {
	
	private Optional<Long> id = Optional.empty();
	private String data;
	private String tipo;
	private String descricao;
	private String localizacao;
	private Long funcionarioId;

	@NotEmpty(message = "Data não pode ser vazia.")
	public String getData() {
		return data;
	}
}
