-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-11-2023 a las 01:29:47
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bomberos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bombero`
--

CREATE TABLE `bombero` (
  `id_bombero` int(11) NOT NULL,
  `dni` varchar(8) NOT NULL,
  `nombre` varchar(11) NOT NULL,
  `apellido` varchar(11) NOT NULL,
  `fecha_nac` date NOT NULL,
  `celular` varchar(15) NOT NULL,
  `codBrigada` int(11) NOT NULL,
  `grupSanguineo` varchar(5) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `bombero`
--

INSERT INTO `bombero` (`id_bombero`, `dni`, `nombre`, `apellido`, `fecha_nac`, `celular`, `codBrigada`, `grupSanguineo`, `estado`) VALUES
(1, '44360403', '', '', '2002-07-18', '2665', 1, '0+', 1),
(2, '111', 'sss11', '111', '2023-11-04', '212', 2, 'Item ', 1),
(3, '1234', 'aa', 'sss', '2023-11-04', '2312', 2, 'A+ ', 1),
(4, '1212', 'ema', 'sosa', '2023-11-02', '2323', 2, 'A- ', 1),
(5, '123123', 'asd', 'ads', '2023-11-04', '234', 2, 'B- ', 1),
(6, '21231', 'arian', 'sara', '1997-11-15', '5115152', 2, '0- ', 1),
(7, '121531', 'gonzalo', 'perez', '1987-11-07', '1515151', 2, 'B- ', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `brigada`
--

CREATE TABLE `brigada` (
  `codBrigada` int(11) NOT NULL,
  `nombre_br` varchar(20) NOT NULL,
  `especialidad` varchar(30) NOT NULL,
  `libre` tinyint(1) NOT NULL,
  `nro_cuartel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `brigada`
--

INSERT INTO `brigada` (`codBrigada`, `nombre_br`, `especialidad`, `libre`, `nro_cuartel`) VALUES
(1, 'avion', 'Rescate', 1, 2),
(2, 'alfa', 'Rescate', 1, 1),
(5, 'sa', 'Rescate', 0, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuartel`
--

CREATE TABLE `cuartel` (
  `codCuartel` int(11) NOT NULL,
  `nombre_cuartel` varchar(20) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `coord_x` int(11) NOT NULL,
  `coord_y` int(11) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `correo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cuartel`
--

INSERT INTO `cuartel` (`codCuartel`, `nombre_cuartel`, `direccion`, `coord_x`, `coord_y`, `telefono`, `correo`) VALUES
(1, 'Bomberos voluntarios', 'a la vuelta de la casa de mart', 1231, 213123, '2222222', 'dddddddddddddd');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `siniestro`
--

CREATE TABLE `siniestro` (
  `codigo` int(11) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `fecha_siniestro` date NOT NULL,
  `coord_x` int(11) NOT NULL,
  `coord_y` int(11) NOT NULL,
  `detalles` text NOT NULL,
  `fecha_resol` date NOT NULL,
  `puntuacion` int(11) NOT NULL,
  `codBrigada` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `siniestro`
--

INSERT INTO `siniestro` (`codigo`, `tipo`, `fecha_siniestro`, `coord_x`, `coord_y`, `detalles`, `fecha_resol`, `puntuacion`, `codBrigada`) VALUES
(1, 'Incendios', '2023-10-31', 33, 2, 'xx', '0000-00-00', 0, 1),
(2, 'Incendios', '2023-11-06', 33, 2, 'xx', '0000-00-00', 0, 1),
(3, 'Incendios', '2023-11-04', 33, 2, 'xx', '0000-00-00', 0, 1),
(5, 'Incendios', '2023-11-05', 33, 2, 'xx', '0000-00-00', 0, 5),
(6, 'Incendios', '2023-11-07', 33, 2, 'xx', '0000-00-00', 0, 2),
(7, 'Incendios', '2023-11-08', 33, 2, 'xx', '0000-00-00', 0, 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD PRIMARY KEY (`id_bombero`),
  ADD KEY `codBrigada` (`codBrigada`);

--
-- Indices de la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD PRIMARY KEY (`codBrigada`),
  ADD KEY `nro_cuartel` (`nro_cuartel`);

--
-- Indices de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  ADD PRIMARY KEY (`codCuartel`);

--
-- Indices de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `codBrigada` (`codBrigada`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bombero`
--
ALTER TABLE `bombero`
  MODIFY `id_bombero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  MODIFY `codCuartel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD CONSTRAINT `bombero_ibfk_1` FOREIGN KEY (`codBrigada`) REFERENCES `brigada` (`codBrigada`);

--
-- Filtros para la tabla `cuartel`
--
ALTER TABLE `cuartel`
  ADD CONSTRAINT `cuartel_ibfk_1` FOREIGN KEY (`codCuartel`) REFERENCES `brigada` (`nro_cuartel`);

--
-- Filtros para la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD CONSTRAINT `siniestro_ibfk_1` FOREIGN KEY (`codBrigada`) REFERENCES `brigada` (`codBrigada`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
