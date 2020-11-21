INSERT IGNORE INTO book(book_id, author, title, price, isbn, description) VALUES
(1, 'Jane Austen', 'Puikybė ir prietarai', '15 eur', '9786090114216', null),
(2, 'Sue Townsend', 'Slaptas Adriano Moulo dienoraštis', '5 eur',
 '9789986023722', null),
(3, 'Chinua Achebe', 'Ir prasidėjo griovimas', '4 eur', null, null),
(4,'George Orwell', '1984', '58 eur', '9780452284234', null),
(5,'Charls Dickens', 'Didieji lūkesčiai', '8 eur', '9789955247944', null),
(6, 'Lee Harper', 'Nežudyk strazdo giesmininko', '59 eur', '9789955134237',
 null),
(7, 'Arunhai Roy', 'Mažmožių dievas', '48 eur', '9786090108888', null),
(8, 'Hilary Mantel','Vilko dvaras', '54 eur', '9786094442582', null);

INSERT IGNORE INTO user(id, username, password, enabled) VALUES
(1, 'Jonas', 'Jonas', true),
(2, 'Margarita', 'Margarita', true);

INSERT IGNORE INTO role(id, name, user_id) VALUES
(1, 'USER', 1),
(2, 'ADMIN', 2);


