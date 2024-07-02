-- User

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
    price DECIMAL(10, 2) NOT NULL, -- Changed to DECIMAL for accuracy
    brand VARCHAR,
    collection VARCHAR,
    is_limited_edition BOOLEAN,
    warranty_months INT
);

CREATE TABLE watch_tags (
    watch_id BIGINT REFERENCES watches(id),
    tag VARCHAR NOT NULL
);

CREATE TABLE watch_images (
    id BIGSERIAL PRIMARY KEY,
    watch_id BIGINT REFERENCES watches(id),
    image_url VARCHAR NOT NULL
);

-- Payment

CREATE TABLE payments (
    id BIGSERIAL PRIMARY KEY,
    amount DECIMAL(10, 2) NOT NULL, -- Changed to DECIMAL for accuracy
    payment_method VARCHAR NOT NULL,
    transaction_id VARCHAR,
    payment_date TIMESTAMP NOT NULL
);

-- Order

CREATE TABLE orders (
    id BIGSERIAL PRIMARY KEY,
    total_price DECIMAL(10, 2) NOT NULL, -- Changed to DECIMAL for accuracy
    date TIMESTAMP NOT NULL,
    post_index VARCHAR NOT NULL,
    user_id BIGINT NOT NULL REFERENCES users(id),
    status VARCHAR NOT NULL,
    payment_id BIGINT UNIQUE REFERENCES payments(id)  
);

CREATE TABLE order_items (
    id BIGSERIAL PRIMARY KEY,
    order_id BIGINT REFERENCES orders(id),
    watch_id BIGINT REFERENCES watches(id),
    quantity INT NOT NULL,
    price_at_purchase DECIMAL(10, 2) NOT NULL -- Changed to DECIMAL for accuracy
);

-- Reviews

CREATE TABLE reviews (
    id BIGSERIAL PRIMARY KEY,
    user_id BIGINT REFERENCES users(id),
    watch_id BIGINT REFERENCES watches(id),
    rating INT NOT NULL CHECK (rating >= 1 AND rating <= 5),
    comment TEXT
);

-- Shipping

CREATE TABLE shipping_addresses (
    id BIGSERIAL PRIMARY KEY,
    user_id BIGINT REFERENCES users(id),
    address VARCHAR NOT NULL,
    city VARCHAR NOT NULL,
    post_index VARCHAR NOT NULL,
    country VARCHAR NOT NULL
);

CREATE TABLE shipping_methods (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR NOT NULL,
    price DECIMAL(10, 2) NOT NULL -- Changed to DECIMAL for accuracy
);

CREATE TABLE order_shipping (
    order_id BIGINT PRIMARY KEY REFERENCES orders(id),
    shipping_address_id BIGINT REFERENCES shipping_addresses(id),
    shipping_method_id BIGINT REFERENCES shipping_methods(id),
    tracking_number VARCHAR
);

-- ... (Add tables for discounts, promotions, inventory if needed)

-- Foreign Key Constraints (Added for clarity)
ALTER TABLE user_roles ADD FOREIGN KEY (user_id) REFERENCES users (id);
ALTER TABLE user_roles ADD FOREIGN KEY (role_id) REFERENCES roles (id);
ALTER TABLE watch_tags ADD FOREIGN KEY (watch_id) REFERENCES watches (id);
ALTER TABLE orders ADD FOREIGN KEY (user_id) REFERENCES users (id);
ALTER TABLE orders ADD FOREIGN KEY (payment_id) REFERENCES payments (id);
ALTER TABLE order_items ADD FOREIGN KEY (order_id) REFERENCES orders (id);
ALTER TABLE order_items ADD FOREIGN KEY (watch_id) REFERENCES watches (id);
ALTER TABLE reviews ADD FOREIGN KEY (user_id) REFERENCES users (id);
ALTER TABLE reviews ADD FOREIGN KEY (watch_id) REFERENCES watches (id);
ALTER TABLE shipping_addresses ADD FOREIGN KEY (user_id) REFERENCES users (id);
ALTER TABLE order_shipping ADD FOREIGN KEY (order_id) REFERENCES orders (id);
ALTER TABLE order_shipping ADD FOREIGN KEY (shipping_address_id) REFERENCES shipping_addresses (id);
ALTER TABLE order_shipping ADD FOREIGN KEY (shipping_method_id) REFERENCES shipping_methods (id);
