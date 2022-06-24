<h1 align="center">:file_cabinet: Estabelecimento API</h1>

## :memo: Descrição
API criada como exemplo 

## :books: Funcionalidades
* <b>Validar Usuario</b>: Valida um usuário atráves dos campos login e senha
* <b>Excluir Usuario</b>: Exclui um usuário atráves do ID
* <b>Lista Usuarios</b>: Lista todos os usuários

## :wrench: Tecnologias utilizadas
* Java;
* API RESTful;

## :rocket: Rodando o projeto
É necessário ter instalado o MYSQL, e ver se as configurações estão de acordo com o <a href="https://github.com/Lu1zF3rnand0/estabelecimento-api/blob/master/src/main/resources/application.properties">application.properties</a>
Para rodar o repositório é necessário clonar o mesmo, abrir na sua IDE Java preferencial, baixar as dependencias e rodar o projeto,
depois basta rodar os seguintes comandos no Postman ou Insomnia:
```
http://localhost:8080/api/usuario/listar
http://localhost:8080/api/usuario/{id}/excluir
http://localhost:8080/api/usuario/validar
```

## :soon: Implementação futura
* Criar rotas de update

## :handshake: Colaboradores
<table>
  <tr>
    <td align="center">
      <a href="http://github.com/Lu1zF3rnand0">
        <img src="https://avatars.githubusercontent.com/u/7717507" width="100px;" alt="Foto de Luiz Fernando no GitHub"/><br>
        <sub>
          <b>Lu1zF3rnand0</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

## :dart: Status do projeto
