package br.com.moraes.pontointeligente.api.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpresaDto {
	
	private Long id;
	private String razaoSocial;
	private String cnpj;
}
