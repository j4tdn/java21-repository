-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema java21_shopping_testing
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `java21_shopping_testing` ;

-- -----------------------------------------------------
-- Schema java21_shopping_testing
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `java21_shopping_testing` DEFAULT CHARACTER SET utf8 ;
USE `java21_shopping_testing` ;

-- -----------------------------------------------------
-- Table `java21_shopping_testing`.`T02_ITEM_GROUP`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java21_shopping_testing`.`T02_ITEM_GROUP` ;

CREATE TABLE IF NOT EXISTS `java21_shopping_testing`.`T02_ITEM_GROUP` (
  `C02_ID` INT NOT NULL,
  `C02_NAME` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`C02_ID`),
  UNIQUE INDEX `C02_NAME_UNIQUE` (`C02_NAME` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `java21_shopping_testing`.`T01_ITEM`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java21_shopping_testing`.`T01_ITEM` ;

CREATE TABLE IF NOT EXISTS `java21_shopping_testing`.`T01_ITEM` (
  `C01_ITEM_ID` INT NOT NULL,
  `C01_NAME` VARCHAR(100) NOT NULL,
  `C02_ITEM_GROUP_ID` INT NOT NULL,
  PRIMARY KEY (`C01_ITEM_ID`),
  UNIQUE INDEX `C02_NAME_UNIQUE` (`C01_NAME` ASC) VISIBLE,
  INDEX `fk_T01_ITEM_T02_ITEMGROUP_idx` (`C02_ITEM_GROUP_ID` ASC) VISIBLE,
  CONSTRAINT `fk_T01_ITEM_T02_ITEMGROUP`
    FOREIGN KEY (`C02_ITEM_GROUP_ID`)
    REFERENCES `java21_shopping_testing`.`T02_ITEM_GROUP` (`C02_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `java21_shopping_testing`.`T03_SIZE`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java21_shopping_testing`.`T03_SIZE` ;

CREATE TABLE IF NOT EXISTS `java21_shopping_testing`.`T03_SIZE` (
  `C03_ID` INT NOT NULL,
  `C03_SIZE` VARCHAR(5) NOT NULL,
  `C03_GENDER` BIT NOT NULL,
  `C03_DESC` TEXT NOT NULL,
  PRIMARY KEY (`C03_ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `java21_shopping_testing`.`T04_ITEM_DETAIL`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java21_shopping_testing`.`T04_ITEM_DETAIL` ;

CREATE TABLE IF NOT EXISTS `java21_shopping_testing`.`T04_ITEM_DETAIL` (
  `C04_ITEM_ID` INT NOT NULL,
  `C04_ITEM_SIZE` INT NOT NULL,
  `C04_SALES_PRICE` DOUBLE NOT NULL,
  `C04_BUY_PRICE` DOUBLE NOT NULL,
  `C04_AMOUNT` INT NOT NULL,
  PRIMARY KEY (`C04_ITEM_ID`, `C04_ITEM_SIZE`),
  INDEX `fk_T01_ITEM_has_T03_SIZE_T03_SIZE1_idx` (`C04_ITEM_SIZE` ASC) VISIBLE,
  INDEX `fk_T01_ITEM_has_T03_SIZE_T01_ITEM1_idx` (`C04_ITEM_ID` ASC) VISIBLE,
  CONSTRAINT `fk_T01_ITEM_has_T03_SIZE_T01_ITEM1`
    FOREIGN KEY (`C04_ITEM_ID`)
    REFERENCES `java21_shopping_testing`.`T01_ITEM` (`C01_ITEM_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_T01_ITEM_has_T03_SIZE_T03_SIZE1`
    FOREIGN KEY (`C04_ITEM_SIZE`)
    REFERENCES `java21_shopping_testing`.`T03_SIZE` (`C03_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
