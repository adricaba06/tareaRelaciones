INSERT INTO patient (id, name, surname, birthdate, email) VALUES (1, 'Laura', 'Gómez', '1990-05-12', 'laura@example.com');

INSERT INTO patient (id, name, surname, birthdate, email) VALUES (2, 'Carlos', 'Ruiz', '1985-10-30', 'carlos@example.com');

INSERT INTO doctor (id, name, surname, specialty, email) VALUES (1, 'Ana', 'martínez', 'Cardiología', 'ana.martinez@example.com');

INSERT INTO doctor (id, name, surname, specialty, email) VALUES (2, 'Luis', 'Perez', 'Dermatología', 'luis.perez@example.com');

-- laura con ana
INSERT INTO patient_doctor (patient_id, doctor_id) VALUES (1, 1);

-- Laura  con luis
INSERT INTO patient_doctor (patient_id, doctor_id) VALUES (1, 2);

-- Carlos con ana
INSERT INTO patient_doctor (patient_id, doctor_id) VALUES (2, 1);

-- http://localhost:8080/h2-console/login.jsp?jsessionid=9da54032e3a175b80fb8e95f67304b29