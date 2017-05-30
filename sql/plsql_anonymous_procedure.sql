declare
book_id number;
author_id number;
begin
book_id := book_seq.nextval;
author_id := author_seq.nextval;
insert into books values
(book_id, 'Kosmeticke ubrousky', '93872-90', 2010);
insert into authors values
(author_id, 'uknown', 'Moracell');
insert into books_to_authors values
(book_id, author_id);
commit;
end;

declare
begin
delete from BOOKS_TO_AUTHORS;
delete from BOOKS;
delete from AUTHORS;
commit;
end;