-- DADOS DE INSERT NAS 4 TABELAS INICIAIS
-- Insert Motorista
INSERT INTO VEM_SER.MOTORISTA
(ID_MOTORISTA, ID_USUARIO, NOME, CNH)
VALUES(seq_motorista.nextval, 2, 'Joao', '34354536');

INSERT INTO VEM_SER.MOTORISTA
(ID_MOTORISTA, ID_USUARIO, NOME, CNH)
VALUES(seq_motorista.nextval, 2, 'Mauricio', '543543545');


--INSERT Colaborador
INSERT INTO VEM_SER.COLABORADOR
(ID_COLABORADOR, ID_USUARIO, NOME, CPF)
VALUES(seq_colaborador.nextval, 1, 'Lucas', '5454545');

INSERT INTO VEM_SER.COLABORADOR
(ID_COLABORADOR, ID_USUARIO, NOME, CPF)
VALUES(seq_colaborador.nextval, 1, 'Alan', '889899');


-- Insert Caminhão
INSERT INTO VEM_SER.CAMINHAO
(ID_CAMINHAO, ID_COLABORADOR, NOME, PLACA)
VALUES(seq_caminhao.nextval, 1, 'Scania', '5435435');

INSERT INTO VEM_SER.CAMINHAO
(ID_CAMINHAO, ID_COLABORADOR, NOME, PLACA)
VALUES(seq_caminhao.nextval, 2, 'Scania2', '54546');


-- Insert usuario
INSERT INTO VEM_SER.USUARIO
(ID_USUARIO, USUARIO, SENHA, IDENTIFICADOR)
VALUES(seq_usuario.nextval, 'user1', '123', 'C');

INSERT INTO VEM_SER.USUARIO
(ID_USUARIO, USUARIO, SENHA, IDENTIFICADOR)
VALUES(seq_usuario.nextval, 'user2', '123', 'M');