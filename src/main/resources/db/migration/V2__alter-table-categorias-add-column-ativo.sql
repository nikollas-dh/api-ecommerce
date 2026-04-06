alter table categorias add ativo tinyint;


update categorias set ativo = 1;

alter table categorias MODIFY column ativo tinyint not null;