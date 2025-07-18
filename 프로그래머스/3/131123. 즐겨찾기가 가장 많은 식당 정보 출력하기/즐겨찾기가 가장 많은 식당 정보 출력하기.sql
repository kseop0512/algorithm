-- 코드를 입력하세요

SELECT 
RI.FOOD_TYPE
, RI.REST_ID
, RI.REST_NAME
, RI.FAVORITES
FROM REST_INFO RI
INNER JOIN (
SELECT
FOOD_TYPE
, MAX(FAVORITES) AS FAVORITES
FROM REST_INFO
GROUP BY FOOD_TYPE
) MAX_TBL 
ON MAX_TBL.FOOD_TYPE = RI.FOOD_TYPE
AND MAX_TBL.FAVORITES = RI.FAVORITES
ORDER BY FOOD_TYPE DESC