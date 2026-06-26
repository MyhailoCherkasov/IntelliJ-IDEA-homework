DROP TABLE IF EXISTS project_worker;
DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS worker;
DROP TABLE IF EXISTS client;

CREATE TABLE client (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(100) NOT NULL
);

CREATE TABLE worker (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(100) NOT NULL,
                        birthday DATE NOT NULL,
                        level VARCHAR(20) NOT NULL,
                        salary INT NOT NULL
);

CREATE TABLE project (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         client_id INT NOT NULL,
                         start_date DATE NOT NULL,
                         finish_date DATE NOT NULL,
                         FOREIGN KEY (client_id) REFERENCES client(id)
);

CREATE TABLE project_worker (
                                project_id INT NOT NULL,
                                worker_id INT NOT NULL,
                                PRIMARY KEY (project_id, worker_id),
                                FOREIGN KEY (project_id) REFERENCES project(id),
                                FOREIGN KEY (worker_id) REFERENCES worker(id)
);