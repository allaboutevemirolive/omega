
INSERT INTO users (email, password, first_name, last_name, city, address, phone_number, post_index, active)
VALUES ('user1@example.com', 'hashed_password1', 'Alice', 'Johnson', 'London', '456 Elm St', '555-2323', 'SW1A 1AA', true);

INSERT INTO user_roles (user_id, role_id)
VALUES (
    (SELECT id FROM users WHERE email = 'user1@example.com'),
    (SELECT id FROM roles WHERE name = 'ADMIN')
);

INSERT INTO users (email, password, first_name, last_name, city, address, phone_number, post_index, active)
VALUES ('user2@example.com', 'hashed_password2', 'Bob', 'Smith', 'New York', '789 Oak Ave', '555-4545', '10002', true);

INSERT INTO user_roles (user_id, role_id)
VALUES (
    (SELECT id FROM users WHERE email = 'user2@example.com'),
    (SELECT id FROM roles WHERE name = 'USER')
);

INSERT INTO users (email, password, first_name, last_name, city, address, phone_number, post_index, active)
VALUES ('user3@example.com', 'hashed_password3', 'Charlie', 'Brown', 'Los Angeles', '101 Pine Rd', '555-6767', '90001', true);

INSERT INTO user_roles (user_id, role_id)
VALUES (
    (SELECT id FROM users WHERE email = 'user3@example.com'),
    (SELECT id FROM roles WHERE name = 'USER')
);

INSERT INTO users (email, password, first_name, last_name, city, address, phone_number, post_index, active)
VALUES ('user4@example.com', 'hashed_password4', 'David', 'Lee', 'Chicago', '202 Cedar Ln', '555-8989', '60601', true);

INSERT INTO user_roles (user_id, role_id)
VALUES (
    (SELECT id FROM users WHERE email = 'user4@example.com'),
    (SELECT id FROM roles WHERE name = 'USER')
);

INSERT INTO users (email, password, first_name, last_name, city, address, phone_number, post_index, active)
VALUES ('user5@example.com', 'hashed_password5', 'Eva', 'Chen', 'San Francisco', '303 Maple St', '555-0101', '94101', true);

INSERT INTO user_roles (user_id, role_id)
VALUES (
    (SELECT id FROM users WHERE email = 'user5@example.com'),
    (SELECT id FROM roles WHERE name = 'USER')
);

INSERT INTO users (email, password, first_name, last_name, city, address, phone_number, post_index, active)
VALUES ('user6@example.com', 'hashed_password6', 'Frank', 'Rodriguez', 'Miami', '404 Palm Ave', '555-1212', '33101', true);

INSERT INTO user_roles (user_id, role_id)
VALUES (
    (SELECT id FROM users WHERE email = 'user6@example.com'),
    (SELECT id FROM roles WHERE name = 'USER')
);

INSERT INTO users (email, password, first_name, last_name, city, address, phone_number, post_index, active)
VALUES ('user7@example.com', 'hashed_password7', 'Grace', 'Kim', 'Seattle', '505 Cedar St', '555-3434', '98101', true);

INSERT INTO user_roles (user_id, role_id)
VALUES (
    (SELECT id FROM users WHERE email = 'user7@example.com'),
    (SELECT id FROM roles WHERE name = 'USER')
);

INSERT INTO users (email, password, first_name, last_name, city, address, phone_number, post_index, active)
VALUES ('user8@example.com', 'hashed_password8', 'Henry', 'Wong', 'Boston', '606 Birch Rd', '555-5656', '02101', true);

INSERT INTO user_roles (user_id, role_id)
VALUES (
    (SELECT id FROM users WHERE email = 'user8@example.com'),
    (SELECT id FROM roles WHERE name = 'USER')
);

INSERT INTO users (email, password, first_name, last_name, city, address, phone_number, post_index, active)
VALUES ('user9@example.com', 'hashed_password9', 'Ivy', 'Nguyen', 'Houston', '707 Oak Ave', '555-7878', '77001', true);

INSERT INTO user_roles (user_id, role_id)
VALUES (
    (SELECT id FROM users WHERE email = 'user9@example.com'),
    (SELECT id FROM roles WHERE name = 'USER')
);

INSERT INTO users (email, password, first_name, last_name, city, address, phone_number, post_index, active)
VALUES ('user10@example.com', 'hashed_password10', 'Jack', 'Davis', 'Atlanta', '808 Pine St', '555-9090', '30301', true);

INSERT INTO user_roles (user_id, role_id)
VALUES (
    (SELECT id FROM users WHERE email = 'user10@example.com'),
    (SELECT id FROM roles WHERE name = 'USER')
);

