-- 코드를 입력하세요


SELECT 
    CONCAT('/home/grep/src/', UGF.BOARD_ID, '/', UGF.FILE_ID, UGF.FILE_NAME, UGF.FILE_EXT ) AS FILE_PATH
FROM USED_GOODS_FILE UGF
WHERE UGF.BOARD_ID = (SELECT
                        BOARD_ID
                        FROM USED_GOODS_BOARD UGB
                        ORDER BY VIEWS DESC
                        LIMIT 1)

ORDER BY UGF.FILE_ID DESC