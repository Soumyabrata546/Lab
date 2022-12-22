use soumyadb;
create table Student_join(
id int primary key,
Fname varchar(20) ,
Lname varchar(20),
Age int (10),
City varchar(10),
Form_no varchar(2));
insert into Student_join values
(1,'Bishnupriya',"Sethi",23,'Mumbai',"A1"),
(2,'SOumya',"Charterjee",23,'Kolkayta',"A2"),
(3,'ABhishek',"Mondal",22,'Mumbai',"A3"),
(4,'Akshay',"Sethi",23,'Mumbai',"A4"),
(5,'Nisha',"Suthadhar",24,'Asn',"A5"),
(6,'RAkesh',"Mohanty",26,'Jaipur',"A6"),
(7,'Sourav',"DAs",23,'UDL',"A7"),
(8,'Raja',"Sethi",23,'Mumbai',"A8"),
(9,'Atif',"Ansari",23,'Kolkata',"A9"),
(10,'Shifa',"Iqbal",20,'Rampurhat',"b1");
#foreign key
create table fees(
Form_no varchar(4) primary key,FOREIGN KEY (form_no) REFERENCES Student_join(Form_no)
,amount int,course varchar(15));

insert into fees values
("A1",4000,'java'),
("A2",4000,'java'),
("A3",5000,'python'),
("A4",3000,'java'),
("A5",2000,'c++'),
("A6",5500,'java'),
("A7",4000,'dsa'),
("A8",6000,'dsa'),
("A9",4000,'c++'),
("b1",7000,'c#');
