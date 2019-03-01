INSERT INTO bookstore.sections (sectionid, name) VALUES (1, 'Fiction');
INSERT INTO bookstore.sections (sectionid, name) VALUES (2, 'Technology');
INSERT INTO bookstore.sections (sectionid, name) VALUES (3, 'Travel');
INSERT INTO bookstore.sections (sectionid, name) VALUES (4, 'Business');
INSERT INTO bookstore.sections (sectionid, name) VALUES (5, 'Religion');

INSERT INTO bookstore.authors (authorid, firstname, lastname) VALUES (1, 'John', 'Mitchell');
INSERT INTO bookstore.authors (authorid, firstname, lastname) VALUES (2, 'Dan', 'Brown');
INSERT INTO bookstore.authors (authorid, firstname, lastname) VALUES (3, 'Jerry', 'Poe');
INSERT INTO bookstore.authors (authorid, firstname, lastname) VALUES (4, 'Wells', 'Teague');
INSERT INTO bookstore.authors (authorid, firstname, lastname) VALUES (5, 'George', 'Gallinger');
INSERT INTO bookstore.authors (authorid, firstname, lastname) VALUES (6, 'Ian', 'Stewart');

INSERT INTO bookstore.books (bookid, booktitle, ISBN, copy, sectionid) VALUES (1, 'Flatterland', '9780738206752', 2001, 1);
INSERT INTO bookstore.books (bookid, booktitle, ISBN, copy, sectionid) VALUES (2, 'Digital Fortess', '9788489367012', 2007, 1);
INSERT INTO bookstore.books (bookid, booktitle, ISBN, copy, sectionid) VALUES (3, 'The Da Vinci Code', '9780307474278', 2009, 1);
INSERT INTO bookstore.books (bookid, booktitle, ISBN, copy, sectionid) VALUES (4, 'Essentials of Finance', '1314241651234', NULL, 4);
INSERT INTO bookstore.books (bookid, booktitle, ISBN, copy, sectionid) VALUES (5, 'Calling Texas Home', '1885171382134', 2000, 3);

INSERT INTO bookstore.wrote (bookid, authorid) VALUES (1, 6);
INSERT INTO bookstore.wrote (bookid, authorid) VALUES (2, 2);
INSERT INTO bookstore.wrote (bookid, authorid) VALUES (3, 2);
INSERT INTO bookstore.wrote (bookid, authorid) VALUES (4, 5);
INSERT INTO bookstore.wrote (bookid, authorid) VALUES (4, 3);
INSERT INTO bookstore.wrote (bookid, authorid) VALUES (5, 4);



INSERT INTO `bookstore`.`users` (`userid`, `password`, `role`, `username`) VALUES ('1', 'abc', 'ADMIN', 'Simon');
