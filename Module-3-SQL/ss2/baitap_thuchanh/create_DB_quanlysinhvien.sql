create database QuanLySinhVien;
use quanlysinhvien;
create table Class(
	ClassID int primary key auto_increment,
    ClassName varchar(60) NOT NULL,
    StartDate datetime NOT NULL,
    Status bit
);
create table Student(
	StudentID int primary key auto_increment,
    StudentName varchar(30) NOT NULL,
    Address varchar(50),
    Phone varchar(20),
    Status bit,
    ClassID int NOT NULL,
    FOREIGN KEY (ClassID) references Class(ClassID)
    );
create table Subject(
	SubID int primary key auto_increment,
    SubName varchar(30),
    Credit tinyint,
    Status bit
);
create table Mark(
	MarkID int primary key auto_increment,
    SubID int NOT NULL,
    FOREIGN KEY (SubID) references Subject(SubID),
    StudentID int NOT NULL,
    FOREIGN KEY (StudentID) references Student(StudentID),
    Mark float default 0 check (Mark between 0 and 100),
    ExamTimes tinyint default 1
);


 