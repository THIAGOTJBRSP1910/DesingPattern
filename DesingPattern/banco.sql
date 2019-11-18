create database dbDP;
use dbDP;
create table contato(
id int auto_increment primary key,
celular varchar(20),
email varchar(20)
)engine InnoDB;


create table endereco(
id int auto_increment primary key,
tipo varchar(20),
logradouro varchar(100),
numero varchar (10),
bairro varchar (50),
cep varchar(10)

)engine InnoDB;

create table cliente(
id int auto_increment primary key,
nome varchar(100),
cpf varchar(20),
rg varchar(20),
cartaocredito varchar(100),
ativo char(5),
idendereco int,
idcontato int,
constraint `fk_cli_end` foreign key (`idendereco`) references `endereco`(`id`),
constraint `fk_cli_pk_com`
foreign key (`idcontato`) references `contato`(`id`)
)engine InnoDB;

