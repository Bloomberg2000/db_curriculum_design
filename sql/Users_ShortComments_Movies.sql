--短评内容///打分/用户名/电影名/电影封面
 CREATE VIEW UsersAndShortCommentsAndMovies
             (UserId, ShortCommentsId, MovieId, UserName, CreateTimeDate, EditTimeDate, Score, ShortCommentsContent, MovieCover, MovieName)
 AS
 SELECT Users.n_id,
        ShortComments.n_id,
        ShortComments.n_movie_id,
        Users.c_username,
        ShortComments.d_create_time,
        ShortComments.d_edit_time,
        ShortComments.n_score,
        ShortComments.c_content,
        Movies.c_moive_cover,
        Movies.c_name

 FROM Users
 INNER JOIN ShortComments
 ON Users.n_id = ShortComments.n_user_id
 INNER JOIN Movies
 ON ShortComments.n_movie_id = Movies.n_id
