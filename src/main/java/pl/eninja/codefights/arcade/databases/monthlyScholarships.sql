CREATE PROCEDURE monthlyScholarships()
BEGIN
SELECT id, (scholarship/12) as scholarship
FROM scholarships
order by id;
END