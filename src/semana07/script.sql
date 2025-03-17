CREATE DATABASE java
CREATE TABLE produtos(
	codigo int primary key,
	descricao varchar(50),
	preco money
)
insert into produtos values (100,'Martelo',32.45)
insert into produtos values (101,'Cadeira',55.99)
insert into produtos values (102,'Vassoura',2.50)
insert into produtos values (103,'JBL',400.50)
insert into produtos values (104,'iPhone',7000.30)
insert into produtos values (105,'Cama',80.00)
select * from produtos