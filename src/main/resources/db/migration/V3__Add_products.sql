-- Products

INSERT INTO watches (model_name, reference_number, movement_type, case_material, case_diameter_mm, thickness_mm, lug_to_lug_mm, between_lugs_mm, dial_color, crystal_material, crystal_features, calibre, power_reserve_hours, water_resistance_bar, total_weight_grams, price, brand, collection, is_limited_edition, warranty_months)
VALUES ('Submariner Date', '126610LN', 'Automatic', 'Oystersteel', 41, 12.5, 50, 21, 'Black', 'Sapphire', 'Cyclops lens', '3235', 70, 300, 161, 10250.00, 'Rolex', 'Oyster Perpetual', false, 5),
       ('Speedmaster Professional Moonwatch', '310.30.42.50.01.001', 'Manual', 'Stainless Steel', 42, 13.58, 48, 20, 'Black', 'Hesalite', null, '3861', 50, 50, 141, 7150.00, 'Omega', 'Speedmaster', false, 5);


INSERT INTO watch_tags (watch_id, tag) VALUES (1, 'diver'), (1, 'luxury'), (2, 'chronograph'), (2, 'moonwatch');

INSERT INTO watch_images (watch_id, image_url) 
VALUES (1, 'https://example.com/submariner.jpg'), 
       (2, 'https://example.com/speedmaster.jpg');
