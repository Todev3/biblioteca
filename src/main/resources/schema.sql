CREATE SEQUENCE LIVRO_SEQUENCE START WITH 1 INCREMENT BY 1;

create table livro (
  id number(10) not null,
  autor varchar2(50),
  nome varchar2(50),
  ano TIMESTAMP,
  constraint livro_pk primary key (id)
);



