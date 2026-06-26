INSERT INTO client (name) VALUES
                              ('Google'),
                              ('Amazon'),
                              ('Microsoft');

INSERT INTO worker (name, birthday, level, salary) VALUES
                                                       ('Ivan Petrenko', '1995-04-10', 'Middle', 3000),
                                                       ('Olena Shevchenko', '1998-08-22', 'Junior', 1000),
                                                       ('Andrii Kovalenko', '1990-01-15', 'Senior', 5000),
                                                       ('Maria Bondarenko', '2000-12-01', 'Trainee', 700);

INSERT INTO project (client_id, start_date, finish_date) VALUES
                                                             (1, '2023-01-01', '2023-03-01'),
                                                             (1, '2023-04-01', '2023-08-01'),
                                                             (2, '2023-02-01', '2023-05-15'),
                                                             (3, '2023-06-01', '2023-12-01');

INSERT INTO project_worker (project_id, worker_id) VALUES
                                                       (1, 1),
                                                       (1, 2),
                                                       (2, 1),
                                                       (2, 3),
                                                       (3, 2),
                                                       (4, 3),
                                                       (4, 4);