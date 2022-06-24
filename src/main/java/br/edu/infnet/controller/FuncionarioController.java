package br.edu.infnet.controller;

import br.edu.infnet.model.domain.Funcionario;
import br.edu.infnet.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping("/{idEstabelecimento}/listar")
    public List<Funcionario> obterLista(@PathVariable Integer idEstabelecimento){
        return funcionarioService.obterLista(idEstabelecimento);
    }

    @PostMapping(value = "incluir")
    public void incluir(@RequestBody Funcionario funcionario){
        funcionarioService.incluir(funcionario);
    }
}
