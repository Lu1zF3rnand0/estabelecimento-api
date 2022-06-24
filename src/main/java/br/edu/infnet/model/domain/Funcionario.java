package br.edu.infnet.model.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(
        name = "TFuncionario",
        uniqueConstraints = @UniqueConstraint(columnNames={"cpf"})
)
public class Funcionario extends Usuario{
    private String cpf;
    private String email;
    private String telefone;

    @ManyToOne
    @JoinColumn(name = "idEstabelecimento")
    @JsonBackReference
    private Estabelecimento estabelecimento;

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
