CREATE TABLE cargo (
    id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(250) NOT NULL,
    descricao VARCHAR(500),
    salario DECIMAL(10,2) NOT NULL,
    cbo_1994 VARCHAR(50),
    cbo_2002 VARCHAR(50)
);

/* CARGO */
INSERT INTO cargo (id, nome, descricao, salario, cbo_1994, cbo_2002) VALUES (1, 'ADMINISTRADOR', NULL, 5000, NULL, '252105');