CREATE DATABASE Mail


CREATE TABLE  "USER"
   (	
	ID int IDENTITY(1,1) PRIMARY KEY, 
	NAME NVARCHAR(200) NOT NULL, 
	EMAIL NVARCHAR(200) UNIQUE NOT NULL, 
	PASSWORD NVARCHAR(200) NOT NULL, 
	GENDER NVARCHAR(100) NOT NULL, 
	DOB DATE NOT NULL, 
	ADDRESSLINE NVARCHAR(1000) NOT NULL, 
	CITY NVARCHAR(200), 
	STATE NVARCHAR(200), 
	COUNTRY NVARCHAR(200), 
	CONTACT NVARCHAR(300), 
	REGISTEREDDATE DATE,
	isAdmin bit DEFAULT '0',
	avatar varchar(200) DEFAULT 'uploadavatar/default.png'
   )


CREATE TABLE  "MESSAGE" 
   (	
	ID int IDENTITY(1,1) PRIMARY KEY, 
	SENDER NVARCHAR(200) NOT NULL, 
	RECEIVER NVARCHAR(200) , 
	SUBJECT NVARCHAR(500), 
	MESSAGE NVARCHAR(2000), 
	TRASH NVARCHAR(200) , 
	MESSAGEDATE DATE NOT NULL, 
   );

