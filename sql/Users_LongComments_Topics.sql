CREATE VIEW Users_LongComments_Topics
            (Users_n_id, c_username, LongComments_n_id,n_user_id, n_movie_id, d_create_time, d_edit_time, n_score,c_title, c_content, c_topic)
AS
SELECT Users.n_id,
       Users.c_username,
       LongComments.n_id,
       n_user_id,
       n_movie_id,
       d_create_time,
       d_edit_time,
       n_score,
       c_title,
       c_content,
       Topics.c_name

FROM LongComments
    LEFT OUTER JOIN Topics
    ON LongComments.n_movie_id = Topics.n_movie_id
LEFT OUTER JOIN Users
    ON Users.n_id = LongComments.n_user_id