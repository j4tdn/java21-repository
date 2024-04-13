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
  `CO1_NAME` VARCHAR(1000) NOT NULL,
  `T02_ITEM_GROUP_C02_ID` INT NOT NULL,
  PRIMARY KEY (`CO1_ID`),
  UNIQUE INDEX `CO2_NAME_UNIQUE` (`CO1_NAME` ASC) VISIBLE,
  INDEX `fk_T01_ITEM_T02_ITEM_GROUP_idx` (`T02_ITEM_GROUP_C02_ID` ASC) VISIBLE,
  CONSTRAINT `fk_T01_ITEM_T02_ITEM_GROUP`
    FOREIGN KEY (`T02_ITEM_GROUP_C02_ID`)
    REFERENCES `mydb`.`T02_ITEM_GROUP` (`C02_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
