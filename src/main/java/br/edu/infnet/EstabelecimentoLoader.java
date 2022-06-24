package br.edu.infnet;

import br.edu.infnet.model.domain.Estabelecimento;
import br.edu.infnet.service.EstabelecimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class EstabelecimentoLoader implements ApplicationRunner {

    @Autowired
    private EstabelecimentoService estabelecimentoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Estabelecimento estabelecimento = new Estabelecimento();
        try {
        estabelecimento.setCnpj("123456789");
        estabelecimento.setEdTech(true);
        estabelecimento.setEndereco("Rua B");
        estabelecimento.setLogin("infnet");
        estabelecimento.setNome("Infnet");
        estabelecimento.setSenha("123");

        estabelecimentoService.incluir(estabelecimento);
            System.out.println("Estabelecimento "+ estabelecimento.getNome() +" incluido com sucesso!");
        } catch (Exception e){
            System.out.println("Erro na inclusao do estabelecimento");
        }

    }
}
