CREATE TABLE students (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    roll_no VARCHAR(20) UNIQUE
);
CREATE TABLE attendance (
    id SERIAL PRIMARY KEY,
    student_id INT REFERENCES students(id),
    date DATE,
    status VARCHAR(10) CHECK (status IN ('Present','Absent'))
);
