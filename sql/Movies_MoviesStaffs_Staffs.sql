CREATE VIEW Movies_MoviesStaffs_Staffs
            (Movies_n_id, Movies_c_name,MoviesStaffs_n_id,MoviesStaffs_n_type,Staffs_n_id,Staffs_c_name,Staffs_c_occupation,Staffs_foreign_name)
AS
SELECT Movies.n_id,
       Movies.c_name,
       MoviesStaffs.n_id,
       MoviesStaffs.n_type,
       Staffs.n_id,
       Staffs.c_name,
       Staffs.c_occupation,
       Staffs.c_foreign_name

FROM MoviesStaffs
         LEFT OUTER JOIN  Movies
                         ON MoviesStaffs.n_movie_id= Movies.n_id
LEFT OUTER JOIN Staffs
on MoviesStaffs.n_staff_id = Staffs.n_id
