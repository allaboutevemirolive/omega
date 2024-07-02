-- Shipping statuses

INSERT INTO shipping_addresses (user_id, address, city, post_index, country)
VALUES (1, '123 Main St', 'New York', '10001', 'USA'),
       (2, '456 Elm St', 'Los Angeles', '90001', 'USA');


INSERT INTO shipping_methods (name, price)
VALUES ('Standard', 5.00),
       ('Express', 10.00);


INSERT INTO order_shipping (order_id, shipping_address_id, shipping_method_id, tracking_number)
VALUES (1, 1, 1, 'TRACK12345'),
       (2, 2, 2, 'TRACK67890');
