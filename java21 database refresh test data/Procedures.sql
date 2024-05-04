
DELIMITER $$
CREATE PROCEDURE insert_into_cust(prows int)
BEGIN 
    -- declare
    DECLARE i INT DEFAULT 1;
    
    
    -- implementation
    WHILE i <= prows DO
          INSERT INTO t11_customer(C11_CUSTOMER_ID, C11_CUSTOMER_NAME, C11_CUSTOMER_EMAIL, C11_CUSTOMER_ADDRESS,	
                                   C11_CUSTOMER_PHONE, C11_CUSTOMER_USERNAME, C11_CUSTOMER_PASSWORD) 
          SELECT i,
              concat('Le Van Teo ', i),
              concat('c',i,'@gmail.com'),
              concat('Địa chỉ', i),
              '123456789',
              concat('c', i, if(i MOD 2 = 0, 'auto', 'def')),
              '$2a$12$w0bs0MW/O3nTyMhuv0r1jOjq2gOaxLxkZgms7u/khHRmtCh3S/Hpu';
		   SET i = i + 1;
    END WHILE;
END $$

DROP PROCEDURE insert_into_cust;