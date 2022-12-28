create table department(
	Department_ID  int  Primary Key ,
	Department_Name   Varchar(20) unique,
	Department_Head  Varchar(20),
	Department_Description  Varchar(20));

create table employee(
	Employee_Id int  Primary key,
	Employee_Name Varchar(20) unique,
	Employee_Address  Varchar(10),
	Employee_Salary  double(6,2),
	Employee_Contact_No int,
	Department_Id  int,foreign key(Department_Id) references department(Department_Id),
     CHECK (Employee_Salary between 1000 and 1000000));
