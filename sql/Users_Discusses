CREATE VIEW Users_Discusses
            (Users_n_id, c_username,Discusses_n_id,n_movie_id,d_create_time,d_edit_time,c_name)
AS
SELECT Users.n_id,
       Users.c_username,
       Discusses.n_id,
       n_movie_id,
       d_create_time,
       d_edit_time,
       c_name

FROM Discusses
         LEFT OUTER JOIN Users
                         ON Users.n_id = Discusses.n_user_id

