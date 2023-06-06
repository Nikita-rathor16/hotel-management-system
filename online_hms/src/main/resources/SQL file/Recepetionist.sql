-- Description: creation of the table for user can registered yourself.
-- Name: Register
-- Add primary key: member_code

create table register (
	member_code	    bigint,
	name		    character varying NOT NULL,
        password            character varying NOT NULL,
	phonenumber	    character varying NOT NULL,
	email		    character varying NOT NULL,
        address             character varying,
        city                character varying,
        state               character varying,
        country             character varying,
	PRIMARY KEY (member_code)
);

-- Description: creation of the table for user can login.
-- Name: login
-- Add primary key: email

create table login ( 
    email              character varying NOT NULL,
    password           character varying NOT NULL,
    PRIMARY KEY (email)
);

-- Description: creation of the table for searching the 
-- Name: search
-- Add primary key: id

create table search ( 
    id                   int,
    check_in_date        date NOT NULL,
    check_out_date       date NOT NULL,
    number_of_adults     character varying,
    number_of_children   character varying,
    PRIMARY KEY (id)
);

-- Description: creation of the table for user will fill the details for reservation.
-- Name: guest_details
-- Add primary key: member_code


create table guest_details (
	member_code	       int,
	name		       character varying NOT NULL,
	phone_number	       character varying NOT NULL,
	email		       character varying NOT NULL,
        age                    int NOT NULL,
        gender                 character varying NOT NULL,
	PRIMARY KEY (member_code)
);

-- Description: creation of the table for user select the dates, adults and children for room reservation.
-- Name: make_reservation
-- Add primary key: id
-- Add foreign key: room_rec

create table make_reservation ( 
    id                        int,
    check_in                  date NOT NULL,
    check_out                 date NOT NULL,
    number_of_adults          int,
    number_of_children        int,
    number_of_nights          int,
    room_rec                  bigint,
    PRIMARY KEY (id),
    FOREIGN KEY (room_rec)
);

-- Description: creation of the table for user can payment for the room reservation.
-- Name: payment
-- Add primary key: card_number

create table payment (
        id                     bigint
	card_number	       character varying NOT NULL,
	card_holder_name       character varying NOT NULL,
        cvv                    character varying NOT NULL,
        expire_date            date NOT NULL,
	PRIMARY KEY (id)
);