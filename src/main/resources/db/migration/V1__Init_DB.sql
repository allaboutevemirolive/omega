--  User

CREATE TABLE users (
    id BIGSERIAL PRIMARY KEY,
    email VARCHAR NOT NULL,
    password VARCHAR NOT NULL,
    first_name VARCHAR NOT NULL,
    last_name VARCHAR,
    city VARCHAR,
    address VARCHAR,
    phone_number VARCHAR,
    post_index VARCHAR,
    active BOOLEAN
);

CREATE TABLE roles (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR NOT NULL
);

CREATE TABLE user_roles (
    user_id BIGINT REFERENCES users(id),
    role_id BIGINT REFERENCES roles(id),
    PRIMARY KEY (user_id, role_id)
);

-- Watches

CREATE TABLE watches (
id BIGSERIAL PRIMARY KEY,
model_name VARCHAR NOT NULL,
reference_number VARCHAR UNIQUE NOT NULL,
movement_type VARCHAR NOT NULL,
case_material VARCHAR NOT NULL,
case_diameter_mm DOUBLE PRECISION NOT NULL,
thickness_mm DOUBLE PRECISION NOT NULL,
lug_to_lug_mm DOUBLE PRECISION NOT NULL,
between_lugs_mm DOUBLE PRECISION NOT NULL,
dial_color VARCHAR NOT NULL,
crystal_material VARCHAR NOT NULL,
crystal_features VARCHAR,
calibre VARCHAR,
power_reserve_hours INT,
water_resistance_bar INT,
total_weight_grams DOUBLE PRECISION,
price INT
);

CREATE TABLE watch_tags (
watch_id BIGINT REFERENCES watches(id),
tag VARCHAR NOT NULL
);

-- Payment

CREATE TABLE payments (
id BIGSERIAL PRIMARY KEY,
amount DOUBLE PRECISION NOT NULL,
payment_method VARCHAR NOT NULL,
transaction_id VARCHAR,
payment_date TIMESTAMP NOT NULL
);

-- Order

CREATE TABLE orders (
id BIGSERIAL PRIMARY KEY,
total_price DOUBLE PRECISION NOT NULL,
date TIMESTAMP NOT NULL,
post_index VARCHAR NOT NULL,
user_id BIGINT NOT NULL REFERENCES users(id),
status VARCHAR NOT NULL,
payment_id BIGINT UNIQUE REFERENCES payments(id)  
);


CREATE TABLE order_watches (
order_id BIGINT REFERENCES orders(id),
watch_id BIGINT REFERENCES watches(id)
);

-- ALTER TABLE IF EXISTS order_watches ADD CONSTRAINT fk_order_watches_orders FOREIGN KEY (order_id) REFERENCES orders(id);
-- ALTER TABLE IF EXISTS order_watches ADD CONSTRAINT fk_order_watches_watches FOREIGN KEY (watch_id) REFERENCES watches(id);
-- ALTER TABLE IF EXISTS user_roles ADD CONSTRAINT fk_user_roles_users FOREIGN KEY (user_id) REFERENCES users(id);
-- ALTER TABLE IF EXISTS user_roles ADD CONSTRAINT fk_user_roles_roles FOREIGN KEY (role_id) REFERENCES roles(id);

ALTER TABLE user_roles ADD FOREIGN KEY (user_id) REFERENCES users (id);
ALTER TABLE user_roles ADD FOREIGN KEY (role_id) REFERENCES roles (id);
ALTER TABLE watch_tags ADD FOREIGN KEY (watch_id) REFERENCES watches (id);
ALTER TABLE orders ADD FOREIGN KEY (user_id) REFERENCES users (id);
ALTER TABLE orders ADD FOREIGN KEY (payment_id) REFERENCES payments (id);
ALTER TABLE order_watches ADD FOREIGN KEY (order_id) REFERENCES orders (id);
ALTER TABLE order_watches ADD FOREIGN KEY (watch_id) REFERENCES watches (id);

