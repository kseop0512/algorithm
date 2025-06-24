-- 코드를 입력하세요
# select max(price), product_id from food_product

select * from food_product where price = (select max(price) from food_product)