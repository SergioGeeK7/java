-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-11-2013 a las 16:26:13
-- Versión del servidor: 5.6.11
-- Versión de PHP: 5.5.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `educacion`
--
CREATE DATABASE IF NOT EXISTS `educacion` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `educacion`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiantes`
--

CREATE TABLE IF NOT EXISTS `estudiantes` (
  `codigo` int(15) NOT NULL,
  `nomest` varchar(30) NOT NULL,
  `apellidos` varchar(30) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `celular` varchar(30) NOT NULL,
  `genero` varchar(15) NOT NULL,
  `foto` longblob,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE IF NOT EXISTS `materia` (
  `codmateria` int(15) NOT NULL,
  `nommateria` varchar(60) NOT NULL,
  `numcreditos` int(15) NOT NULL,
  `valormat` int(15) NOT NULL,
  `semestre` varchar(15) NOT NULL,
  `jornada` varchar(15) NOT NULL,
  `nomcarrera` varchar(50) NOT NULL,
  PRIMARY KEY (`codmateria`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `matricula`
--

CREATE TABLE IF NOT EXISTS `matricula` (
  `codmatricula` int(15) NOT NULL,
  `coestudiante` int(15) NOT NULL,
  `fechamat` date NOT NULL,
  `valor` int(15) NOT NULL,
  `semestre` varchar(15) NOT NULL,
  `jornada` varchar(15) NOT NULL,
  `carrera` varchar(50) NOT NULL,
  PRIMARY KEY (`codmatricula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `notas`
--

CREATE TABLE IF NOT EXISTS `notas` (
  `codnota` int(15) NOT NULL,
  `codestudiante` int(15) NOT NULL,
  `codcarrera` int(15) NOT NULL,
  `codmateria` int(15) NOT NULL,
  `nommateria` varchar(50) NOT NULL,
  `semestre` varchar(15) NOT NULL,
  `creditos` int(15) NOT NULL,
  `notadef` varchar(5) NOT NULL,
  PRIMARY KEY (`codnota`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pagos`
--

CREATE TABLE IF NOT EXISTS `pagos` (
  `codpago` int(15) NOT NULL,
  `codestudiante` int(15) NOT NULL,
  `fechapago` date NOT NULL,
  `concepto` varchar(100) NOT NULL,
  `ncuotas` int(5) NOT NULL,
  PRIMARY KEY (`codpago`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
