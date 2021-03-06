package br.com.brq.api.cep.business;

import org.springframework.stereotype.Service;

import br.com.brq.api.cep.exceptions.AppException;
import br.com.brq.api.cep.domain.AcessoRequest;
import br.com.brq.api.cep.domain.AcessoResponse;

@Service
public class RegraDeNegocioBO {
	


	public AcessoResponse validaCep(AcessoRequest acessoRequest) {

		AcessoResponse response = new AcessoResponse();
		
		 if (acessoRequest == null || acessoRequest.getCep().isEmpty()||  acessoRequest.getCep() == " ") {
			throw new AppException("Valor não pode ser nulo, digite um valor valido!");
		}else if (acessoRequest.getCep().length() < 8) {
			throw new AppException("Digite um CEP valido!");
		} else if (acessoRequest.getCep().length() > 9) {
			throw new AppException("Digite um CEP valido!");
		} 
		return response;
	}

}