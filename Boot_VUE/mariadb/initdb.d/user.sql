USE edu;

CREATE OR REPLACE TABLE user3 (
	no 			int 					not null auto_increment primary key,
	name 		varchar(100) 	not null,
	email 	varchar(200) 	not null,
	pwd			varchar(100)	not null,
	gender	boolean				not null default 1,
	del			boolean				not null default 0,
	regDate datetime 			not null default now()
);

commit;

insert into user3 (name, email, pwd, gender) value ('사용자','user@email.com','1',1);