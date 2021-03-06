create table usuario(
id int auto_increment primary key,
nome varchar(100),
email varchar(100),
telefone varchar(11),
senha varchar(100)
) character set utf8 collate utf8_unicode_ci;

#Crinado table usuario
create table admin(
id int auto_increment primary key,
nome varchar(100),
senha varchar(100),
empresa_id int,
foreign key(empresa_id) references empresa(id)
)character set utf8 collate utf8_unicode_ci;

create table produto(
id int auto_increment primary key,
descricao varchar(100),
preco double,
igredientes varchar(100),
empresa_id int 
) character set utf8 collate utf8_unicode_ci;

create table pedido(
id int auto_increment primary key,
id_usuario int,
id_produto int,
created_at datetime null,
status varchar(45),
formaforma_pagamento_id int
) character set utf8 collate utf8_unicode_ci;

create table empresa(
id int auto_increment primary key,
nome varchar(100),
cnpj varchar(11)
)character set utf8 collate utf8_unicode_ci;

create table formas_pagamento(
id int auto_increment primary key,
tipo varchar(100)
)character set utf8 collate utf8_unicode_ci;

create table endereco_user(
id int auto_increment primary key,
bairro varchar(100),
rua varchar(100),
numero varchar(4),
complemento varchar(100),
id_user int,
foreign key (id_user) references usuario(id)
)character set utf8 collate utf8_unicode_ci;

create table formas_pagamento(
id int auto_increment primary key,
tipo varchar(100)
)character set utf8 collate utf8_unicode_ci;
##################################################################################

						##inserindo as foreings keys
alter table produto add foreign key (empresa_id) references empresa(id);

alter table pedido add foreign key (id_usuario) references usuario(id);
alter table pedido add foreign key (id_produto) references produto(id);
alter table pedido add foreign key (forma_pagamento_id) references formas_pagamento(id);

							##inserino empresas
insert into empresa (nome,cnpj) values ("pistStop","9999999");
insert into empresa (nome,cnpj) values ("pontes","8888888");
insert into empresa (nome,cnpj) values ("soniaSalgados","7777777");
insert into empresa (nome,cnpj) values ("pastelariaDoJapones","6666666");
#############################################################################
										##inserindo admin pitstop##
insert into admin (nome,senha,empresa_id) values ('marcos','12345',1);

                                         ##inserindo produtos pitstop##
insert into produto (descricao,preco,igredientes,empresa_id) values ("mexicana",24.99,"frango,calabresa,pimenta",1);
insert into produto (descricao,preco,igredientes,empresa_id) values ("portuguesa",34.99,"frango,calabresa,pimenta",1);
insert into produto (descricao,preco,igredientes,empresa_id) values ("muçarela",22.99,"frango,calabresa,pimenta",1);
insert into produto (descricao,preco,igredientes,empresa_id) values ("frango com catupire",15.99,"frango,calabresa,pimenta",1);
insert into produto (descricao,preco,igredientes,empresa_id) values ("napolitana",12.99,"frango,calabresa,pimenta",1);
insert into produto (descricao,preco,igredientes,empresa_id) values ("romeu e julieta",29.99,"frango,calabresa,pimenta",1);

insert into produto (descricao,preco,igredientes,empresa_id) values ("coxinha de frango",1.99,"massa, recheio",1);
insert into produto (descricao,preco,igredientes,empresa_id) values ("pastel",3.99,"massa, recheio",1);
insert into produto (descricao,preco,igredientes,empresa_id) values ("coxinha de copo",4.99,"varias coxinhas",1);
insert into produto (descricao,preco,igredientes,empresa_id) values ("refrigerante",5.99,"refrigerante varios sabores",1);
insert into produto (descricao,preco,igredientes,empresa_id) values ("suco",3.99,"agua, açucar,polpa",1);
insert into produto (descricao,preco,igredientes,empresa_id) values ("agua",2.99,"agua mineral",1);
##########################################################################################################################
										##inserindo admin pitstop##
insert into admin (nome,senha,empresa_id) values ('natanael','natangostoso',2);
											##inserindo produtos pontes##
insert into produto (descricao,preco,igredientes,empresa_id) values ("mexicana",24.99,"frango,calabresa,pimenta",2);
insert into produto (descricao,preco,igredientes,empresa_id) values ("portuguesa",34.99,"frango,calabresa,pimenta",2);
insert into produto (descricao,preco,igredientes,empresa_id) values ("muçarela",22.99,"frango,calabresa,pimenta",2);
insert into produto (descricao,preco,igredientes,empresa_id) values ("frango com catupire",15.99,"frango,calabresa,pimenta",2);
insert into produto (descricao,preco,igredientes,empresa_id) values ("napolitana",12.99,"frango,calabresa,pimenta",2);
insert into produto (descricao,preco,igredientes,empresa_id) values ("romeu e julieta",29.99,"frango,calabresa,pimenta",2);

insert into produto (descricao,preco,igredientes,empresa_id) values ("coxinha de frango",1.99,"massa, recheio",2);
insert into produto (descricao,preco,igredientes,empresa_id) values ("pastel",3.99,"massa, recheio",2);
insert into produto (descricao,preco,igredientes,empresa_id) values ("refrigerante",5.99,"refrigerante varios sabores",2);
insert into produto (descricao,preco,igredientes,empresa_id) values ("agua",2.99,"agua mineral",2);
##########################################################################################################################

											##inserindo produtos pontes##
insert into formas_pagamento (tipo) values("cartao_de_credido");
insert into formas_pagamento (tipo) values("dinheiro");
##########################################################################################################################

select * from usuario;
select * from produto;
select * from empresa;
select * from pedido; 
select * from endereco_user;
select * from admin;

select produto.descricao , produto.preco , empresa.nome from produto , empresa where produto.empresa_id = empresa.id;

select usuario.nome,produto.descricao , produto.preco , empresa.nome from pedido , usuario , produto, empresa where pedido.id_usuario= usuario.id AND empresa.nome = 'pontes';

SELECT u.id,pr.descricao,pr.id, pr.preco, pe.created_at, em.nome , pe.status , pr.empresa_id from pedido pe
join usuario u
on u.id = pe.id_usuario
join produto pr
on pr.id = pe.id_produto
join empresa em
on em.id = pr.empresa_id
where u.id = 13
order by pe.created_at;

##query pedidos pendentes

SELECT pe.id,u.id,u.nome,eu.rua,eu.bairro,eu.numero,u.telefone,pr.descricao,pr.preco,pr.id , pe.status from pedido pe
join usuario u
on u.id = pe.id_usuario
join endereco_user eu
on eu.id_user = u.id
join produto pr
on pr.id = pe.id_produto
join empresa em
on em.id = pr.empresa_id
where em.id = 1
and pe.status = 'Pendente'
order by pe.created_at;

delete from usuario where telefone = null;

delete from pedido where id_usuario = 4;