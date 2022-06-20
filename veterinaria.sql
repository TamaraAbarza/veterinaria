-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-06-2022 a las 01:46:27
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `veterinaria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `telefono` bigint(20) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `contactoAlternativo` bigint(20) NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `dni`, `nombre`, `apellido`, `telefono`, `direccion`, `contactoAlternativo`, `activo`) VALUES
(5, 1234, 'Tamara', 'Abarza', 2664340080, 'Quinto centenario', 2665456766, 1),
(7, 41321456, 'Tania', 'Aguero', 2664334455, 'Barrio atte1', 2664234567, 1),
(8, 123456, 'Celeste', 'Vazquez', 2664352111, 'calle123', 1234, 1),
(9, 39993664, 'luciano', 'cejas', 1234, 'calle123', 213123, 1),
(13, 123, 'Lautaro', 'Lucero', 2663453212, 'calle 1235 ', 266453212, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascota`
--

CREATE TABLE `mascota` (
  `idMascota` int(11) NOT NULL,
  `alias` varchar(30) NOT NULL,
  `sexo` varchar(30) NOT NULL,
  `especie` varchar(30) NOT NULL,
  `raza` varchar(30) NOT NULL,
  `colorPelo` varchar(50) NOT NULL,
  `fechaNac` date NOT NULL,
  `idCliente` int(11) NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `mascota`
--

INSERT INTO `mascota` (`idMascota`, `alias`, `sexo`, `especie`, `raza`, `colorPelo`, `fechaNac`, `idCliente`, `activo`) VALUES
(4, 'Chester', 'macho', 'perro', 'pointer inglés', 'chocolate con blanco', '2019-12-05', 5, 1),
(5, 'Ambar', 'hembra', 'perro', 'mestiza', 'marron claro', '2020-06-12', 5, 1),
(6, 'Luna', 'hembra', 'gato', 'siames', 'blanco', '2014-01-21', 7, 1),
(7, 'Negro', 'macho', 'Gato', 'Mestizo', 'Negro', '2014-06-14', 7, 1),
(10, 'mishi', 'macho', 'gato', 'mestizo', 'naranja', '2022-06-02', 5, 1),
(14, 'Akira', 'hembra', 'perro', 'caniche', 'blaco', '2018-06-15', 13, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tratamiento`
--

CREATE TABLE `tratamiento` (
  `idTratamiento` int(11) NOT NULL,
  `descripcion` varchar(70) NOT NULL,
  `medicamento` varchar(50) NOT NULL,
  `importe` double NOT NULL,
  `tipoTratamiento` varchar(30) NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tratamiento`
--

INSERT INTO `tratamiento` (`idTratamiento`, `descripcion`, `medicamento`, `importe`, `tipoTratamiento`, `activo`) VALUES
(3, 'se aplicó la vacuna parainfluenza canina', 'Nobivac', 1600, 'vacunación', 0),
(4, 'se aplicó un desparasitante en gotas', 'Dermovital', 500, 'desparacitacion', 1),
(5, 'se le realizó un baño, corte de pelo y un tratamiento para pulgas', 'Osspret', 1500, 'baño y corte de pelo', 1),
(6, 'aplicacion de vacuna antirrabica', 'Nobivac', 1230, 'vacunación', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `visita`
--

CREATE TABLE `visita` (
  `idVisita` int(11) NOT NULL,
  `idMascota` int(11) NOT NULL,
  `fechaVisita` date NOT NULL,
  `detalle` varchar(50) NOT NULL,
  `peso` double NOT NULL,
  `idTratamiento` int(11) NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `visita`
--

INSERT INTO `visita` (`idVisita`, `idMascota`, `fechaVisita`, `detalle`, `peso`, `idTratamiento`, `activo`) VALUES
(11, 5, '2022-04-15', 'no presenta síntomas', 12, 3, 1),
(14, 4, '2022-05-07', 'adelgazamiento', 20, 4, 1),
(18, 7, '2022-06-02', 'sin sintomas', 4, 6, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`),
  ADD UNIQUE KEY `idCliente` (`idCliente`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD PRIMARY KEY (`idMascota`),
  ADD KEY `idCliente` (`idCliente`);

--
-- Indices de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  ADD PRIMARY KEY (`idTratamiento`);

--
-- Indices de la tabla `visita`
--
ALTER TABLE `visita`
  ADD PRIMARY KEY (`idVisita`),
  ADD KEY `idMascota` (`idMascota`),
  ADD KEY `idTratamiento` (`idTratamiento`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de la tabla `mascota`
--
ALTER TABLE `mascota`
  MODIFY `idMascota` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  MODIFY `idTratamiento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `visita`
--
ALTER TABLE `visita`
  MODIFY `idVisita` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD CONSTRAINT `mascota_ibfk_1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`);

--
-- Filtros para la tabla `visita`
--
ALTER TABLE `visita`
  ADD CONSTRAINT `visita_ibfk_2` FOREIGN KEY (`idMascota`) REFERENCES `mascota` (`idMascota`),
  ADD CONSTRAINT `visita_ibfk_3` FOREIGN KEY (`idTratamiento`) REFERENCES `tratamiento` (`idTratamiento`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
