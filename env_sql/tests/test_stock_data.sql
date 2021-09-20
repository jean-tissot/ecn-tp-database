select upper(city) as "Quai", name, quantity from stock
join loading_point on loading_point=loading_point_id
join address on address=address_id
join product on product=product_id;