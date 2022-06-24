package br.edu.infnet.repository;

import br.edu.infnet.model.domain.Funcionario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer> {

    @Query("from Funcionario f where f.estabelecimento.id = :idEstabelecimento")
    public List<Funcionario> obterLista(Integer idEstabelecimento);
}
