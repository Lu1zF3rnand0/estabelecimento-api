package br.edu.infnet;

import br.edu.infnet.model.domain.Estabelecimento;
import br.edu.infnet.model.domain.Funcionario;
import br.edu.infnet.service.FuncionarioService;
import br.edu.infnet.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class FuncionarioLoader implements ApplicationRunner {

    @Autowired
    private FuncionarioService funcionarioService;

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Funcionario funcionario = new Funcionario();
        try {

            Estabelecimento estabelecimento = (Estabelecimento) usuarioService.validar("infnet", "123");

            funcionario.setCpf("98765432103");
            funcionario.setEmail("Luiz3@gmail.com");
            funcionario.setTelefone("1234568");
            funcionario.setLogin("luiz3");
            funcionario.setNome("Luiz3");
            funcionario.setSenha("321");
            funcionario.setEstabelecimento(estabelecimento);

            funcionarioService.incluir(funcionario);
            System.out.println("Funcionario " + funcionario.getNome() + " incluido com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro na inclusao do funcionario");
        }

    }
}
