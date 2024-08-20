-- Create the database
CREATE DATABASE baitap;

-- Use the newly created database
USE baitap;

-- Create the Department table
CREATE TABLE Department (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- Create the Employee table
CREATE TABLE Employee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES Department(id)
);

-- Create the Project table
CREATE TABLE Project (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    budget INT NOT NULL,
    department_id INT,
    year INT NOT NULL,
    FOREIGN KEY (department_id) REFERENCES Department(id)
);

-- Insert example data into the Department table
INSERT INTO Department (name) VALUES ('HR'), ('IT'), ('Finance');

-- Insert example data into the Employee table
INSERT INTO Employee (name, department_id) VALUES ('John Doe', 1), ('Jane Smith', 2), ('Robert Brown', 3);

-- Insert example data into the Project table
INSERT INTO Project (name, budget, department_id, year) VALUES 
('Project A', 500, 1, 2019), 
('Project B', 600, 2, 2020), 
('Project C', 400, 3, 2020);


