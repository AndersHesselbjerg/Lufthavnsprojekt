INSERT INTO planes (icao, is_clean, has_gas, model, has_passengeres, size, gate_id)
VALUES
('F100', false, false, 'Fokker 100', true, 'm', null),
('B461', false, false, 'BAe 146-100 Pax', true, 'm', null),
('B462', false, false, 'BAe 146-200 Pax', true, 'm', null),
('B463', false, false, 'BAe 146-300 Pax', true, 'm', null),
('B461', false, false, 'BAe 146 Freighter (-100QT & QC)', true, 'm', null),
('B462', false, false, 'BAe 146 Freighter (-200QT & QC)', true, 'm', null),
('B463', false, false, 'BAe 146 Freighter (-100QT & QC)', true, 'm', null),
('B463', false, false, 'BAe 146 Freighter (-100QT & QC)', true, 'm', null);

INSERT INTO airport(country)
VALUES
('Denmark'),
('Sweden');

INSERT INTO flight (arrival_depart, date, route_no, time_ofad, airport_id, plane_id)
VALUES
('a', '2021-10-07', 'D8 3563', '10:20:48', 1, 1),
('d', '2021-10-07', '101', '10:50:30', 2, 1);


INSERT INTO employee (title)
VALUES
('Cleaning'),
('Taxi'),
('Gas');

INSERT INTO task (description, exp_time, real_time, employee_id, plane_id)
VALUES
('Cleaning done', 15, 18, 1, 1),
('Filled with gas', 10, 12, 3, 1),
('Passengers gathered', 20, 18, 2, 1);