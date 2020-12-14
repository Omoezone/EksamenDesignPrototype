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
    result_test_date DATE,
    result_test_languange varchar(45) not null,
    result_score int not null,
    result_stress_level int not null,
     CONSTRAINT result_fk_bruger
		FOREIGN KEY (bruger_id) REFERENCES bruger (bruger_id)
);

CREATE TABLE IF NOT EXISTS question (
	question_id int not null auto_increment unique primary key,
    question_text varchar(60),
    question_type varchar(45)
);
INSERT INTO login VALUES('wilTest@hotstuff.dk','123456','Type1');
INSERT INTO bruger VALUES(1,1,'wilTest@hotstuff.dk','William','Omoe',88888888,'male',22,'Denmark','KEA','Student','Datamatik');
INSERT INTO question (question_text, question_type) VALUES
('Hovedepine',1),
('Hjertebanken',1),
('Trykken for brystet',1),
('Svimmelhed',1),
('Ondt i maven',1),
('Diare',1),
('Hyppig vandladning',1),
('Ondt i kroppen',1),
('Haft svært ved at huske',1),
('haft koncentrationsbesvær',1),
('Haft svært ved at tage besultninger',1),
('haft svært ved at tænkte klart',1),
('Følt dig rastløs',1),
('Været irritabel',1),
('Følt dig trist/deprimeret',1),
('Haft angstanfald',1),
('Haft svært ved at falde i søvn',1),
('Haft svært ved at sove igennem',1),
('Været meget nervøs',1),
('Ikke orket at beskæftige dig med noget',1),
('Været initiativløs',1),
('Følt dig træt',1),
('Røget mere end du plejer',1),
('Drukket mere alkohol/spist sukker end du plejer',1)
;
SELECT * FROM question;
SELECT login_email, login_password FROM login WHERE login_email = 'wilTest@hotstuff.dk' AND login_password = '123456';