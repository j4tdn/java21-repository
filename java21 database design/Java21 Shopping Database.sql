-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`T02_ITEM_GROUP`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`T02_ITEM_GROUP` ;

CREATE TABLE IF NOT EXISTS `mydb`.`T02_ITEM_GROUP` (
  `C02_ID` INT NOT NULL,
  `C02_NAME` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`C02_ID`),
  UNIQUE INDEX `C02_NAME_UNIQUE` (`C02_NAME` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`T01_ITEM`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`T01_ITEM` ;

CREATE TABLE IF NOT EXISTS `mydb`.`T01_ITEM` (
  `CO1_ID` INT NOT NULL,
  `C02_NAME` VARCHAR(100) NOT NULL,
  `C01_ITEM_GROUP_ID` INT NOT NULL,
  PRIMARY KEY (`CO1_ID`),
  UNIQUE INDEX `C02_NAME_UNIQUE` (`C02_NAME` ASC) VISIBLE,
  INDEX `fk_T01_ITEM_T02_ITEM_GROUP_idx` (`C01_ITEM_GROUP_ID` ASC) VISIBLE,
  CONSTRAINT `fk_T01_ITEM_T02_ITEM_GROUP`
    FOREIGN KEY (`C01_ITEM_GROUP_ID`)
    REFERENCES `mydb`.`T02_ITEM_GROUP` (`C02_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`T03_SIZE`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`T03_SIZE` ;

CREATE TABLE IF NOT EXISTS `mydb`.`T03_SIZE` (
  `C03_ID` INT NOT NULL,
  `C03_SIZE` VARCHAR(5) NOT NULL,
  `C03_GENDER` BIT NOT NULL,
  `C03_DESC` TEXT NOT NULL,
  PRIMARY KEY (`C03_ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`T04_ITEM_DETAIL`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`T04_ITEM_DETAIL` ;

CREATE TABLE IF NOT EXISTS `mydb`.`T04_ITEM_DETAIL` (
  `C04_ITEM_ID` INT NOT NULL,
  `C04_SIZE_ID` INT NOT NULL,
  `C04_SALES_PRICE` DOUBLE NOT NULL,
  `C04_BUY_PRICE` DOUBLE NOT NULL,
  `C04_AMOUNT` INT NOT NULL,
  PRIMARY KEY (`C04_ITEM_ID`, `C04_SIZE_ID`),
  INDEX `fk_T01_ITEM_has_T03_SIZE_T03_SIZE1_idx` (`C04_SIZE_ID` ASC) VISIBLE,
  INDEX `fk_T01_ITEM_has_T03_SIZE_T01_ITEM1_idx` (`C04_ITEM_ID` ASC) VISIBLE,
  CONSTRAINT `fk_T01_ITEM_has_T03_SIZE_T01_ITEM1`
    FOREIGN KEY (`C04_ITEM_ID`)
    REFERENCES `mydb`.`T01_ITEM` (`CO1_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_T01_ITEM_has_T03_SIZE_T03_SIZE1`
    FOREIGN KEY (`C04_SIZE_ID`)
    REFERENCES `mydb`.`T03_SIZE` (`C03_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
