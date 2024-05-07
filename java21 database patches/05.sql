-- add auto increment for t12_item_detail primary key
-- note: no need to drop primary key

SET FOREIGN_KEY_CHECKS = 0;

ALTER TABLE t12_item_detail
MODIFY C12_ITEM_DETAIL_ID INT AUTO_INCREMENT;

SET FOREIGN_KEY_CHECKS = 1;