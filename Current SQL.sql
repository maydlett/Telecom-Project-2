CREATE SCHEMA `telecom` ;

CREATE TABLE `telecom`.`customers` (
  `CustomerID` INT NOT NULL,
  `CustomerName` VARCHAR(45) NULL,
  PRIMARY KEY (`CustomerID`));
  
CREATE TABLE `telecom`.`plans` (
  `PlanID` INT NOT NULL,
  `PlanName` VARCHAR(45) NULL,
  `PlanPrice` VARCHAR(45) NULL,
  `PlanNumLines` VARCHAR(45) NULL,
  `CustomerID` INT NOT NULL,
  PRIMARY KEY (`PlanID`),
  FOREIGN KEY (`CustomerID`) REFERENCES `customers` (`CustomerID`));

CREATE TABLE `telecom`.`devices` (
  `DeviceID` INT NOT NULL,
  `DeviceName` VARCHAR(45) NULL,
  `DeviceType` VARCHAR(45) NULL,
  `PlanID` INT NOT NULL,
  PRIMARY KEY (`DeviceID`),
  FOREIGN KEY (`PlanID`) REFERENCES `plans` (`PlanID`));



