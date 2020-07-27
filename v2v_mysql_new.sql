create database v2v1;

use v2v1;

select * from registration;

select * from user;

CREATE TABLE `user` (
	`User_Id` bigint(20) NOT NULL AUTO_INCREMENT,
	`User_Role_Id` bigint(20) NOT NULL,
	`User_Name` varchar(30) NOT NULL UNIQUE,
	`User_Email` varchar(50) NOT NULL UNIQUE,
	`User_Dob` DATE NOT NULL,
	`User_Address` varchar(255) NOT NULL,
	PRIMARY KEY (`User_Id`)
);

CREATE TABLE `role` (
	`Role_Id` bigint NOT NULL,
	`Role_Title` varchar(20) NOT NULL,
	`Role_Desc` varchar(255) NOT NULL,
	PRIMARY KEY (`Role_Id`)
);

CREATE TABLE `permission` (
	`Permission_Id` bigint NOT NULL,
	`Permission_Role_Id` bigint NOT NULL,
	`Permission_Title` varchar(20) NOT NULL,
	`Permission_Module` varchar(20) NOT NULL,
	`Permission_Desc` varchar(255) NOT NULL,
	PRIMARY KEY (`Permission_Id`)
);


CREATE TABLE `customer` (
	`Customer_Id` bigint NOT NULL AUTO_INCREMENT,
	`Customer_Name` varchar(20) NOT NULL,
	`Customer_Mobile` varchar(20) NOT NULL,
	`Customer_Email` varchar(50) NOT NULL,
	`Customer_Address` varchar(255) NOT NULL,
	`Customer_User_Name` varchar(20) NOT NULL,
	`Customer_Password` varchar(20) NOT NULL,
	PRIMARY KEY (`Customer_Id`)
);
select * from customer;
CREATE TABLE `office` (
	`Office_Id` bigint NOT NULL AUTO_INCREMENT,
	`Office_Employee_Id` bigint NOT NULL,
	`Office_Type` varchar(25) NOT NULL,
	`Office_Name` varchar(50) NOT NULL,
	`Office_Desc` varchar(255) NOT NULL,
	`Office_Place` varchar(25) NOT NULL,
	`Office_Company_Id` bigint(25) NOT NULL,
	PRIMARY KEY (`Office_Id`)
);

CREATE TABLE `delivery` (
	`Delivery_Id` bigint NOT NULL AUTO_INCREMENT,
	`Delivery_Address` varchar(255) NOT NULL,
	`Delivery_Desc` varchar(255) NOT NULL,
	`Delivery_Type` varchar(50) NOT NULL,
	`Delivery_By` varchar(50) NOT NULL,
	`Delivery_Date` DATE NOT NULL,
	`Delivery_Customer_Id` bigint NOT NULL,
	PRIMARY KEY (`Delivery_Id`)
);
select * from delivery where Delivery_Id = 1;
update delivery set Delivery_Date = "2020-02-02" where  Delivery_Id = 1;
Alter table delivery add column Delivery_Person_Name varchar(20);

update delivery set Delivery_Person_Name = "Ramswamy" where Delivery_Id = 1;

CREATE TABLE `courier1` (
	`Courier_Id` bigint NOT NULL AUTO_INCREMENT,
	`Courier_Name` varchar(50) NOT NULL,
	`Courier_Desc` varchar(255) NOT NULL,
	`Courier_Type` varchar(50) NOT NULL,
	`Courier_Product_Id` bigint NOT NULL,
	`Courier_Customer_Id` bigint NOT NULL,
	`Courier_Current_Location` varchar(50) NOT NULL,
	`Courier_Deli_Id` bigint NOT NULL,
	PRIMARY KEY (`Courier_Id`)
);

insert into courier1 values(1,"aasf","asdfa","adfa",1,1,"sdfs",1);
insert into courier1 values(2,"BlueDart","BlueDart courier","Electronics",1,1,"Chennai",1);
select * from courier1;
insert into product values(1,"asdfs","asdf",100);
insert into product values(2,"Adidas shoe","The shoe brand belongs to .....",200);
insert into customer values(1,"asdf","adsf","adfa","adfas","asdfas","asdfsa");
insert into customer values(2,"Ram lingam","8358788596","ramlingam@gmail.com","chennai,DLF","ramlingam","ramlingam1785");
insert into delivery values(1,"asf","asdf","sdf","asf",01/01/2020,1);
select * from delivery;

CREATE TABLE `manager` (
	`Manager_Id` bigint NOT NULL AUTO_INCREMENT,
	`Manager_Address` varchar(255) NOT NULL,
	`Manager_Name` varchar(50) NOT NULL,
	`Manager_Mobile` varchar(10) NOT NULL,
	`Manager_Email` varchar(50) NOT NULL,
	`Manager_User_Name` varchar(50) NOT NULL UNIQUE,
	`Manager_Password` varchar(50) NOT NULL,
	PRIMARY KEY (`Manager_Id`)
);

CREATE TABLE `product` (
	`Product_Id` bigint NOT NULL AUTO_INCREMENT,
	`Product_Name` varchar(50) NOT NULL,
	`Product_Desc` varchar(255) NOT NULL,
	`Product_Price` bigint NOT NULL,
	PRIMARY KEY (`Product_Id`)
);

CREATE TABLE `login` (
	`Login_Id` bigint NOT NULL AUTO_INCREMENT,
	`Login_Role_Id` bigint NOT NULL,
	`Login_User_Name` varchar(50) NOT NULL,
	`Login_User_Password` varchar(50) NOT NULL,
	PRIMARY KEY (`Login_Id`)
);
use v2v1;
select * from customer;
select * from user;
CREATE TABLE `registration` (
	`User_Name` varchar(50) NOT NULL,
	`Password` varchar(50) NOT NULL,
	`Email` varchar(50) NOT NULL,
	`Role` varchar(50) NOT NULL,
	PRIMARY KEY (`User_Name`)
);

ALTER TABLE `user` ADD CONSTRAINT `user_fk0` FOREIGN KEY (`User_Role_Id`) REFERENCES `role`(`Role_Id`);

ALTER TABLE `user` ADD CONSTRAINT `user_fk1` FOREIGN KEY (`User_Name`) REFERENCES `registration`(`User_Name`);

ALTER TABLE `permission` ADD CONSTRAINT `permission_fk0` FOREIGN KEY (`Permission_Role_Id`) REFERENCES `role`(`Role_Id`);

ALTER TABLE `delivery` ADD CONSTRAINT `delivery_fk0` FOREIGN KEY (`Delivery_Customer_Id`) REFERENCES `customer`(`Customer_Id`);

ALTER TABLE `courier1` ADD CONSTRAINT `courier1_fk0` FOREIGN KEY (`Courier_Product_Id`) REFERENCES `product`(`Product_Id`);

ALTER TABLE `courier1` ADD CONSTRAINT `courier1_fk1` FOREIGN KEY (`Courier_Customer_Id`) REFERENCES `customer`(`Customer_Id`);

ALTER TABLE `courier1` ADD CONSTRAINT `courier1_fk2` FOREIGN KEY (`Courier_Deli_Id`) REFERENCES `delivery`(`Delivery_Id`);

ALTER TABLE `login` ADD CONSTRAINT `login_fk0` FOREIGN KEY (`Login_Role_Id`) REFERENCES `role`(`Role_Id`);
