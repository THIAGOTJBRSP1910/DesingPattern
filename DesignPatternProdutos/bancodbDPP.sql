create database dbDPP;
use dbDPP;

create table Produto(
id int auto_increment primary key,
nome varchar(500),
Preco decimal (8,2)
)engine InnoDB;


create table Livro(
id int auto_increment primary key,
autor varchar(100),
genero varchar(100), 
ano int, 
editora varchar(100),
idProduto int,
constraint ` fk_Li_pk_Pr` 
	foreign key (`idProduto`) references `Produto` (`id`)
)engine InnoDB;

create table Escritorio(
id int auto_increment primary key,
marcaProduto varchar(100),
idProduto int,
constraint ` fk_Es_pk_Pr` 
	foreign key (`idProduto`) references `Produto` (`id`)
)engine InnoDB;

Select * from livro;
Select * from Escritorio;