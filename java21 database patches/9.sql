WITH CTE_ITEM_DETAIL_ODD AS (
SELECT it.C01_ITEM_ID ITEM_ID,
		s.C06_SIZE_ID SIZE_ID,
		(SELECT elt(floor(rand() * 7 + 1), 'Đỏ', 'Cam', 'Vàng', 'Lục', 'Lam', 'Chàm', 'Tím')) color,
        125 AMOUNT,
        it.C01_BUY_PRICE * 2 + s.C06_SIZE_ID * 5 PRICE
        FROM t01_item it, t06_size s
        WHERE (it.C01_ITEM_ID MOD 2 != 0)
        AND   (s.C06_SIZE_ID MOD 2 != 0)
)
select * from CTE_ITEM_DETAIL_ODD;