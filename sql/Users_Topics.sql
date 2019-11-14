CREATE VIEW Users_Topics
            (Users_n_id, c_username,Topics_n_id,n_movie_id,c_name)
AS
SELECT Users.n_id,
       Users.c_username,
       Topics.n_id,
       n_movie_id,
       c_name

FROM Topics
         LEFT OUTER JOIN Users
                         ON Users.n_id = Topics.n_user_id
