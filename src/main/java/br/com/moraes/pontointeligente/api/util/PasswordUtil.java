package br.com.moraes.pontointeligente.api.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PasswordUtil {

	private static final Logger log = LoggerFactory.getLogger(PasswordUtil.class);
	
	public static String gerarBCrypt(String senha) {
		if(senha == null) {
			return senha;
		}
		log.info("Gerando hash como o BCrypt");
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder.encode(senha);
	}
}
