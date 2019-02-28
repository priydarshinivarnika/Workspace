CREATE SEQUENCE address_id_seq;

CREATE SEQUENCE employee_id_seq;

CREATE TABLE ADDRESS (
 ID integer DEFAULT nextval('address_id_seq') primary key,
 CITY varchar(11) NOT NULL ,
 STATE varchar(100) DEFAULT NULL,
 STREET_NUM varchar(100) DEFAULT NULL,
 ZIP varchar(100) DEFAULT NULL
);

CREATE TABLE EMPLOYEE(
 ID integer DEFAULT nextval('employee_id_seq')  primary key,
 EMPLOYEE_ID varchar(20) unique NOT NULL,
 FIRST_NAME varchar(11) NOT NULL ,
 LAST_NAME varchar(100) DEFAULT NULL,
 SALARY varchar(100) DEFAULT NULL,
 ADDRESS_ID integer NOT null,
 constraint employee_address_key foreign key (ADDRESS_ID) references ADDRESS (ID)
);
