-- Добавить таблицу пользователей
CREATE TABLE users (
  RecID bigint(20) NOT NULL AUTO_INCREMENT,
  UserName varchar(255) NOT NULL COMMENT 'Логин',
  Password varchar(255) NOT NULL COMMENT 'Пароль в захешированном виде',
  FirstName varchar(255) NOT NULL COMMENT 'Имя пользователя',
  LastName varchar(255) NOT NULL COMMENT 'Фамилия пользователя',
  Email varchar(255) NOT NULL COMMENT 'Email пользователя',
  UserGroup ENUM('User','Admin') NOT NULL DEFAULT 'User' COMMENT 'Наименование группы пользователей',
  PRIMARY KEY (RecID)
)
ENGINE = INNODB
AUTO_INCREMENT = 2
CHARACTER SET utf8
COLLATE utf8_general_ci;