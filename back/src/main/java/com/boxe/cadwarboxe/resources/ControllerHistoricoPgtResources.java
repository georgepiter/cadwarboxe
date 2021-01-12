package com.boxe.cadwarboxe.resources;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.boxe.cadwarboxe.domain.HistoricoPgt;
import com.boxe.cadwarboxe.dto.HistoricoPgtDto;
import com.boxe.cadwarboxe.services.HistoricoPgtService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@Component
@RequestMapping(value = "/historico")
public class ControllerHistoricoPgtResources {

    @Autowired
    private HistoricoPgtService historicoPgtService;

    @PersistenceContext
    private EntityManager manager;

    @GetMapping("/{ID}")
    public HistoricoPgtDto historicoDto(@PathVariable Long ID) {
        HistoricoPgt historicoPgt = this.historicoPgtService.buscarHistoricoPgtPorId(ID);

        return new HistoricoPgtDto(historicoPgt);

    }

    @GetMapping("/")
    public List<HistoricoPgtDto> listHistorico() {

        return historicoPgtService.findAll().stream().map(e -> HistoricoPgtDto.builder().idHistorico(e.getIdHistorico())
                                                                                       .mes(e.getMes())
                                                                                       .ano(e.getAno())
                                                                                       .valor(e.getValor())
                                                                                       .valorPago(e.getValorPago())
                                                                                       .dataVencimento(e.getDataVencimento())
                                                                                       .dataPagamento(e.getDataPagamento())
                                                                              .build()).collect(Collectors.toList());
        
    }
}