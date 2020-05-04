INSERT INTO OPERATORS (name) VALUES
	('PKP Intercity'),
	('PKP Przewozy Regionalne'),
	('PKP Cargo');
INSERT INTO STATIONS (name) VALUES
	('Warszawa'),
	('Gdańsk'),
	('Mrągowo'),
	('Kraków'),
	('Gdynia'),
	('Olsztyn'),
	('Iława'),
	('Sopot'),
	('Tczew');
INSERT INTO LINES (name, operator_id, departure_station_id, arrival_station_id) VALUES
	('PKP Intercity Warszawa-Gdynia', 1, 1, 5), --1
	('PKP Przewozy Regionalne Gdańsk-Mrągowo', 2, 2, 3), --2
	('PKP Intercity Gdynia-Warszawa', 1, 5, 1), --3
	('PKP Przewozy Regionalne Mrągowo-Gdańsk', 2, 3, 2); --4
INSERT INTO OPERATIONAL_INTERVALS (name, start_date, end_date) VALUES
	('Wakacje 2019', '2019-06-30', '2019-09-30');
INSERT INTO OPERATIONAL_INTERVALS (name, start_date, end_date, on_saturday, on_sunday) VALUES
	('Rok szkolny 2018-19', '2018-09-01', '2019-06-29', false, false),
	('Rok szkolny 2019-20', '2019-09-02', '2020-06-15', false, false);
INSERT INTO OPERATIONAL_INTERVALS (name, start_date, end_date) VALUES
	('2017', '2017-01-02', '2017-12-30'),
	('2018', '2018-01-02', '2018-12-30'),
	('2019', '2019-01-02', '2019-12-30'),
	('2020', '2020-01-02', '2020-12-30'),
	('2021', '2021-01-02', '2021-12-30'),
	('2022', '2022-01-02', '2022-12-30');
/* PKP Intercity Warszawa-Gdynia */
INSERT INTO TRIPS (line_id, operational_interval_id, departure_time, arrival_time) VALUES
	(1, 1, '04:00', '07:00'),--1
	(1, 2, '07:00', '09:50'),
	(1, 3, '07:00', '09:50'),
	(1, 1, '10:00', '15:00'),
	(1, 1, '16:00', '19:00'),--5
	(1, 1, '20:00', '23:00');--6
/* PKP Przewozy Regionalne Gdańsk-Mrągowo */
INSERT INTO TRIPS (line_id, operational_interval_id, departure_time, arrival_time) VALUES
	(2, 1, '04:30', '10:00'),--7
	(2, 2, '07:30', '13:50'),
	(2, 3, '07:30', '13:50'),
	(2, 1, '10:30', '17:00'),
	(2, 1, '16:30', '23:00');--11
/* PKP Intercity Warszawa-Gdynia 04:00 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(1, 1, NULL, '04:00', 'peron 1'),
	(1, 7, '05:00', '05:05', 'peron 1'),
	(1, 9, '06:30', '06:34', 'peron 1'),
	(1, 2, '06:40', '06:45', 'peron 1'),
	(1, 8, '06:50', '06:55', 'peron 1'),
	(1, 5, '07:00', NULL, 'peron 2');
/* PKP Intercity Warszawa-Gdynia 07:00 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(2, 1, NULL, '07:00', 'peron 1'),
	(2, 7, '08:00', '08:05', 'peron 1'),
	(2, 9, '09:30', '09:34', 'peron 1'),
	(2, 2, '09:40', '09:45', 'peron 1'),
	(2, 8, '09:50', '09:55', 'peron 1'),
	(2, 5, '09:50', NULL, 'peron 2');
/* PKP Intercity Warszawa-Gdynia 07:00 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(3, 1, NULL, '07:00', 'peron 1'),
	(3, 7, '08:00', '08:05', 'peron 1'),
	(3, 9, '09:30', '09:34', 'peron 1'),
	(3, 2, '09:40', '09:45', 'peron 1'),
	(3, 8, '09:50', '09:55', 'peron 1'),
	(3, 5, '09:50', NULL, 'peron 2');
/* PKP Intercity Warszawa-Gdynia 10:00 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(4, 1, NULL, '10:00', 'peron 1'),
	(4, 7, '11:00', '11:05', 'peron 1'),
	(4, 9, '14:30', '14:34', 'peron 1'),
	(4, 2, '14:40', '14:45', 'peron 1'),
	(4, 8, '14:50', '14:55', 'peron 1'),
	(4, 5, '15:00', NULL, 'peron 2');
/* PKP Intercity Warszawa-Gdynia 16:00 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(5, 1, NULL, '16:00', 'peron 1'),
	(5, 7, '17:00', '17:05', 'peron 1'),
	(5, 9, '18:30', '18:34', 'peron 1'),
	(5, 2, '18:40', '18:45', 'peron 1'),
	(5, 8, '18:50', '18:55', 'peron 1'),
	(5, 5, '19:00', NULL, 'peron 2');
/* PKP Intercity Warszawa-Gdynia 20:00 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(6, 1, NULL, '20:00', 'peron 1'),
	(6, 7, '21:00', '21:05', 'peron 1'),
	(6, 9, '22:30', '22:34', 'peron 1'),
	(6, 2, '22:40', '22:45', 'peron 1'),
	(6, 8, '22:50', '22:55', 'peron 1'),
	(6, 5, '23:00', NULL, 'peron 2');
/* PKP Przewozy Regionalne Gdańsk-Mrągowo 04:30 10:00 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(7, 2, NULL, '04:00', 'peron 3'),
	(7, 9, '04:30', '04:35', 'peron 2'),
	(7, 7, '06:00', '06:05', 'peron 2'),
	(7, 6, '08:00', '08:05', 'peron 3'),
	(7, 3, '10:00', NULL, 'peron 1');
/* PKP Przewozy Regionalne Gdańsk-Mrągowo 07:30 13:50 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(8, 2, NULL, '07:30', 'peron 3'),
	(8, 9, '08:00', '08:00', 'peron 2'),
	(8, 7, '10:00', '10:05', 'peron 2'),
	(8, 6, '12:00', '12:05', 'peron 3'),
	(8, 3, '13:50', NULL, 'peron 1');
/* PKP Przewozy Regionalne Gdańsk-Mrągowo 07:30 13:50 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(9, 2, NULL, '07:30', 'peron 3'),
	(9, 9, '08:30', '08:35', 'peron 2'),
	(9, 7, '10:00', '10:05', 'peron 2'),
	(9, 6, '13:00', '13:05', 'peron 3'),
	(9, 3, '13:50', NULL, 'peron 1');
/* PKP Przewozy Regionalne Gdańsk-Mrągowo 10:30 17:00 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(10, 2, NULL, '10:30', 'peron 3'),
	(10, 9, '10:30', '10:35', 'peron 2'),
	(10, 7, '12:00', '12:05', 'peron 2'),
	(10, 6, '15:00', '15:05', 'peron 3'),
	(10, 3, '17:00', NULL, 'peron 1');
/* PKP Przewozy Regionalne Gdańsk-Mrągowo 16:30 23:00 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(11, 2, NULL, '16:30', 'peron 3'),
	(11, 9, '16:30', '16:35', 'peron 2'),
	(11, 7, '18:00', '18:05', 'peron 2'),
	(11, 6, '20:00', '20:05', 'peron 3'),
	(11, 3, '23:00', NULL, 'stage 1');
INSERT INTO TRIP_INFOS (trip_id, description, date_time) VALUES
	(1, 'wagony 1 klasa na poczatku', '2020-05-01T00:00:00.000');
	
/* PKP Intercity Warszawa-Gdynia */
INSERT INTO TRIPS (line_id, operational_interval_id, departure_time, arrival_time) VALUES
	(1, 4, '06:00', '09:00'),--12
	(1, 5, '06:00', '09:00'),
	(1, 6, '06:00', '09:00'),
	(1, 7, '06:00', '09:00'),
	(1, 8, '06:00', '09:00'),
	(1, 9, '06:00', '09:00');--17
/* PKP Intercity Warszawa-Gdynia 06:00 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(12, 1, NULL, '06:00', 'peron 1'),
	(12, 7, '07:00', '07:05', 'peron 1'),
	(12, 9, '08:30', '08:34', 'peron 1'),
	(12, 2, '08:40', '08:45', 'peron 1'),
	(12, 8, '08:50', '08:55', 'peron 1'),
	(12, 5, '09:00', NULL, 'peron 2');
/* PKP Intercity Warszawa-Gdynia 06:00 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(13, 1, NULL, '06:00', 'peron 1'),
	(13, 7, '07:00', '07:05', 'peron 1'),
	(13, 9, '08:30', '08:34', 'peron 1'),
	(13, 2, '08:40', '08:45', 'peron 1'),
	(13, 8, '08:50', '08:55', 'peron 1'),
	(13, 5, '09:00', NULL, 'peron 2');
/* PKP Intercity Warszawa-Gdynia 06:00 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(14, 1, NULL, '06:00', 'peron 1'),
	(14, 7, '07:00', '07:05', 'peron 1'),
	(14, 9, '08:30', '08:34', 'peron 1'),
	(14, 2, '08:40', '08:45', 'peron 1'),
	(14, 8, '08:50', '08:55', 'peron 1'),
	(14, 5, '09:00', NULL, 'peron 2');
/* PKP Intercity Warszawa-Gdynia 06:00 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(15, 1, NULL, '06:00', 'peron 1'),
	(15, 7, '07:00', '07:05', 'peron 1'),
	(15, 9, '08:30', '08:34', 'peron 1'),
	(15, 2, '08:40', '08:45', 'peron 1'),
	(15, 8, '08:50', '08:55', 'peron 1'),
	(15, 5, '09:00', NULL, 'peron 2');
/* PKP Intercity Warszawa-Gdynia 06:00 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(16, 1, NULL, '06:00', 'peron 1'),
	(16, 7, '07:00', '07:05', 'peron 1'),
	(16, 9, '08:30', '08:34', 'peron 1'),
	(16, 2, '08:40', '08:45', 'peron 1'),
	(16, 8, '08:50', '08:55', 'peron 1'),
	(16, 5, '09:00', NULL, 'peron 2');
/* PKP Intercity Warszawa-Gdynia 06:00 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(17, 1, NULL, '06:00', 'peron 1'),
	(17, 7, '07:00', '07:05', 'peron 1'),
	(17, 9, '08:30', '08:34', 'peron 1'),
	(17, 2, '08:40', '08:45', 'peron 1'),
	(17, 8, '08:50', '08:55', 'peron 1'),
	(17, 5, '09:00', NULL, 'peron 2');
/* PKP Intercity Gdynia-Warszawa */
INSERT INTO TRIPS (line_id, operational_interval_id, departure_time, arrival_time) VALUES
	(3, 1, '04:03', '07:03'),--18
	(3, 2, '07:03', '09:53'),
	(3, 3, '07:03', '09:53'),
	(3, 1, '10:03', '15:03'),
	(3, 1, '16:03', '19:03'),
	(3, 1, '20:03', '23:03');--23
/* PKP Przewozy Regionalne Mrągowo-Gdańsk */
INSERT INTO TRIPS (line_id, operational_interval_id, departure_time, arrival_time) VALUES
	(4, 1, '04:33', '10:03'),--24
	(4, 2, '07:33', '13:53'),
	(4, 3, '07:33', '13:53'),
	(4, 1, '10:33', '17:03'),
	(4, 1, '16:33', '23:03');--28
/* PKP Intercity Gdynia-Warszawa 04:03 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(17, 5, NULL, '04:03', 'peron 1'),
	(17, 8, '04:10', '04:15', 'peron 1'),
	(17, 2, '04:25', '04:30', 'peron 1'),
	(17, 9, '06:00', '06:05', 'peron 1'),
	(17, 7, '06:50', '06:55', 'peron 1'),
	(17, 1, '07:03', NULL, 'peron 2');
/* PKP Intercity Gdynia-Warszawa 07:03 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(18, 5, NULL, '07:03', 'peron 1'),
	(18, 8, '08:00', '08:05', 'peron 1'),
	(18, 2, '09:30', '09:34', 'peron 1'),
	(18, 9, '09:40', '09:45', 'peron 1'),
	(18, 7, '09:50', '09:55', 'peron 1'),
	(18, 1, '09:53', NULL, 'peron 2');
/* PKP Intercity Gdynia-Warszawa 07:03 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(19, 5, NULL, '07:03', 'peron 1'),
	(19, 8, '08:00', '08:05', 'peron 1'),
	(19, 2, '09:30', '09:34', 'peron 1'),
	(19, 9, '09:40', '09:45', 'peron 1'),
	(19, 7, '09:50', '09:55', 'peron 1'),
	(19, 1, '09:53', NULL, 'peron 2');
/* PKP Intercity Gdynia-Warszawa 10:03 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(20, 5, NULL, '10:03', 'peron 1'),
	(20, 8, '11:00', '11:05', 'peron 1'),
	(20, 2, '14:30', '14:34', 'peron 1'),
	(20, 9, '14:40', '14:45', 'peron 1'),
	(20, 7, '14:50', '14:55', 'peron 1'),
	(20, 1, '15:03', NULL, 'peron 2');
/* PKP Intercity Gdynia-Warszawa 16:03 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(21, 5, NULL, '16:03', 'peron 1'),
	(21, 8, '17:00', '17:05', 'peron 1'),
	(21, 2, '18:30', '18:34', 'peron 1'),
	(21, 9, '18:40', '18:45', 'peron 1'),
	(21, 7, '18:50', '18:55', 'peron 1'),
	(21, 1, '19:03', NULL, 'peron 2');
/* PKP Intercity Gdynia-Warszawa 20:03 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(22, 5, NULL, '20:03', 'peron 1'),
	(22, 8, '21:00', '21:05', 'peron 1'),
	(22, 2, '22:30', '22:34', 'peron 1'),
	(22, 9, '22:40', '22:45', 'peron 1'),
	(22, 7, '22:50', '22:55', 'peron 1'),
	(22, 1, '23:03', NULL, 'peron 2');
/* PKP Przewozy Regionalne Mrągowo-Gdańsk 04:33 10:03 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(24, 3, NULL, '04:03', 'peron 3'),
	(24, 6, '04:30', '04:35', 'peron 2'),
	(24, 7, '06:00', '06:05', 'peron 2'),
	(24, 9, '08:00', '08:05', 'peron 3'),
	(24, 2, '10:03', NULL, 'peron 1');
/* PKP Przewozy Regionalne Mrągowo-Gdańsk 07:33 13:53 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(25, 3, NULL, '07:33', 'peron 3'),
	(25, 6, '08:00', '08:00', 'peron 2'),
	(25, 7, '10:00', '10:05', 'peron 2'),
	(25, 9, '12:00', '12:05', 'peron 3'),
	(25, 2, '13:53', NULL, 'peron 1');
/* PKP Przewozy Regionalne Mrągowo-Gdańsk 07:33 13:53 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(26, 3, NULL, '07:33', 'peron 3'),
	(26, 6, '08:30', '08:35', 'peron 2'),
	(26, 7, '10:00', '10:05', 'peron 2'),
	(26, 9, '13:00', '13:05', 'peron 3'),
	(26, 2, '13:53', NULL, 'peron 1');
/* PKP Przewozy Regionalne Mrągowo-Gdańsk 10:33 17:03 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(27, 3, NULL, '10:33', 'peron 3'),
	(27, 6, '10:30', '10:35', 'peron 2'),
	(27, 7, '12:00', '12:05', 'peron 2'),
	(27, 9, '15:00', '15:05', 'peron 3'),
	(27, 2, '17:03', NULL, 'peron 1');
/* PKP Przewozy Regionalne Mrągowo-Gdańsk 16:33 23:03 */
INSERT INTO TRIP_SCHEDULES (trip_id, station_id, arrival_time, departure_time, description) VALUES
	(28, 3, NULL, '16:33', 'peron 3'),
	(28, 6, '16:30', '16:35', 'peron 2'),
	(28, 7, '18:00', '18:05', 'peron 2'),
	(28, 9, '20:00', '20:05', 'peron 3'),
	(28, 2, '23:03', NULL, 'stage 1');