package br.edu.infnet.controller;

import br.edu.infnet.model.domain.Estabelecimento;
import br.edu.infnet.service.EstabelecimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estabelecimento")
public class EstabelecimentoController {

    @Autowired
    private EstabelecimentoService estabelecimentoService;

    @PostMapping(value = "/incluir")
    public void incluir(@RequestBody Estabelecimento estabelecimento){
        estabelecimentoService.incluir(estabelecimento);
    }

    @GetMapping(value = "/listar")
    public List<Estabelecimento> obterLista() {
        return estabelecimentoService.obterLista();
    }

}
