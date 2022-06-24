package br.edu.infnet.repository;

import br.edu.infnet.model.domain.Estabelecimento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstabelecimentoRepository  extends CrudRepository<Estabelecimento, Integer> {
}
