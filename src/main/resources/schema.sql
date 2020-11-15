# #
# # #
# # # CREATE TABLE IF NOT EXISTS book(
# # # book_id INT(6) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
# # # author varchar (60) not null,
# # # title varchar(60) not null,
# # # price varchar(6),
# # # isbn varchar(13),
# # # description varchar(60));
# # #
# # USE book_store;
# #
# create table if not exists users
# (
#     id       bigint       not null auto_increment primary key,
#     username varchar(255) not null,
#     password varchar(255) not null,
#     enabled  BOOLEAN null
# )
#
# # create table if not exists roles
# # (
# #     id bigint not null auto_increment primary key,
# #     name varchar (255) not null)
#
# create table if not exists user_role
# (
#     user_id bigint not null,
#     role_id bigint not null,
#     primary key (user_id, role_id),
#     constraint FK_user_role_users
#         foreign key (user_id) references users (id),
#     constraint FK_user_role_roles
#         foreign key (role_id) references roles (id)
# ) engine = InnoDB;
#
# create table if not exists roles
# (
#     id bigint not null auto_increment primary key,
#     name enum ('ADMIN', 'USER') not null
# ) engine = InnoDB;
