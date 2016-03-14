DROP TABLE user_profile;

CREATE TABLE user_profile (
  email varchar(255) NOT NULL,
  nick_name varchar(255) NOT NULL,
  first_name varchar(255) default NULL,
  last_name varchar(255) default NULL,
  PRIMARY KEY (email)
);

INSERT INTO user_profile (email, nick_name, first_name, last_name) VALUES ('felix.chiu@gmail.com', 'Lack Lack', 'Felix', 'Chiu');
