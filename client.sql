-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : sam. 04 juin 2022 à 21:14
-- Version du serveur : 5.7.36
-- Version de PHP : 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `client`
--

-- --------------------------------------------------------

--
-- Structure de la table `t_client`
--

DROP TABLE IF EXISTS `t_client`;
CREATE TABLE IF NOT EXISTS `t_client` (
  `nom` varchar(30) NOT NULL,
  `adresse` varchar(30) NOT NULL,
  `code_postal` int(11) NOT NULL,
  `ville` varchar(30) NOT NULL,
  `telephone` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `t_client`
--

INSERT INTO `t_client` (`nom`, `adresse`, `code_postal`, `ville`, `telephone`) VALUES
('khalil', 'ferdaous', 1254, 'oued zem', 124578),
('khalil', 'ferdaous', 1254, 'oued zem', 124578),
('soussane', 'ferdaouss', 23500, 'oued zem', 6000000),
('soussane', 'ferdaouss', 23500, 'oued zem', 6000000),
('soussane', 'ferdaouss', 23500, 'oued zem', 600450077),
('soussane', 'ferdaouss', 23500, 'oued zem', 600450077),
('soussane khalil', 'oued zem', 23350, 'oued zem', 6000000);

-- --------------------------------------------------------

--
-- Structure de la table `t_user`
--

DROP TABLE IF EXISTS `t_user`;
CREATE TABLE IF NOT EXISTS `t_user` (
  `login` varchar(20) CHARACTER SET ascii COLLATE ascii_bin NOT NULL,
  `password` varchar(20) CHARACTER SET ascii COLLATE ascii_bin NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `t_user`
--

INSERT INTO `t_user` (`login`, `password`) VALUES
('khalil16', '01234'),
('khalil16', '01234'),
('khalil065', '01234');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
