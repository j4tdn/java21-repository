-- 01.sql --> Lien quan den ITEM 
-- T01_ITEM, T02_ITEMGROUP, T06_SIZE, T09_ITEM_STATISTIC, T12_ITEM_DETAIL, T13_GALLERY

USE java21_shopping;

-- disable foreign key check
SET FOREIGN_KEY_CHECKS = 0;	

DROP TABLE IF EXISTS T02_ITEM_GROUP;
CREATE TABLE T02_ITEM_GROUP(
  C02_ITEMGROUP_ID INT PRIMARY KEY,
  C02_ITEMGROUP_NAME VARCHAR(255) NOT NULL,
  -- nên có constraint name để sau có cập nhật
  -- sử dụng name đã khai báo thay vì name mặc định
  CONSTRAINT UNQ_ITEMGROUP_NAME UNIQUE(C02_ITEMGROUP_NAME)
);

DROP TABLE IF EXISTS T01_ITEM;
CREATE TABLE T01_ITEM(
  C01_ITEM_ID INT,
  C01_ITEM_NAME VARCHAR(255) NOT NULL,
  C01_BUY_PRICE FLOAT,
  C01_ITEM_GROUP_ID INT NOT NULL,
  -- ko cần khai báo constraint name cho khóa chính 
  -- vì một table chỉ có 1 khóa chính và nó luôn lấy name = PRIMARY KEY
  -- chỉ dùng cách này khi bảng có khóa chính (chứa nhiều hơn 1 collumn)
  PRIMARY KEY (C01_ITEM_ID),
  -- mặc định ON DELETE(NO ACTION = RESTRICT), ON UPDATE(NO ACTION = RESTRICT)
  -- khi xóa dòng dữ liệu ở bảng cha("1") nếu dữ liệu đó đang được sử dụng ở bảng con thì BÁO LỖI 
  CONSTRAINT FK_ITEM_ITEM_GROUP FOREIGN KEY (C01_ITEM_GROUP_ID) 
                                REFERENCES T02_ITEM_GROUP(C02_ITEMGROUP_ID),
  CONSTRAINT UNQ_ITEM_NAME UNIQUE(C01_ITEM_NAME),
  CONSTRAINT CHECK_BY_PRICE_POSITIVE CHECK(C01_BUY_PRICE >= 0)
);

DROP TABLE IF EXISTS T06_SIZE;
CREATE TABLE T06_SIZE (
  C06_SIZE_ID INT PRIMARY KEY,
  C06_SIZE_NAME VARCHAR(10) NOT NULL,
  -- BIT(1) --> chỉ nhận tối đa 1 giá trị 0 or 1 --> 1 giá trị 
  -- BIT(N) --> nhận tối đa N giá trị "1 or 0" --> search to more !
  -- TINYINT(1) --> chỉ nhận 0 -> 9     --> 1 giá trị --> muốn 0 or 1 phải thêm CHECK
  C06_GENDER BIT(1),
  C06_SIZE_DESC TEXT NOT NULL, -- không giới hạn
  CONSTRAINT CHECK_SIZE_NAME CHECK (C06_SIZE_NAME IN ('S', 'M', 'L', 'XL', 'XXL'))
);

DROP TABLE IF EXISTS T12_ITEM_DETAIL;
-- Trong bảng T12_ITEM)DETAIL
-- + C12_ITEM_DETAIL_ID là khóa chính
-- + C12_ITEM_ID là khóa ngoại liên kết đến bảng ITEM
-- + C12_SIZE_ID là khóa ngoại liên kết đến bảng SIZE
-- + Ràng buộc UNIQUE cho (C12_ITEM_ID, C12_SIZE_ID, C12_COLOR)
CREATE TABLE T12_ITEM_DETAIL(
  C12_ITEM_DETAIL_ID INT PRIMARY KEY,
  C12_ITEM_ID INT NOT NULL, 
  C12_SIZE_ID INT NOT NULL,
  C12_COLOR VARCHAR(50) NOT NULL,
  C12_SALES_PRICE FLOAT,
  C12_AMOUNT INT NOT NULL,
  CONSTRAINT UNQ_ITEM_SIZE_COLOR UNIQUE(C12_ITEM_ID, C12_SIZE_ID, C12_COLOR),
  CONSTRAINT CHECK_SALE_PRICE_POSITIVE CHECK(C12_SALES_PRICE >= 0),
  CONSTRAINT CHECK_AMOUNT_POSITIVE CHECK(C12_AMOUNT >= 0)
);

ALTER TABLE T12_ITEM_DETAIL ADD CONSTRAINT FK_ITEM_DETAIL_ITEM_ID FOREIGN KEY (C12_ITEM_ID) REFERENCES T01_ITEM(C01_ITEM_ID);
ALTER TABLE T12_ITEM_DETAIL ADD CONSTRAINT FK_ITEM_DETAIL_SIZE_ID FOREIGN KEY (C12_SIZE_ID) REFERENCES T06_SIZE(C06_SIZE_ID);

DROP TABLE IF EXISTS T13_GALLERY;
CREATE TABLE T13_GALLERY (
  -- C13_PATH TEXT PRIMARY KEY
  -- --> lỖI PRIMARY KEY có KDL TEXT/BLOB ko được vì chưa chỉ định LENGTH OF KEY
  C13_PATH VARCHAR(255) PRIMARY KEY,
  C13_ITEM_ID INT NOT NULL
);

ALTER TABLE T13_GALLERY ADD FOREIGN KEY (C13_ITEM_ID) REFERENCES T01_ITEM(C01_ITEM_ID);

-- enable foreign key check
SET FOREIGN_KEY_CHECKS = 1;	
