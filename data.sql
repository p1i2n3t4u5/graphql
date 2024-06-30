INSERT INTO user_tbl (id, name, email) VALUES (1, 'user1','user1@gmail.com');
INSERT INTO user_tbl (id, name, email) VALUES (2, 'user2','user2@gmail.com');
INSERT INTO user_tbl (id, name, email) VALUES (3, 'user3','user3@gmail.com');
INSERT INTO user_tbl (id, name, email) VALUES (4, 'user4','user4@gmail.com');
INSERT INTO user_tbl (id, name, email) VALUES (5, 'user5','user5@gmail.com');


INSERT INTO post (id, subject, user_id) VALUES (10, 'News',1);
INSERT INTO post (id, subject, user_id) VALUES (11, 'Sports',2);
INSERT INTO post (id, subject, user_id) VALUES (12, 'Election',3);

INSERT INTO comment (id, reply, post_id,user_id) VALUES (101, 'Braking News 1',10,4);
INSERT INTO comment (id, reply, post_id,user_id) VALUES (102, 'Braking News 2',10,4);
INSERT INTO comment (id, reply, post_id,user_id) VALUES (103, 'Braking News 3',10,4);
INSERT INTO comment (id, reply, post_id,user_id) VALUES (104, 'Braking News 4',10,5);
INSERT INTO comment (id, reply, post_id,user_id) VALUES (105, 'Braking News 5',10,5);
INSERT INTO comment (id, reply, post_id,user_id) VALUES (106, 'Braking News 6',10,5);

INSERT INTO comment (id, reply, post_id,user_id) VALUES (107, 'Cricket News 1',11,4);
INSERT INTO comment (id, reply, post_id,user_id) VALUES (108, 'Hockey News 2',11,4);
INSERT INTO comment (id, reply, post_id,user_id) VALUES (109, 'Basketball News 3',11,4);
INSERT INTO comment (id, reply, post_id,user_id) VALUES (110, 'Khokho News 4',11,5);
INSERT INTO comment (id, reply, post_id,user_id) VALUES (111, 'Chess News 5',11,5);
INSERT INTO comment (id, reply, post_id,user_id) VALUES (112, 'Carem News 6',11,5);

INSERT INTO comment (id, reply, post_id,user_id) VALUES (113, 'Election News 1',12,4);
INSERT INTO comment (id, reply, post_id,user_id) VALUES (114, 'Election News 2',12,4);
INSERT INTO comment (id, reply, post_id,user_id) VALUES (115, 'Election News 3',12,4);
INSERT INTO comment (id, reply, post_id,user_id) VALUES (116, 'Election News 4',12,5);
INSERT INTO comment (id, reply, post_id,user_id) VALUES (117, 'Election News 5',12,5);
INSERT INTO comment (id, reply, post_id,user_id) VALUES (118, 'Election News 6',12,5);
