create database dbPro;
use dbPro;

create table produto(
id int auto_increment primary key,
nome varchar(100),
preco decimal(10,2)

)engine InnoDB;

create table livro(
id int auto_increment primary key,
autor varchar(100),
resumo text,
sumario text,
isbn varchar(50),
idproduto int,
constraint `fk_liv_pk_pro` foreign key (`idproduto`) references `produto`(`id`)
)engine InnoDB;

create table escritorio(
id int auto_increment primary key,
categoria varchar(50),
idproduto int,
constraint `fk_esc_pk_pro` foreign key (`idproduto`) references `produto`(`id`)

)engine InnoDB;

