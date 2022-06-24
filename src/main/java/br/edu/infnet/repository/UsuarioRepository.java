package br.edu.infnet.repository;

import br.edu.infnet.model.domain.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

    @Query("from Usuario u where u.login = :login and u.senha = :senha")
    Usuario validar(String login, String senha);
}
