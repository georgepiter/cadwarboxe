package com.boxe.cadwarboxe.services.imp;

import java.util.Optional;

import com.boxe.cadwarboxe.domain.Modalidade;
import com.boxe.cadwarboxe.repositories.ModalidadesRepository;
import com.boxe.cadwarboxe.services.ModalidadeService;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaModalidadeServiceImp implements ModalidadeService {

    @Autowired
    private ModalidadesRepository modalidadesRepository;

    @Override
    public Modalidade novaModalidade(Modalidade modalidade) {
        modalidade.setIdModalidade(null);
        return modalidadesRepository.save(modalidade);       
    
    }

    @Override
    public Modalidade buscarModalidadePorId(Long id) {

        Optional<Modalidade> modalidade = modalidadesRepository.findById(id);
        if (modalidade == null) {
            try {
                throw new ObjectNotFoundException(
                        "Objeto não encontrado! Id: " + id + ", Tipo: " + Modalidade.class.getName(), null);
            } catch (ObjectNotFoundException e) {
                e.printStackTrace();
            }
        }
        
        return modalidadesRepository.findById(id).orElseThrow(() -> new RuntimeException("Modalidade não encontrada"));
    }

    @Override
    public Modalidade atualizarModalidadePorId(Modalidade modalidade) {
        buscarModalidadePorId(modalidade.getIdModalidade());
        return modalidadesRepository.save(modalidade);
    }

    @Override
    public void deletarModalidadePorId(Long id) {

    }

  

   

  
   
}
