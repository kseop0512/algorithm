-- 코드를 입력하세요
SELECT
CAR_ID
, ROUND(
    AVG(
        if(
        datediff(end_date
                 , start_date) = 0,
            1, datediff(end_date, start_date) + 1
        )
    ), 1) AS AVERAGE_DURATION
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
group by car_id
having ROUND(AVG(
    if(
        datediff(end_date, start_date) = 0 
        , 1 , datediff(end_date, start_date) + 1
    )
    
), 1) >= 7
order by AVERAGE_DURATION DESC, car_id DESC;