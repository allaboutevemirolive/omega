-- Insert the watch
INSERT INTO watches (model_name, reference_number, movement_type, case_material, case_diameter_mm, thickness_mm, lug_to_lug_mm, between_lugs_mm, dial_color, crystal_material, crystal_features, calibre, power_reserve_hours, water_resistance_bar, total_weight_grams, price)
VALUES ('Seamaster Diver 300M 42 mm', '210.30.42.20.01.001', 'Self winding', 'Steel', 42.0, 13.6, 49.9, 20.0, 'Black', 'Sapphire', 'Domed, scratch-resistant, anti-reflective', 'Omega 8800', 55, 30, 194.0, 9500);

-- Insert the associated tags
INSERT INTO watch_tags (watch_id, tag) VALUES ((SELECT id FROM watches WHERE reference_number = '210.30.42.20.01.001'), 'Anti-magnetic');
INSERT INTO watch_tags (watch_id, tag) VALUES ((SELECT id FROM watches WHERE reference_number = '210.30.42.20.01.001'), 'Chronometer');

-- Insert the watch
INSERT INTO watches (model_name, reference_number, movement_type, case_material, case_diameter_mm, thickness_mm, lug_to_lug_mm, between_lugs_mm, dial_color, crystal_material, crystal_features, calibre, power_reserve_hours, water_resistance_bar, total_weight_grams, price)
VALUES ('CONSTELLATION GLOBEMASTER 39 MM, STEEL ON STEEL', '130.30.39.21.03.001', 'Self winding', 'Steel', 39.0, 12.6, 46.7, 20.0, 'Blue', 'Sapphire', 'Domed scratch‑resistant sapphire crystal with anti‑reflective treatment on both sides', 'Omega 8900', 60, 10, 162.0, 9500);

-- Insert the associated tags
INSERT INTO watch_tags (watch_id, tag) VALUES ((SELECT id FROM watches WHERE reference_number = '130.30.39.21.03.001'), 'Anti-magnetic');
INSERT INTO watch_tags (watch_id, tag) VALUES ((SELECT id FROM watches WHERE reference_number = '130.30.39.21.03.001'), 'Chronometer');
INSERT INTO watch_tags (watch_id, tag) VALUES ((SELECT id FROM watches WHERE reference_number = '130.30.39.21.03.001'), 'Date');
INSERT INTO watch_tags (watch_id, tag) VALUES ((SELECT id FROM watches WHERE reference_number = '130.30.39.21.03.001'), 'Master Chronometer Certified');
INSERT INTO watch_tags (watch_id, tag) VALUES ((SELECT id FROM watches WHERE reference_number = '130.30.39.21.03.001'), 'Time zone function');
INSERT INTO watch_tags (watch_id, tag) VALUES ((SELECT id FROM watches WHERE reference_number = '130.30.39.21.03.001'), 'Transparent caseback');

-- Insert the watch
INSERT INTO watches (model_name, reference_number, movement_type, case_material, case_diameter_mm, thickness_mm, lug_to_lug_mm, between_lugs_mm, dial_color, crystal_material, crystal_features, calibre, power_reserve_hours, water_resistance_bar, total_weight_grams, price)
VALUES ('SPEEDMASTER DARK SIDE OF THE MOON', '310.92.44.50.01.001', 'Manual‑winding', 'Black ceramic', 44.25, 13.0, 50.0, 21.0, 'Black', 'Sapphire', 'Scratch‑resistant sapphire crystal with anti‑reflective treatment on both sides', 'OMEGA 3869', 50, 5, 99.0, 13200);

-- Insert the associated tags
INSERT INTO watch_tags (watch_id, tag) VALUES ((SELECT id FROM watches WHERE reference_number = '310.92.44.50.01.001'), 'Anti-magnetic');
INSERT INTO watch_tags (watch_id, tag) VALUES ((SELECT id FROM watches WHERE reference_number = '310.92.44.50.01.001'), 'Chronograph');
INSERT INTO watch_tags (watch_id, tag) VALUES ((SELECT id FROM watches WHERE reference_number = '310.92.44.50.01.001'), 'Chronometer');
INSERT INTO watch_tags (watch_id, tag) VALUES ((SELECT id FROM watches WHERE reference_number = '310.92.44.50.01.001'), 'Master Chronometer Certified');
INSERT INTO watch_tags (watch_id, tag) VALUES ((SELECT id FROM watches WHERE reference_number = '310.92.44.50.01.001'), 'Small seconds');
INSERT INTO watch_tags (watch_id, tag) VALUES ((SELECT id FROM watches WHERE reference_number = '310.92.44.50.01.001'), 'Tachymeter');
INSERT INTO watch_tags (watch_id, tag) VALUES ((SELECT id FROM watches WHERE reference_number = '310.92.44.50.01.001'), 'Transparent caseback');

-- Insert the watch
INSERT INTO watches (model_name, reference_number, movement_type, case_material, case_diameter_mm, thickness_mm, lug_to_lug_mm, between_lugs_mm, dial_color, crystal_material, crystal_features, calibre, power_reserve_hours, water_resistance_bar, total_weight_grams, price)
VALUES ('DE VILLE TOURBILLON', '529.53.43.22.01.001', 'Manual‑winding', 'Sedna™ gold ‑ Canopus Gold™', 43.0, 12.7, 49.2, 21.0, 'Black', 'Sapphire', 'Domed scratch‑resistant sapphire crystal with anti‑reflective treatment on both sides', 'Omega 2640', 72, 3, 124.0, NULL); -- Assuming price is not available

-- Insert the associated tags
INSERT INTO watch_tags (watch_id, tag) VALUES ((SELECT id FROM watches WHERE reference_number = '529.53.43.22.01.001'), 'Anti-magnetic');
INSERT INTO watch_tags (watch_id, tag) VALUES ((SELECT id FROM watches WHERE reference_number = '529.53.43.22.01.001'), 'Chronometer');
INSERT INTO watch_tags (watch_id, tag) VALUES ((SELECT id FROM watches WHERE reference_number = '529.53.43.22.01.001'), 'Master Chronometer Certified');
INSERT INTO watch_tags (watch_id, tag) VALUES ((SELECT id FROM watches WHERE reference_number = '529.53.43.22.01.001'), 'Numbered edition');
INSERT INTO watch_tags (watch_id, tag) VALUES ((SELECT id FROM watches WHERE reference_number = '529.53.43.22.01.001'), 'Power reserve indicator');
INSERT INTO watch_tags (watch_id, tag) VALUES ((SELECT id FROM watches WHERE reference_number = '529.53.43.22.01.001'), 'Tourbillon');
INSERT INTO watch_tags (watch_id, tag) VALUES ((SELECT id FROM watches WHERE reference_number = '529.53.43.22.01.001'), 'Transparent caseback');

-- Insert the watch
INSERT INTO watches (model_name, reference_number, movement_type, case_material, case_diameter_mm, thickness_mm, lug_to_lug_mm, between_lugs_mm, dial_color, crystal_material, crystal_features, calibre, power_reserve_hours, water_resistance_bar, total_weight_grams, price)
VALUES ('DE VILLE MINI TRÉSOR', '428.58.26.60.99.002', 'Quartz', 'Moonshine™ gold', 26.0, 7.5, 31.1, 13.0, 'Yellow', 'Sapphire', 'Domed, scratch‑resistant sapphire crystal with anti‑reflective treatment inside', 'Omega 4061', 48, 3, 33.0, NULL);

-- Insert the associated tags
INSERT INTO watch_tags (watch_id, tag) VALUES ((SELECT id FROM watches WHERE reference_number = '428.58.26.60.99.002'), 'Diamonds');

