package com.boxe.cadwarboxe.services.imp;

import java.util.List;

import com.boxe.cadwarboxe.domain.HistoricoPgt;
import com.boxe.cadwarboxe.repositories.HistoricoPgtRepository;
import com.boxe.cadwarboxe.services.HistoricoPgtService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaHistoricoPgtImp implements HistoricoPgtService {

    @Autowired
    private HistoricoPgtRepository historicoPgtRepository;

    @Override
    public HistoricoPgt buscarHistoricoPgtPorId(Long ID) {

        return historicoPgtRepository.findById(ID).orElseThrow(() -> new RuntimeException("Historico não localizado"));
    }

    @Override
    public List<HistoricoPgt> findAll() {

        return historicoPgtRepository.findAll();
    }

     
}
