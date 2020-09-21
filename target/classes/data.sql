insert into category value (1, 'Rękodzieła', null);
insert into category value (2, 'Chusty', 1);
insert into category value (3, 'Wisiorki', 1);
insert into category value (4, 'Ozdoby', 1);
insert into category value (5, 'Produkty dla dorosłych', null);


insert into author value (1, 'Agnieszka');
insert into author value (2, 'Krystian');
insert into author value (3, 'Robert');

insert into product value (1, now(), 'Różowa chusta zrobiona z Ombre o długości 150m.', 'Różowa chusta', 199.99, 1, 2);
insert into product value (2, now(), 'Niebiesko-zielona chusta zrobiona z Ombre o długości 100.', 'Morska chusta', 149.99, 1, 2);
insert into product value (3, now(), 'Wisiorek w kształcie Twojego eks. Męcz go kiedy tylko chcesz.', 'Wisiorek VooDoo', 29.99, 1, 3);

