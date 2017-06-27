-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 27, 2017 at 03:49 AM
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
  `disponible` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `cartacoleccion`
--

DROP TABLE IF EXISTS `cartacoleccion`;
CREATE TABLE IF NOT EXISTS `cartacoleccion` (
  `idcoleccion` int(11) NOT NULL,
  `idcarta` int(11) NOT NULL,
  UNIQUE KEY `fk_id_mano` (`idcoleccion`),
  UNIQUE KEY `fk_id_carta` (`idcarta`) USING BTREE
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
-- Table structure for table `coleccion`
--

DROP TABLE IF EXISTS `coleccion`;
CREATE TABLE IF NOT EXISTS `coleccion` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_usuario` int(11) NOT NULL,
  `tipo` varchar(10) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `fk_id_usuario` (`id_usuario`) USING BTREE
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
-- Constraints for table `cartacoleccion`
--
ALTER TABLE `cartacoleccion`
  ADD CONSTRAINT `cartacoleccion_ibfk_1` FOREIGN KEY (`idcoleccion`) REFERENCES `coleccion` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `cartacoleccion_ibfk_2` FOREIGN KEY (`idcarta`) REFERENCES `carta` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

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
-- Constraints for table `cartatierra`
--
ALTER TABLE `cartatierra`
  ADD CONSTRAINT `cartatierra_ibfk_1` FOREIGN KEY (`carta_id`) REFERENCES `carta` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `coleccion`
--
ALTER TABLE `coleccion`
  ADD CONSTRAINT `coleccion_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
