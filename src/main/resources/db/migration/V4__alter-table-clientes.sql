ALTER TABLE clientes
    ADD logradouro VARCHAR(255) NOT NULL,
    ADD bairro VARCHAR(100) NOT NULL,
    ADD cidade VARCHAR(255) NOT NULL,
    ADD cep VARCHAR(8) NOT NULL,
    ADD uf VARCHAR(2) NOT NULL,
    ADD complemento VARCHAR(100),
    ADD numero VARCHAR(10);

ALTER TABLE clientes ADD CONSTRAINT chk_cep CHECK (cep REGEXP '^[0-9]{8}$');
ALTER TABLE clientes ADD CONSTRAINT chk_uf  CHECK (uf REGEXP '^[A-Z]{2}$');