SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema pais
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema pais
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Pais` DEFAULT CHARACTER SET utf8 ;
USE `Pais` ;

-- -----------------------------------------------------
-- Table `pais`.`pais`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pais`.`Pais` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NULL DEFAULT NULL,
  `populacao` BIGINT(20) NULL DEFAULT NULL,
  `area` DECIMAL(15,2) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = MyISAM
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
