INSERT INTO gate (gate_no, gate_size)
VALUES
    (1, 's'),
    (2, 's'),
    (3, 's'),
    (4, 'm'),
    (5, 'm'),
    (6, 'm'),
    (7, 'l'),
    (8, 'l');

INSERT INTO planes (icao, is_clean, has_gas, model, has_passengeres, size, gate_id)
VALUES
('F100', false, false, 'Fokker 100', true, 'm', 1),
('B461', false, false, 'BAe 146-100 Pax', true, 'm', 5),
('B462', false, false, 'BAe 146-200 Pax', true, 'm', 3),
('B463', false, false, 'BAe 146-300 Pax', true, 'm', 7),
('B461', false, false, 'BAe 146 Freighter (-100QT & QC)', true, 'm', 4),
('B462', false, false, 'BAe 146 Freighter (-200QT & QC)', true, 'm', 8),
('B463', false, false, 'BAe 146 Freighter (-100QT & QC)', true, 'm', 4),
('B463', false, false, 'BAe 146 Freighter (-100QT & QC)', true, 'm', 2);

INSERT INTO airport(country)
VALUES
('Poland'),
('Italy'),
('Sweden'),
('Russia'),
('UK'),
('Italy'),
('Germany'),
('Greece'),
('Germany'),
('Germany');



INSERT INTO flight (arrival_depart, date, route_no, time_ofad, airport_id, plane_id)
VALUES
('a', '2019-12-19', 'D83563', '00:10:00', 1, 1),
('a', '2019-12-19', 'JTG360', '00:10:00', 2, 2),
('a', '2019-12-19', 'SK9250', '00:10:00', 2, 3),
('d', '2019-12-19', 'SU2497', '00:10:00', 2, 4),
('a', '2019-12-19', 'SK1546', '00:35:00', 2, 5),
('a', '2019-12-19', 'D83733', '00:40:00', 2, 2),
('a', '2019-12-19', 'QY174', '01:35:00', 2, 6),
('a', '2019-12-19', 'DK1169', '02:30:00', 2, 7),
('d', '2019-12-19', 'QY179', '02:35:00', 2, 6),
('a', '2019-12-19', 'QY388', '03:35:00', 2, 6);



INSERT INTO employee (title)
VALUES
('Cleaning'),
('Taxi'),
('Gas');

INSERT INTO task (description, exp_time, real_time, employee_id, plane_id, distance_to_gate)
VALUES
('Cleaning done', 15, 18, 1, 1, 30 ),
('Filled with gas', 10, 12, 3, 1, 35),
('Passengers gathered', 20, 18, 2, 1, 27);