-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 07, 2017 at 05:13 AM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `magia`
--
CREATE DATABASE IF NOT EXISTS `magia` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `magia`;

-- --------------------------------------------------------

--
-- Table structure for table `carta`
--

DROP TABLE IF EXISTS `carta`;
CREATE TABLE IF NOT EXISTS `carta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `costo` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  `ilustrador` varchar(50) NOT NULL,
  `edicion` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `cartaconjuro`
--

DROP TABLE IF EXISTS `cartaconjuro`;
CREATE TABLE IF NOT EXISTS `cartaconjuro` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tipoDeHechizo` varchar(100) NOT NULL,
  `carta_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `carta_id` (`carta_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `cartacriatura`
--

DROP TABLE IF EXISTS `cartacriatura`;
CREATE TABLE IF NOT EXISTS `cartacriatura` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `resistencia` int(11) NOT NULL,
  `ataque` int(11) NOT NULL,
  `carta_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `carta_id` (`carta_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `cartamano`
--

DROP TABLE IF EXISTS `cartamano`;
CREATE TABLE IF NOT EXISTS `cartamano` (
  `idmano` int(11) NOT NULL,
  `idcarta` int(11) NOT NULL,
  UNIQUE KEY `fk_id_mano` (`idmano`),
  UNIQUE KEY `fk_id_carta` (`idcarta`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `cartamazo`
--

DROP TABLE IF EXISTS `cartamazo`;
CREATE TABLE IF NOT EXISTS `cartamazo` (
  `carta_id` int(11) NOT NULL,
  `mazo_id` int(11) NOT NULL,
  KEY `carta_id` (`carta_id`),
  KEY `mazo_id` (`mazo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `cartatierra`
--

DROP TABLE IF EXISTS `cartatierra`;
CREATE TABLE IF NOT EXISTS `cartatierra` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mana` int(11) NOT NULL,
  `carta_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `carta_id` (`carta_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `mano`
--

DROP TABLE IF EXISTS `mano`;
CREATE TABLE IF NOT EXISTS `mano` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_usuario` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `fk_id_usuario` (`id_usuario`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `mazo`
--

DROP TABLE IF EXISTS `mazo`;
CREATE TABLE IF NOT EXISTS `mazo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_usuario` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `fk_id_usuario` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `pass` varchar(255) NOT NULL,
  `correo` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cartaconjuro`
--
ALTER TABLE `cartaconjuro`
  ADD CONSTRAINT `cartaconjuro_ibfk_1` FOREIGN KEY (`carta_id`) REFERENCES `carta` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `cartacriatura`
--
ALTER TABLE `cartacriatura`
  ADD CONSTRAINT `cartacriatura_ibfk_1` FOREIGN KEY (`carta_id`) REFERENCES `carta` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `cartamano`
--
ALTER TABLE `cartamano`
  ADD CONSTRAINT `cartamano_ibfk_1` FOREIGN KEY (`idmano`) REFERENCES `mano` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `cartamano_ibfk_2` FOREIGN KEY (`idcarta`) REFERENCES `carta` (`id`);

--
-- Constraints for table `cartamazo`
--
ALTER TABLE `cartamazo`
  ADD CONSTRAINT `cartamazo_ibfk_1` FOREIGN KEY (`carta_id`) REFERENCES `carta` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `cartatierra`
--
ALTER TABLE `cartatierra`
  ADD CONSTRAINT `cartatierra_ibfk_1` FOREIGN KEY (`carta_id`) REFERENCES `carta` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `mano`
--
ALTER TABLE `mano`
  ADD CONSTRAINT `mano_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `mazo`
--
ALTER TABLE `mazo`
  ADD CONSTRAINT `mazo_ibfk_1` FOREIGN KEY (`id`) REFERENCES `cartamazo` (`mazo_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `mazo_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
