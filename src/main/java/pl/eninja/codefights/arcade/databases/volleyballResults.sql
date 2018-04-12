CREATE PROCEDURE volleyballResults()
BEGIN
    SELECT *
    FROM results
	ORDER by wins;
END