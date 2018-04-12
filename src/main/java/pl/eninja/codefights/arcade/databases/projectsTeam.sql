CREATE PROCEDURE projectsTeam()
BEGIN
SELECT DISTINCT name FROM projectLog
order BY name;
END