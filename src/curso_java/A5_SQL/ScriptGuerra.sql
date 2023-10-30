DROP TABLE IF EXISTS TB_PELOTON;
DROP TABLE IF EXISTS TB_GUERRERO;

CREATE TABLE TB_PELOTON (
    Id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT "id autoincremental",
    Nombre varchar(20) not null COMMENT "NOMBRE PELOTON",
    Ataque NUMERIC(2) NOT NULL DEFAULT 5,
    Defensa NUMERIC(2) NOT NULL DEFAULT 5,
    Tipo ENUM('jinetesTristan','carroCarnicero') NOT NULL
);


CREATE TABLE TB_GUERRERO (
    Id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT "id autoincremental",
    Nombre varchar(15) not null COMMENT "NOMBRE GUERRERO",
    Fuerza NUMERIC(2) NOT NULL DEFAULT 5,
    Resistencia NUMERIC(2) NOT NULL DEFAULT 5,
    Vehiculo_id INTEGER NOT NULL, 
    FOREIGN KEY (Vehiculo_id) REFERENCES TB_PELOTON (id)
);


INSERT INTO TB_PELOTON (nombre, tipo) 
VALUES ("HOWEZAR", "jinetesTristan");

INSERT INTO TB_PELOTON (nombre, tipo, ataque, defensa) 
VALUES ("CARROCERO", "carroCarnicero", 10, 0);

--SELECT * FROM TB_PELOTON;

INSERT INTO TB_GUERRERO (nombre, vehiculo_id)
VALUES ("GUERRERO1", 1);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id)
VALUES ("GUERRERO2", 1);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id)
VALUES ("GUERRERO3", 1);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id)
VALUES ("GUERRERO4", 1);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id)
VALUES ("GUERRERO5", 1);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id)
VALUES ("GUERRERO6", 1);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id)
VALUES ("GUERRERO7", 1);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id)
VALUES ("GUERRERO8", 1);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id)
VALUES ("GUERRERO9", 1);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id)
VALUES ("GUERRERO10", 1);




INSERT INTO TB_GUERRERO (nombre, vehiculo_id, fuerza, resistencia)
VALUES ("Guerrero11", 2, 7, 3);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id, fuerza, resistencia)
VALUES ("Guerrero12", 2, 7, 3);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id, fuerza, resistencia)
VALUES ("Guerrero13", 2, 7, 3);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id, fuerza, resistencia)
VALUES ("Guerrero14", 2, 7, 3);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id, fuerza, resistencia)
VALUES ("Guerrero15", 2, 7, 3);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id, fuerza, resistencia)
VALUES ("Guerrero16", 2, 7, 3);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id, fuerza, resistencia)
VALUES ("Guerrero17", 2, 7, 3);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id, fuerza, resistencia)
VALUES ("Guerrero18", 2, 7, 3);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id, fuerza, resistencia)
VALUES ("Guerrero19", 2, 7, 3);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id, fuerza, resistencia)
VALUES ("Guerrero20", 2, 7, 3);

--SELECT * FROM TB_GUERRERO;


