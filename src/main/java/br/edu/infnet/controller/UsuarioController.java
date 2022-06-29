package br.edu.infnet.controller;

import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/validar")
    public Usuario validar(@RequestParam String login, @RequestParam String senha) {
        return usuarioService.validar(login, senha);
    }

    @DeleteMapping(value="/{id}/excluir")
    public void exluir(@PathVariable Integer id) {
        usuarioService.exluir(id);
    }

    @GetMapping(value = "/listar")
    public List<Usuario> obterLista() {
        return usuarioService.obterLista();
    }

}
