CREATE TABLE Team(id INT PRIMARY KEY, name VARCHAR(255));
CREATE TABLE Player(id INT PRIMARY KEY, team_id INT, name VARCHAR(255), num INT, position VARCHAR(255));
insert into Team (id,name) values(1,'Barcelona');
insert into Player (id, team_id, name, num, position) values(1,1,'Lionel Messi', 10, 'Forward');
insert into Player (id, team_id, name, num, position) values(2,1,'Andreas Inniesta', 8, 'Midfielder');
insert into Player (id, team_id, name, num, position) values(3,1,'Pique', 3, 'Defender');