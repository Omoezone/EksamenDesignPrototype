DROP DATABASE IF EXISTS prototypeDB;
CREATE DATABASE prototypeDB;
USE prototypeDB;
-- Mangler at blive lavet foreign keys

CREATE TABLE IF NOT EXISTS login (
	login_email varchar(45) not null unique primary key,
    login_password varchar(45) not null,
    login_type varchar(45) not null
);

CREATE TABLE IF NOT EXISTS bruger (
	bruger_id int not null auto_increment unique primary key,
	kunde_id int not null,
	bruger_email varchar(45) not null,
	bruger_firstName varchar(45) not null,
	bruger_lastName varchar(45) not null,
	bruger_telephone int not null,
	bruger_gender varchar(20) not null,
	bruger_age int not null,
	bruger_country varchar(45) not null,
	bruger_department varchar(45) not null,
	bruger_funktion varchar(45) not null,
	bruger_education varchar(45) not null,
    CONSTRAINT bruger_fk_login
		FOREIGN KEY (bruger_email) REFERENCES login (login_email)
);

CREATE TABLE IF NOT EXISTS admin_ (
	admin_id int not null auto_increment unique primary key,
    admin_email varchar(45) not null,
    admin_firstName varchar(45) not null,
    admin_lastName varchar(45) not null
);

CREATE TABLE IF NOT EXISTS result (
	result_id int not null auto_increment unique primary key,
    bruger_id int not null,
    kvantitiv_id int not null,
    result_test_date DATE,
    result_test_languange varchar(45) not null
);

CREATE TABLE IF NOT EXISTS question (
	question_id int not null auto_increment unique primary key,
    question_text varchar(60),
    question_type varchar(45)
);
INSERT INTO login VALUES('wilTest@hotstuff.dk','123456','Type1');
INSERT INTO bruger VALUES(1,1,'wilTest@hotstuff.dk','William','Omoe',88888888,'male',22,'Denmark','KEA','Student','Datamatik');

SELECT * FROM bruger;
SELECT * FROM bruger JOIN login WHERE bruger_email = login_email AND login_password = 123456;