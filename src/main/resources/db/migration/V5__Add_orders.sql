INSERT INTO orders (total_price, date, post_index, user_id, status, payment_id)
VALUES (10250.00, '2024-06-28 10:30:00', '10001', 1, 'completed', 1),
       (7150.00, '2024-06-29 14:45:00', '90001', 2, 'shipped', 2);

INSERT INTO order_items (order_id, watch_id, quantity, price_at_purchase)
VALUES (1, 1, 1, 10250.00),
       (2, 2, 1, 7150.00);
