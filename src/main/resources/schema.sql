create table livro (
  id number(10) not null,
  autor varchar2(50),
  ano varchar2(50),
  constraint livro_pk primary key (id)
);

create table autor (
  id number(10) not null,
  autor varchar2(50),
  ano timestamp,
  constraint autor_pk primary key (id)
);
