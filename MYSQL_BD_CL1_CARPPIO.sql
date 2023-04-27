set global time_zone = '+8:00';
DROP DATABASE IF EXISTS CL1_Carpio;
CREATE DATABASE CL1_Carpio;
USE CL1_Carpio;
CREATE TABLE IF NOT EXISTS Doctores(
id_doctor int NOT NULL AUTO_INCREMENT COMMENT 'Id de Doctor',
nom_doctor varchar(75) NOT NULL COMMENT 'Nombre del Doctor',
 especialidad_doctor varchar(75) COMMENT 'Especialidad del Doctor',
 PRIMARY KEY (`id_doctor`)
);
CREATE TABLE IF NOT EXISTS Citas(
id_cita int NOT NULL AUTO_INCREMENT COMMENT 'Id de Cita',
num_cita varchar(75) NOT NULL COMMENT 'Numero de Cita',
fecha_cita varchar(75) NOT NULL COMMENT 'Fecha de Cita',
nom_paciente_cita varchar(75) NOT NULL COMMENT 'Nombre de Paciente',
cod_doctor int COMMENT 'Codigo Doctor',
PRIMARY KEY (`id_cita`),
FOREIGN KEY (cod_doctor) REFERENCES Doctores(id_doctor)
);
select * from Doctores