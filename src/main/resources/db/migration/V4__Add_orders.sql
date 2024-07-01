-- Insert an order
INSERT INTO orders (total_price, date, post_index, user_id, status, payment_id)
VALUES (9500.50, '2024-06-28 10:30:00', '12345', 1, 'PROCESSING', 101);

-- Insert associated watches for the order
INSERT INTO order_watches (order_id, watch_id) VALUES (1, 1);
INSERT INTO order_watches (order_id, watch_id) VALUES (1, 2);

-- Insert another order
INSERT INTO orders (total_price, date, post_index, user_id, status, payment_id)
VALUES (9500.25, '2024-06-29 14:45:00', '67890', 2, 'SHIPPED', 102);

-- Insert associated watches for the order
INSERT INTO order_watches (order_id, watch_id) VALUES (2, 3);

-- Insert another order
INSERT INTO orders (total_price, date, post_index, user_id, status, payment_id)
VALUES (9500.00, '2024-06-30 09:15:00', '54321', 3, 'DELIVERED', 103);

-- Insert associated watches for the order
INSERT INTO order_watches (order_id, watch_id) VALUES (3, 4);
INSERT INTO order_watches (order_id, watch_id) VALUES (3, 5);

-- Insert another order
INSERT INTO orders (total_price, date, post_index, user_id, status, payment_id)
VALUES (9500.99, '2024-06-25 18:00:00', '98765', 4, 'PROCESSING', 104);

-- Insert associated watches for the order
INSERT INTO order_watches (order_id, watch_id) VALUES (4, 1);

-- Insert another order
INSERT INTO orders (total_price, date, post_index, user_id, status, payment_id)
VALUES (9500.75, '2024-06-27 12:20:00', '45678', 5, 'SHIPPED', 105);

-- Insert associated watches for the order
INSERT INTO order_watches (order_id, watch_id) VALUES (5, 2);
INSERT INTO order_watches (order_id, watch_id) VALUES (5, 3);
INSERT INTO order_watches (order_id, watch_id) VALUES (5, 4);
