# db_curriculum_design
 Curriculum Design of 2019 Database Course

## 目前存在的问题
- 个人标签不应与电影产生联系
    - 解决方法 加一张个人标签标 和 个人标签电影用户联系表
- 遇到数据库内不存在或重名的演员
    - 解决方法 在演员表里新增演员
- UserInfo 无自增
    - 里面也应是 n_user_id