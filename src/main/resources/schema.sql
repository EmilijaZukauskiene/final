CREATE DATABASE IF NOT EXISTS book_store;

ALTER DATABASE book_store
    DEFAULT CHARACTER SET utf8
    DEFAULT COLLATE utf8_general_ci;

GRANT ALL PRIVILEGES ON book_store.* TO pc@localhost IDENTIFIED BY 'pc';

USE book_store;

CREATE TABLE IF NOT EXISTS books(
id_book INT(6) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
title varchar(60) not null,
ISBN varchar(13),
description varchar(60));

CREATE TABLE IF NOT EXISTS authors(
id_author INT (6) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
first_Name varchar(30) not null,
last_Name varchar(30) not null);

# CREATE TABLE IF NOT EXISTS books_authors(
# id_books_authors INT (6) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
# id_book INT (6) unsigned,
# id_author INT (6)unsigned,
# foreign key (id_book) references books (id_book),
# foreign key (id_author) references authors (id_author));

create table book_store.roles(
id int (6) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
name varchar (200) not null);

create table book_store.users(
id int (6) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
username varchar (30) not null,
password varchar (255));
