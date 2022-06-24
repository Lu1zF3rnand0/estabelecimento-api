package br.edu.infnet.service;

import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario validar(String login, String senha) {
        return usuarioRepository.validar(login, senha);
    }

    public void exluir(Integer id) {
        usuarioRepository.deleteById(id);
    }

    public List<Usuario> obterLista(){
        return (List<Usuario>) usuarioRepository.findAll();
    }
}
