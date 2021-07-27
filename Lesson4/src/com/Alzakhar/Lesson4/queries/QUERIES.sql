--TASK 1;

SELECT
    name, start_time, duration
FROM
    cinema.films
        RIGHT JOIN
    cinema.sessions ON films.id = sessions.film_id
WHERE
    start_time IN (SELECT
            start_time
        FROM
            cinema.sessions
        GROUP BY start_time
        HAVING COUNT(start_time) > 1)

--TASK 2;

Что-то я туплю, покажите как это сделать, плиз..)