CREATE VIEW Users_ShortComments
            (Users_n_id, c_username, ShortComments_n_id,n_user_id, n_movie_id, d_create_time, d_edit_time, n_score,c_content,n_type)
AS
SELECT Users.n_id,
       Users.c_username,
       ShortComments.n_id,
       n_user_id,
       n_movie_id,
       d_create_time,
       d_edit_time,
       n_score,

       c_content,
       n_type

FROM ShortComments
         LEFT OUTER JOIN Users
                         ON Users.n_id = SHortComments.n_user_id

