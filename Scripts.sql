drop table employee;

create table employee(
ID int primary key not null,
FirstName text,
LastName text,
email text,
Mobile bigint,
salary bigint
);

select * from employee;

insert into employee
values
(1,'Tapan','Bhatt','tapan@yahoo.com',7777777777,70000),
(2,'Suraj','Bhatt','suraj@yahoo.com',8888888888,80000),
(3,'Nihar','Bhatt','nihar@yahoo.com',2222222222,90000),
(4,'Rajesh','Bhatt','rajesh@yahoo.com',4444444444,60000),
(5,'Anubhav','Bhatt','anubhav@yahoo.com',9999999999,30000);

select * from employee;

update employee set FirstName='vaibhav' where id=1;
