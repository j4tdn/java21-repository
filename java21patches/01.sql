-- 01.sql --> item
use java21_shopping;

set foreign_key_checks = 0;

drop table if exists T02_ITEMGROUP;
create table T02_ITEMGROUP (
	CO2_ITEM_GROUP_ID INT PRIMARY KEY,
    CO2_ITEM_GROUP_NAME VARCHAR(255) NOT NULL,
    -- NÊN CÓ CONSTRAINT NAME ĐỂ SAU CÓ CẬP NHẬT, XÓA CONSTRAINT SỬ DỤNG NAME ĐÃ KHAI BÁO THAY VÌ NAME MẶC ĐỊNH
    CONSTRAINT UNQ_ITEMGROUP_NAME UNIQUE(CO2_ITEM_GROUP_NAME)
);
drop table if exists T01_ITEM;
create table T01_ITEM (
	CO1_ITEM_ID INT,
	CO1_ITEM_NAME varchar(255) not null,
	CO1_BUY_PRICE float,
	CO1_ITEM_GROUP_ID int not null,
    -- dùng cách ni khi khóa chinh có hơn 1 column
    PRIMARY KEY(CO1_ITEM_ID),
	CONSTRAINT UNQ_ITEM_NAME UNIQUE(CO1_ITEM_NAME),
    constraint FK_ITEM_ITEMGROUP foreign key (CO1_ITEM_GROUP_ID)
								references T02_ITEMGROUP(CO2_ITEM_GROUP_ID),
	constraint CHECK_BUY_PRICE_POSITIVE CHECK (CO1_BUY_PRICE >= 0)
);
drop table if exists T06_SIZE;
create table T06_SIZE(
		CO6_SIZE_ID INT PRIMARY KEY,
        C06_SIZE_NAME VARCHAR(10) NOT NULL,
        -- BIT(1) --> chỉ nhận giá trị 0, 1 -->
        -- BIT(5) --> chỉ nhận 0,1 -->
        --
        C06_GENDER BIT(1) NOT NULL,
        CO6_SIZE_DESC TEXT NOT NULL,
        CONSTRAINT CHECK_SIZE_NAME CHECK (C06_SIZE_NAME IN ('S', 'M', 'L', 'XL', 'XXL'))     
);
drop table if exists T12_ITEM_DETAIL;
create table T12_ITEM_DETAIL(
	C12_ITEM_DETAIL_ID INT PRIMARY KEY,
	C12_ITEM_ID INT NOT NULL,
	C12_SIZE_ID INT NOT NULL,
	C12_COLOR VARCHAR(50) NOT NULL,
	C12_SALES_PRICE float,
	C12_AMOUNT INT NOT NULL default 0,
    CONSTRAINT UNQ_ITEM_SIZE_COLOR UNIQUE(C12_ITEM_ID, C12_SIZE_ID, C12_COLOR),
	CONSTRAINT CHECK_SALES_PRICE_POSITIVE CHECK ((C12_SALES_PRICE >= 0)),
	CONSTRAINT CHECK_AMOUNT_POSITIVE CHECK (C12_AMOUNT >= 0)    
);
drop table if exists T13_GALLERY;
CREATE TABLE T13_GALLERY (
	C13_PATH varchar(255) primary key,
	C13_ITEM_ID INT NOT NULL
);

alter table T13_GALLERY
ADD constraint FK_GALLERY_ITEM foreign key (C13_ITEM_ID) references T01_ITEM(CO1_ITEM_ID);

set foreign_key_checks = 1;



