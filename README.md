#TODO

# Cooperativa de Serviços

**[MICROSERVIÇO]**
### Cadastro de reciclaveis
##### tbl_Triagem
	- data	
	- id produto
	- qtde
    - cooperado 
	- valor da unidade kilo

##### tbl_Reciclaveis
		- id
		- descricao
		- valor total vindo da tbl_Triagem 

  - Type some Markdown on the left
  - See HTML in the right
  - Magic

**[MICROSERVIÇO]**
### Cadastro de Cooperado e Cooperativa
##### tbl_Cooperado
	- Email
	- Senha 
	- competencias String varchar(400) 
	- Cargo na Cooperativa
	- Nome
	- Endereco
	- Telefone
	- ...
	
##### tbl_Cooperativa em **PostgreSql**
```sql
CREATE TABLE cooperativa (
        id serial NOT NULL,
        CNPJ varchar(20) NOT NULL,
        pessoaJuridicaFisica varchar(20) NOT NULL,
        razaoSocial varchar(100) DEFAULT NULL,
        nomeFantasia varchar(100) DEFAULT NULL,
        representante varchar(100) DEFAULT NULL,
        dataCriacao date DEFAULT NULL,
        telefone varchar(30) DEFAULT NULL,
        enderecoRua varchar(100) DEFAULT NULL,
        enderecoBairro varchar(60) DEFAULT NULL,
        enderecoNumero varchar(30) DEFAULT NULL,
        cidade varchar(100) DEFAULT NULL,
        estado varchar(2) DEFAULT NULL,
        tipoCooperativaID int DEFAULT NULL,
        tipoCooperativa varchar(60) DEFAULT NULL,
        PRIMARY KEY (id)
        );
```



