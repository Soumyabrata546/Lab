USE soumyadb;

# 1. Create the following table CUSTOMER
create table CUSTOMER1(
Cust_id varchar(5) primary key ,
Fname varchar(15),
Lname varchar(15),
Area char(2) not null,
Phone int(10)
);
# 2. Create the following table Movie

create table Movie
( mv_no int(20)primary key,
  cust_id varchar(20),
  title varchar(20)not null,
  star varchar(2)not null,
  price int(5),
  foreign key(cust_id)references customer(cust_id)
);
drop table movie;
create table Movie(
Mv_no int primary key,
Cust_id varchar(4),foreign key(Cust_id) references Customer1(Cust_id),
Title varchar (25) not null,
Star varchar (2) not null,
Price int (5));
#inserting value in Customer
insert into customer1 values('A01','ivan','ross','sa',6125467);
insert into customer1 values('A02','vandana','ray','mu',5560379);
insert into customer1 values('A03','pramada','jauguste','da',4560389);
insert into customer1 values('A04','basti','navindi','ba',6125401);
insert into customer1 values('A05','ravi','shridhar','na',null);
insert into customer1 values('A06','rukmini','ajyer','gh',5125274);

#inserting value in Movie
insert into Movie values
(1,'a02','bloody','jc',181),
(2,'a04','the firm','tc',200),
(3,'a01','pretty woman','rg',151),
(4,'a06','home alone','mc',150),
(5,'a05','the fugitive','mf',200),
(6,'a03','coma','md',100),
(7,'a02','dracula','go',150),
(8,'a06','quick change','bm',100),
(9,'a03','gone with the cb','jc',200),
(10,'a05','carry on doctor','lp',100);
#5. Display the movie titles, whose price is greater than 100 but less than 200.
select Title from Movie
where price between 100 and 200;
#6. Display the cust_id who have seen movies having stars as either JC or TC or MC.
select cust_id from movie 
where star = 'jc'or star='tc' or star='mc';
#7. Display the details of those customers who have an A in their area name.
select area from customer1 
where area like '_a%';
#8. Display the movie titles, whose price is within 180 and the movie titles are of exactly 6 characters.
select title from movie 
where Price=180 and Length(title)=6;
#9. Display the movie name, their original prices and the prices after 10% increment. Give alias name to the incremented price column.
select title, price, price+(price*1/10) as incremented_price_column  from movie;
#10. Display all the customer details in the following way:
#‘Ivan Ross stays in SA and his phone number is 6125467.’

#11. Add a not null constraint to the Lname field in Customer.
alter table customer1 
modify lname varchar(15) not null;
#12.Display the customer’s name whose phone number is not recorded
select fname,lname from customer1
where phone is null;
#13. Add the phone number according to your own wish for the person mentioned in problem no 12.
update customer1
set phone=97255
where phone is null;
#14. Display the unique customer ids from movie table.
select distinct cust_id from movie;
#15. Remove the not null constraint from Star column in movie table.
alter table movie modify Star varchar (2) null;
#16. Delete any row from the Customer table. If you cannot delete, then note the error message displayed.
delete from customer1
where cust_id='a02';#unable to delete for foreign key constraint
#17. Delete any row from the Movie table. If you cannot delete, then note the error message displayed.
delete from movie 
where mv_no=3;
#18. Drop the Customer table. If you cannot drop, then note the error message displayed.
drop table customer; 
#19. Drop the Movie table. If you cannot drop, then note the error message displayed.
drop table movie;
#20. Drop the foreign key from Movie table.
alter table movie
drop column cust_id;
