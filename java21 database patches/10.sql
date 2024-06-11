DELIMITER $$
drop PROCEDURE insert_into_cust;

CREATE PROCEDURE insert_into_cust(prows int)
BEGIN
	-- declare
    DECLARE maxId INT DEFAULT ifnull((SELECT max(C11_CUSTOMER_ID) FROM T11_CUSTOMER), 0);
    DECLARE i INT DEFAULT maxId + 1;
    SET prows = maxId + prows;
    -- implement
    WHILE i <= prows DO
	INSERT INTO T11_CUSTOMER(C11_CUSTOMER_ID, C11_CUSTOMER_NAME, C11_CUSTOMER_EMAIL, C11_EMPLOYEE_ADDRESS, 
                             C11_EMPLOYEE_PHONE, C11_EMPLOYEE_USERNAME, C11_EMPLOYEE_PASSWORD)
    
    
		SELECT  i,
				concat('Le Van Teo', i),
                concat('c',i,'@gmail.com'),
                concat('Địa chỉ', i),
                concat('123456789', i),
                concat('c', i, if(i MOD 2 = 0, 'auto', 'def')),
                'b';
                SET i = i + 1;
    END WHILE;

END $$
