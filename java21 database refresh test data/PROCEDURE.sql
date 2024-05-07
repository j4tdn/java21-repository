DROP PROCEDURE insert_into_cust;

DELIMITER $$
CREATE PROCEDURE insert_into_cust(prows INT)
BEGIN
	-- declare
    DECLARE maxId INT DEFAULT ifnull((SELECT max(C11_CUSTOMER_ID) FROM t11_customer),0);
	DECLARE i INT DEFAULT maxId + 1;
    SET prows = maxId + prows;
    
    -- implementation
    WHILE  i <= prows DO
		INSERT INTO t11_customer(
			C11_CUSTOMER_ID, 
			C11_CUSTOMER_NAME, 
			C11_CUSTOMER_EMAIL, 
			C11_CUSTOMER_ADDRESS, 
			C11_CUSTOMER_PHONE, 
			C11_CUSTOMER_USERNAME, 
			C11_CUSTOMER_PASSWORD
        )
		
		SELECT i,
			concat('Le Van Teo', i),
			concat('c', i, '@gmail.com'),
            concat('Địa chỉ', i),
            '123456789',
            concat('c', i, if(i MOD 2 = 0, 'auto', 'def')),
            concat('$2a$12$w0bs0MW/O3nTyMhuv0r1jOjq2gOaxLxkZgms7u/khHRmtCh3S/Hpu');
		SET i = i + 1;
	END WHILE;

END $$
