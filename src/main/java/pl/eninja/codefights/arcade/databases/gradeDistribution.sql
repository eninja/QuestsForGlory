CREATE PROCEDURE gradeDistribution()
BEGIN
    SELECT Name, ID
    FROM Grades
    WHERE Final > Midterm1 + Midterm2
        OR Final > Midterm1/4 + Midterm2/4 + Final/2
    ORDER BY SUBSTRING(Name,1,3),ID;
END