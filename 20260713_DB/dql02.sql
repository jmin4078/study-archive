-- 6단계 : ORDER BY
SELECT
    category,
    AVG(price) AS '평균가',
    COUNT(*) AS '갯수',
    GROUP_CONCAT(product_name)
-- 1. FROM, 2. GROUP BY, 3. SELECT - Alias
FROM
    products
WHERE
    price >= 30000
GROUP BY
    category
HAVING
    AVG(price) > 10000
-- ORDER BY AVG(price)
-- ORDER BY "평균가"; -- ALIAS를 준 이름의 경우에는 ""로 해야 인식(mysql)
ORDER BY category;
-- ORDER BY price; -- GROUP BY 상태라면 ORDER BY 시
-- 1) GROUP BY에 포함된 컬럼 2) 집계함수만 사용 가능

-- 7단계 : LIMIT (MySQL)
SELECT
    category,
    AVG(price) AS '평균가',
    COUNT(*) AS '갯수',
    GROUP_CONCAT(product_name)
FROM
    products
WHERE
    price >= 30000
GROUP BY
    category
HAVING
    AVG(price) > 10000
ORDER BY category
    LIMIT 1;