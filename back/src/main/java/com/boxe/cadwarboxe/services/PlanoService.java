package com.boxe.cadwarboxe.services;

import com.boxe.cadwarboxe.domain.Plano;
import org.springframework.stereotype.Service;

@Service
public interface PlanoService {

	public Plano buscarPlanoPorId(Long ID);
	public void deletarPlanoPorId(Long ID);
    public Plano novoPlano(Plano plano);


}
