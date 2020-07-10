-- --------------------------------------------------------
-- Хост:                         127.0.0.1
-- Версия сервера:               5.5.62 - MySQL Community Server (GPL)
-- Операционная система:         Win64
-- HeidiSQL Версия:              10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Дамп структуры базы данных shop
CREATE DATABASE IF NOT EXISTS `shop` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `shop`;

-- Дамп структуры для таблица shop.category
CREATE TABLE IF NOT EXISTS `category` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- Дамп данных таблицы shop.category: ~5 rows (приблизительно)
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` (`id`, `name`) VALUES
	(1, 'clothes'),
	(2, 'tehnic'),
	(3, 'toy'),
	(4, 'House'),
	(5, 'House where');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;

-- Дамп структуры для таблица shop.product
CREATE TABLE IF NOT EXISTS `product` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(60) DEFAULT NULL,
  `rate` int(5) DEFAULT NULL,
  `price` int(5) DEFAULT NULL,
  `category_id` int(5) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `category_id` (`category_id`),
  CONSTRAINT `product_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Дамп данных таблицы shop.product: ~2 rows (приблизительно)
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` (`id`, `name`, `rate`, `price`, `category_id`) VALUES
	(1, 'skirt\r\n', 1, 200, 1),
	(2, 'phone', 4, 7000, 2);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
