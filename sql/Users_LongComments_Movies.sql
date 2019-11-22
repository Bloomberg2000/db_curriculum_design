--长评题目/内容///打分/用户名/电影名/电影封面
CREATE VIEW UsersAndLongCommentsAndMovies
            (UserId, LongCommentsId, MovieId, UserName, CreateTimeDate, EditTimeDate, Score, LongCommentsTitle, LongCommentsContent, MovieCover, MovieName)
AS
SELECT Users.n_id,
       LongComments.n_id,
       LongComments.n_movie_id,
       Users.c_username,
       LongComments.d_create_time,
       LongComments.d_edit_time,
       LongComments.n_score,
       LongComments.c_title,
       LongComments.c_content,
       Movies.c_moive_cover,
       Movies.c_name

FROM Users
         INNER JOIN LongComments
                    ON Users.n_id = LongComments.n_user_id
         INNER JOIN Movies
                    ON LongComments.n_movie_id = Movies.n_id