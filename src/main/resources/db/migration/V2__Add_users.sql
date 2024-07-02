INSERT INTO roles (name) VALUES ('ROLE_USER'), ('ROLE_ADMIN');

INSERT INTO users (email, password, first_name, last_name, city, address, phone_number, post_index, active)
VALUES ('john.doe@example.com', 'hashed_password', 'John', 'Doe', 'New York', '123 Main St', '555-1212', '10001', true),
       ('jane.smith@example.com', 'hashed_password2', 'Jane', 'Smith', 'Los Angeles', '456 Elm St', '555-5678', '90001', true);

INSERT INTO user_roles (user_id, role_id) VALUES (1, 1), (2, 2); -- John Doe as user, Jane Smith as admin
