package br.edu.infnet.service;

import br.edu.infnet.model.domain.Funcionario;
import br.edu.infnet.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<Funcionario> obterLista(Integer idEstabelecimento) {
        return funcionarioRepository.obterLista(idEstabelecimento);
    }

    public void incluir(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
    }
}
