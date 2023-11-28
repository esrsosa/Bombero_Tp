-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-11-2023 a las 19:14:56
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
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `celular` varchar(15) NOT NULL,
  `fecha_nac` date NOT NULL,
  `grupSanguineo` varchar(5) NOT NULL,
  `codBrigada` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `bombero`
--

INSERT INTO `bombero` (`id_bombero`, `dni`, `nombre`, `apellido`, `celular`, `fecha_nac`, `grupSanguineo`, `codBrigada`, `estado`) VALUES
(33, '112233', 'Santiago', 'Alvarez', '23344542', '2023-11-03', 'B+', 40, 1),
(34, '2323421', 'Valentina', 'Cortez', '232333', '1987-11-21', 'B-', 41, 1),
(35, '443355', 'Mateo', 'Rodríguez', '2334562', '2023-11-22', 'B+', 42, 1),
(36, '66454', 'Luciana', 'López', '234453', '2023-11-30', 'B+', 46, 1),
(37, '44360403', 'Emanuel', 'Sosa', '2665032890', '2023-11-15', 'B-', 44, 1),
(38, '5533344', 'Mateo', 'García', '22334455', '2023-11-13', 'B+', 40, 1),
(39, '233323', 'Joaquín', 'Ramírez ', '23456776', '2023-11-03', 'A-', 40, 1),
(40, '343434', 'Agustín', 'Silva', '2233322', '2023-11-24', 'B+', 40, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `brigada`
--

CREATE TABLE `brigada` (
  `codBrigada` int(11) NOT NULL,
  `nombre_br` varchar(20) NOT NULL,
  `especialidad` varchar(30) NOT NULL,
  `libre` tinyint(1) NOT NULL,
  `codCuartel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `brigada`
--

INSERT INTO `brigada` (`codBrigada`, `nombre_br`, `especialidad`, `libre`, `codCuartel`) VALUES
(40, 'Alpha |', 'OperativosPrevencion', 1, 11),
(41, 'Alpha ||', 'Incendios', 0, 11),
(42, 'Fénix', 'Derrumbes', 1, 14),
(43, 'Centauro', 'Inundaciones', 1, 11),
(44, 'Delta', 'Accidentes', 1, 13),
(45, 'Cóndor', 'Derrumbes', 1, 12),
(46, 'Titanes', 'Rescate', 1, 12);

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
  `correo` varchar(30) NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cuartel`
--

INSERT INTO `cuartel` (`codCuartel`, `nombre_cuartel`, `direccion`, `coord_x`, `coord_y`, `telefono`, `correo`, `activo`) VALUES
(11, 'Forntera SL', 'Av belgrano2343', 2323, 4422, '2665431223', 'FornteraSl@gmail.com', 1),
(12, 'Cuartel Puntano', 'av ilia 233', 213, 4442, '2665863745', 'CuartelPuntano@gmail.com', 1),
(13, 'Central Bomberos', 'av españa 232', 2323, 5532, '2665034567', 'CentralBomberos@e.com', 1),
(14, 'Estación Rayo Bomber', 'Av allem 2332', 545, 342, '2333544326', 'EstacionRayoBombero@gmail.com', 1);

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
  `codBrigada` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `siniestro`
--

INSERT INTO `siniestro` (`codigo`, `tipo`, `fecha_siniestro`, `coord_x`, `coord_y`, `detalles`, `fecha_resol`, `puntuacion`, `codBrigada`) VALUES
(11, 'Incendios', '2023-11-28', 3343, 5654, 'Casa incendiada', '0000-00-00', 0, 41),
(12, 'Derrumbes', '2023-11-28', 442, 222, 'Monumento de San martin caido ', '0000-00-00', 0, NULL),
(13, 'Inundaciones', '2023-11-28', 55112, 44422, 'departamento por ilia 223 inundado', '0000-00-00', 0, NULL),
(14, 'Accidentes', '2023-11-28', 3434, 123, 'Choque de vehiculos por av ilia 2323', '0000-00-00', 0, NULL);

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
  ADD KEY `codCuartel` (`codCuartel`);

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
  MODIFY `id_bombero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT de la tabla `brigada`
--
ALTER TABLE `brigada`
  MODIFY `codBrigada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;

--
-- AUTO_INCREMENT de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  MODIFY `codCuartel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD CONSTRAINT `bombero_ibfk_1` FOREIGN KEY (`codBrigada`) REFERENCES `brigada` (`codBrigada`);

--
-- Filtros para la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD CONSTRAINT `brigada_ibfk_1` FOREIGN KEY (`codCuartel`) REFERENCES `cuartel` (`codCuartel`);

--
-- Filtros para la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD CONSTRAINT `siniestro_ibfk_1` FOREIGN KEY (`codBrigada`) REFERENCES `brigada` (`codBrigada`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
