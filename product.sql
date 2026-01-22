-- Produtos da Imagem 1 (Lanches)
INSERT INTO products ( CREATED_AT, name, description, price, promo_price, photo, metadata) VALUES
('2026-01-22 10:18:00', 'X-Tudo Monstro', 'Pão, 2 hambúrgueres, ovo, bacon, presunto, queijo, alface e tomate.', 32.00, 0, '/img/ham 2.jpg', NULL),
('2026-01-22 10:18:00', 'X-Bacon Crocante', 'Pão brioche, hambúrguer 180g, muito bacon crocante e queijo cheddar.', 28.50, 0, '/img/x bacon.jpg', NULL),
('2026-01-22 10:18:00', 'X-Salada Clássico', 'O clássico leve. Pão, carne artesanal, queijo prato, alface americana e tomate.', 22.00, 0, '/img/x salada.jpg', NULL),
('2026-01-22 10:18:00', 'X-Egg Especial', 'Pão, carne suculenta, 2 ovos fritos, queijo mussarela e maionese da casa.', 24.00, 0, '/img/x egesp.jpg', NULL),
('2026-01-22 10:18:00', 'Smash Duplo Cheddar', 'Dois hambúrgueres smash prensados na chapa com dobro de cheddar cremoso.', 30.00, 0, '/img/duplo.jpg', NULL),
('2026-01-22 10:18:00', 'X-Frango Supreme', 'Filé de frango grelhado, catupiry original, milho e batata palha.', 26.00, 0, '/img/x frango.jpg', NULL);

-- Produtos da Imagem 2 (Acompanhamentos e Bebidas)
INSERT INTO products ( CREATED_AT, name, description, price, promo_price, photo, metadata) VALUES
('2026-01-22 10:18:00', 'Nuggets', '2 salsichas, purê, vinagrete, milho, batata palha e queijo ralado.', 18.00, 0, '/img/nuggets.jpg', NULL), -- Obs: Descrição original da imagem parece ser de Hot Dog
('2026-01-22 10:18:00', 'Batata Frita Turbinada', 'Porção generosa de batatas com cheddar e pedacinhos de bacon.', 25.00, 0, '/img/batata.jpg', NULL),
('2026-01-22 10:18:00', 'Açaí na Tigela (500ml)', 'Açaí puro com banana, morango, leite condensado e granola.', 20.00, 0, '/img/açai.jpg', NULL),
('2026-01-22 10:18:00', 'Refrigerante Lata', 'Coca-Cola, Guaraná, Fanta ou Sprite. Bem gelado!', 6.00, 0, '/img/refri.jpg', NULL),
('2026-01-22 10:18:00', 'Sorvete', 'O clássico leve. Pão, carne artesanal, queijo prato, alface americana e tomate.', 22.00, 0, '/img/sorvete.jpg', NULL), -- Obs: Descrição original da imagem duplicada do X-Salada
('2026-01-22 10:18:00', 'Salgados', 'O clássico leve. Pão, carne artesanal, queijo prato, alface americana e tomate.', 22.00, 0, '/img/salgados.jpg', NULL); -- Obs: Descrição original da imagem duplicada do X-Salada