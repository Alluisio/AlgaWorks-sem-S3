package com.example.algamoney.api.storage;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class S3 {
	
	public String salvarTemporariamente(MultipartFile arquivo) {
		return null;
	}
	
	public String configurarUrl(String objeto) {
		return null;
	}
	
	public void salvar(String objeto) {
	}

	public void remover(String objeto) {
	}
	
	public void substituir(String objetoAntigo, String objetoNovo) {
	}
	
	private String gerarNomeUnico(String originalFilename) {
		return null;
	}
}
