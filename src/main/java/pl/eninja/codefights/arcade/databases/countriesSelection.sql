CREATE PROCEDURE countriesSelection()
BEGIN
SELECT * FROM countries
WHERE continent='Africa'
order BY name;
END