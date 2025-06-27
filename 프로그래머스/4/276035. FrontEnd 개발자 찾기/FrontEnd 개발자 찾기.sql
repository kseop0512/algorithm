-- 코드를 작성해주세요

select 
dev.id
, dev.email
, MAX(dev.first_name) as first_name
, MAX(dev.last_name) as last_name
from DEVELOPERS dev
    inner join skillcodes sc 
        on dev.skill_code & sc.code > 0
where sc.category = 'Front End'
group by dev.id, dev.email
order by dev.id