package com.boxe.cadwarboxe.services;

import java.util.List;

import com.boxe.cadwarboxe.domain.HistoricoPgt;

import org.springframework.stereotype.Service;

@Service
public interface HistoricoPgtService {
    
    public HistoricoPgt buscarHistoricoPgtPorId(Long ID);
    public List<HistoricoPgt> findAll();

    

}





    

