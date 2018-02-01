CREATE TABLE sys.student
(
    id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name varchar(20),
    create_time timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
    update_time timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL
);
INSERT INTO sys.student (id, name, create_time, update_time) VALUES (1, 'qianyunlong', '2018-02-01 19:10:56', '2018-02-01 18:53:13');
INSERT INTO sys.student (id, name, create_time, update_time) VALUES (2, 'huiming', '2018-02-01 19:13:12', '2018-02-01 19:13:12');
INSERT INTO sys.student (id, name, create_time, update_time) VALUES (3, 'duke', '2018-02-01 19:54:26', '2018-02-01 19:54:26');