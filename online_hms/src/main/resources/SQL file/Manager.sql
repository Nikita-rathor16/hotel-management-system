-- Description: creation of the table for manager registration.
-- Name: manager_register
-- Add primary key: id

create table manager_register(
    id                 bigint
    name               character varying,
    phonenumber        character varying,
    email              character varying,
    password           character varying,
    PRIMARY KEY (id)
);

-- Description: creation of the table for manager login.
-- Name: manager_login
-- Add primary key: email

create table manager_login(
    email              character varying,
    password           character varying,
    PRIMARY KEY (email)
);

-- Description: creation of the table for manager can add the rooms.
-- Name: add_roomsnew
-- Add primary key: id

create table add_roomsnew(
    id                 bigint,
    price              bigint,
    room_id            bigint,
    room_type          character varying,
    PRIMARY KEY (id)
);

-- Description: creation of the table for manager can add the staffs.
-- Name: add_staff
-- Add primary key: id

create table add_staff(
    id                 bigint,
    age                int,
    name               character varying,
    email              character varying,
    id_proof           character varying,
    pincode            int,
    occupation         character varying,
    salary             int,
    city               character varying,
    country            character varying,
    PRIMARY KEY (id)
);
