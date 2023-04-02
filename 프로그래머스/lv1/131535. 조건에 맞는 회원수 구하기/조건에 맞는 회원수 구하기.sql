-- 코드를 입력하세요
SELECT count(*) as USERS 
FROM user_info 
WHERE to_char(joined, 'YYYY') = '2021'
AND age BETWEEN 20 AND 29;