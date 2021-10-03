CREATE TABLE teachers(
  id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  Fname varchar(255) NOT NULL,
  surname varchar(255) NOT NULL,
  gend varchar(255) NOT NULL,
  subject varchar(255) NOT NULL
);

-- Pupils Table --
CREATE TABLE pupils (
  id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  Fname varchar(255) NOT NULL,
  surname varchar(255) NOT NULL,
  gend varchar(255) NOT NULL,
  grade varchar(255) NOT NULL
);

-- Classes Table --
CREATE TABLE classes (
  id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  pupil_id int(11) NOT NULL,
  teacher_id int(11) NOT NULL
);
-- SELECT --
SELECT t.id,t.firstname,t.lastname,t.gender,t.subject FROM pupils p
    INNER JOIN classes c ON c.pupil_id = p.id
    INNER JOIN teachers t ON c.teacher_id = t.id
    WHERE p.firstname = "გიორგი";