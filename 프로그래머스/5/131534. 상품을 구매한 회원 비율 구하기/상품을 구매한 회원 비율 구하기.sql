-- 코드를 입력하세요
/*
SELECT
count(USER_ID)
FROM USER_INFO
WHERE YEAR(JOINED) = 2021
*/



SELECT 
    TBL.YEAR
    , TBL.MONTH
    , TBL.PURCHASED_USERS
    , TBL.PUCHASED_RATIO
FROM (

select 
    count(distinct ui.user_id) as PURCHASED_USERS
    , os.sales_amount
    , ROUND(count(distinct ui.user_id)/(SELECT
            count(USER_ID)
        FROM USER_INFO
        WHERE YEAR(JOINED) = 2021), 1) AS PUCHASED_RATIO
    , year(os.sales_date) as year
    , month(os.sales_date) as month
from user_info ui 
    inner join online_sale os on os.user_id = ui.user_id
where year(ui.joined) = 2021
group by year, month
order by ui.user_id
) TBL
ORDER BY YEAR, MONTH

/*
select 
count(distinct os.user_id)
from online_sale os
inner join user_info ui
on ui.user_id = os.user_id
where 
year(ui.joined) = 2021
and date_format(os.sales_date, '%Y%m') = '202202'
*/
