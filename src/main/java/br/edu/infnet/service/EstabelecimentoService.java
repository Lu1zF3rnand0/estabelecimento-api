package br.edu.infnet.service;

import br.edu.infnet.model.domain.Estabelecimento;
import br.edu.infnet.repository.EstabelecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstabelecimentoService {

    @Autowired
    private EstabelecimentoRepository estabelecimentoRepository;

    public void incluir(Estabelecimento estabelecimento){
        estabelecimentoRepository.save(estabelecimento);
    }
}
