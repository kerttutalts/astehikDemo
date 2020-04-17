create  table if not exists groups
(
    id   bigint not null
        constraint groups_pkey
            primary key,
    name varchar(255)
);

create  table if not exists forms
(
    id          bigint  not null
        constraint forms_pkey
            primary key,
    explanation varchar(255),
    formsn      integer not null,
    name        varchar(255),
    group_id    bigint
        constraint fk671v9jrqbl7pi8skuwt9ge4id
            references groups
);


