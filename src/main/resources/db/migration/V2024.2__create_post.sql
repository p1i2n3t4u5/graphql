create table post (id bigint generated by default as identity, user_id bigint, subject varchar(255), primary key (id));
alter table if exists post add constraint FKddkrywtpqilo2g44lxq204l2q foreign key (user_id) references user_tbl;