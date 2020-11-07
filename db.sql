DROP TABLE COMPANY_MAILER_MESSAGE
DROP TABLE COMPANY_MAILER_USER

CREATE TABLE  "USER"
   (	
	ID int IDENTITY(1,1) PRIMARY KEY, 
	NAME NVARCHAR(4000) NOT NULL, 
	EMAIL NVARCHAR(4000) UNIQUE NOT NULL, 
	PASSWORD NVARCHAR(4000) NOT NULL, 
	GENDER NVARCHAR(4000) NOT NULL, 
	DOB DATE NOT NULL, 
	ADDRESSLINE NVARCHAR(4000) NOT NULL, 
	CITY NVARCHAR(4000), 
	STATE NVARCHAR(4000), 
	COUNTRY NVARCHAR(4000), 
	CONTACT NVARCHAR(4000), 
	REGISTEREDDATE DATE
   )


CREATE TABLE  "MESSAGE" 
   (	
	ID int IDENTITY(1,1) PRIMARY KEY, 
	SENDER NVARCHAR(4000) NOT NULL, 
	RECEIVER NVARCHAR(4000) , 
	SUBJECT NVARCHAR(4000), 
	MESSAGE NVARCHAR(4000), 
	TRASH NVARCHAR(4000) , 
	MESSAGEDATE DATE NOT NULL, 
   );


   SELECT * FROM dbo."USER"
