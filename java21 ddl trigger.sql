-- trigger là đoạn code/chương trình có thể tạo ra cho từng table
--         thực thi before/after các lệnh insert/update/delete

-- VD: Tạo 1 trigger cho table T1 có nhiệm vụ tracking lưu lại thông tin
-- của các dòng dữ liệu đã bị xóa gồm: user, data_row, thời gian

CREATE TABLE t99_item_group_changes(
	origin_item_group_id INT,
    origin_item_group_name VARCHAR(255),
    new_id INT,
    update_id INT,
    change_type VARCHAR(255),
    user_change VARCHAR(255),
    affected_time DATETIME
);

-- upgrade version of oracle
-- trigger enable/disable

DELIMITER $$
CREATE TRIGGER delete_item_group_trigger
AFTER DELETE ON t02_item_group
FOR EACH ROW
BEGIN
  -- NEW/OLD
  INSERT INTO t99_item_group_changes(
	origin_item_group_id,
    origin_item_group_name,
    change_type,
    user_change,
    affected_time
  )
  SELECT OLD.C02_ITEM_GROUP_ID, 
		 OLD.C02_ITEM_GROUP_NAME,
		 'DELETED',
         user(),
         current_timestamp();
END;
