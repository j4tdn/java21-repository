	-- trigger là đoạn code/chương trình có thể tạo cho từng table
    --         thực thi before/after các lệnh insert/update/delete
    
    -- VD: Tạo 1 trigger cho table T1 có nhiệm vụ tracking lưu lại thông tin 
    -- của các dòng dữ liệu đã bị xóa gồm: user, data_row, thời gian
    
    CREATE TABLE T99_ITEM_GROUPS_CHANGES(
		ORIGIN_ITEM_GROUP_ID INT,
        ORIGIN_ITEM_GROUP_NAME VARCHAR(255),
        NEW_ID INT,
        UPDATED_ID INT,
        CHANGE_TYPE VARCHAR(255),
        USER_CHANGE VARCHAR(255),
        AFFECTED_TIME DATETIME
    );
    
    
    DELIMITER $$
    
    CREATE TRIGGER DELETE_ITEM_GROUP_TRIGGER
    AFTER DELETE
    ON t02_item_group
    -- NEW 
    -- OLD
    FOR EACH ROW
    BEGIN
    
    INSERT INTO T99_ITEM_GROUPS_CHANGES(
		ORIGIN_ITEM_GROUP_ID,
        ORIGIN_ITEM_GROUP_NAME,
        CHANGE_TYPE,
        USER_CHANGE,
        AFFECTED_TIME
    )
    SELECT OLD.C02_ITEM_GROUP_ID,
			OLD.C02_ITEM_GROUP_NAME,
            'DELETE',
            user(),
            CURRENT_TIMESTAMP();
    END;