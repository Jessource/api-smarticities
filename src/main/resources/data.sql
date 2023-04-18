CREATE TABLE morador (
    codigo int NOT NULL auto_increment,
    nome varchar(50) NOT NULL,
    cpf varchar(11),
    logradouro varchar(50) NOT NULL,
    bairro varchar(50) NOT NULL,
    cidade varchar(50) NOT NULL,
    estado varchar(50) NOT NULL,
    numero varchar(20) NOT NULL,
    complemento varchar(50) NOT NULL,
    profissao varchar(50) NOT NULL,
    
   
    PRIMARY KEY (codigo)
);

insert into morador(nome,cpf, logradouro,bairro,cidade,estado,numero,complemento, profissao) values ('jessica','04087079252','rua 5','terra preta','Manacapuru','Amazonas','a993','coema','desenvolvedora');
CREATE TABLE cidade (
    codigo int NOT NULL auto_increment,
    nome varchar(50) NOT NULL,
    sobre varchar(255) not null,
    
   
    PRIMARY KEY (codigo)
);

insert into cidade (nome,sobre) values('Manacapuru', 'Manacapuru é um município brasileiro para saber mais: https://pt.wikipedia.org/wiki/Manacapuru');

CREATE TABLE avaliacao_cidade (
    codigo int NOT NULL auto_increment,
    comentario_saude varchar(100) NOT NULL,
    comentario_escola varchar(100) not null,
    morador_id int ,
    cidade_id int ,
   
    PRIMARY KEY (codigo),
   foreign key(morador_id) references morador(codigo),
   foreign key(cidade_id) references cidade(codigo)
);

insert into avaliacao_cidade( comentario_Saude,comentario_Escola, morador_Id,cidade_Id) values ('as unidades de sáude são boas','as unidades de escolas são limpas',1,1);

