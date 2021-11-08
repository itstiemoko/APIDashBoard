-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : jeu. 04 nov. 2021 à 17:54
-- Version du serveur : 10.4.20-MariaDB
-- Version de PHP : 7.3.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `odk_db`
--

-- --------------------------------------------------------

--
-- Structure de la table `admin`
--

CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL,
  `admin_email` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `admin_nom` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `admin_password` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `admin_prenom` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `admin`
--

INSERT INTO `admin` (`admin_id`, `admin_email`, `admin_nom`, `admin_password`, `admin_prenom`) VALUES
(1, 'mk@gmail.com', 'Zan', 'hello', 'Coulibaly');

-- --------------------------------------------------------

--
-- Structure de la table `apprenant`
--

CREATE TABLE `apprenant` (
  `apprenant_id` int(11) NOT NULL,
  `apprenant_age` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `apprenant_email` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `apprenant_genre` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `apprenant_login` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `apprenant_nom` varchar(25) COLLATE utf8mb4_unicode_ci NOT NULL,
  `apprenant_password` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `apprenant_prenom` varchar(25) COLLATE utf8mb4_unicode_ci NOT NULL,
  `apprenant_status` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `apprenant_telephone` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `date_creation` date NOT NULL,
  `date_modification` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `apprenant`
--

INSERT INTO `apprenant` (`apprenant_id`, `apprenant_age`, `apprenant_email`, `apprenant_genre`, `apprenant_login`, `apprenant_nom`, `apprenant_password`, `apprenant_prenom`, `apprenant_status`, `apprenant_telephone`, `date_creation`, `date_modification`) VALUES
(1, '24', 'mk@gmail.com', 'Masculin', 'tieckby', 'Sogodogo', 'hello', 'Tiémoko', 'activer', '94940220', '2017-02-10', '2021-10-21'),
(4, '20', 'ss@gmail.com@gmail.com', 'Masculin', 'ss', 'Sidibé', 'pass123', 'Sékou', 'desactiver', '82362837', '2020-01-10', '2021-02-09');

-- --------------------------------------------------------

--
-- Structure de la table `formateur`
--

CREATE TABLE `formateur` (
  `formateur_id` int(11) NOT NULL,
  `date_creation` date NOT NULL,
  `formateur_age` varchar(5) COLLATE utf8mb4_unicode_ci NOT NULL,
  `formateur_email` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `formateur_genre` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `formateur_nom` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `formateur_prenom` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `formateur_telephone` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `formateur`
--

INSERT INTO `formateur` (`formateur_id`, `date_creation`, `formateur_age`, `formateur_email`, `formateur_genre`, `formateur_nom`, `formateur_prenom`, `formateur_telephone`) VALUES
(3, '2021-10-03', '28', 'km@gmail.com', 'Féminin', 'Koné', 'Mariama', '96182518'),
(2, '2021-10-03', '26', 'ks@gmail.com', 'Masculin', 'Kané', 'Sékou', '82182518');

-- --------------------------------------------------------

--
-- Structure de la table `liste_presence`
--

CREATE TABLE `liste_presence` (
  `liste_presence_id` int(11) NOT NULL,
  `date` date NOT NULL,
  `heure_arrive_apprenant` time NOT NULL,
  `heure_depart_apprenant` time NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Structure de la table `presence_apprenant`
--

CREATE TABLE `presence_apprenant` (
  `id_apprenant` int(11) NOT NULL,
  `id_presence` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Structure de la table `presence_formateur`
--

CREATE TABLE `presence_formateur` (
  `id_formateur` int(11) NOT NULL,
  `id_presence` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`admin_id`);

--
-- Index pour la table `apprenant`
--
ALTER TABLE `apprenant`
  ADD PRIMARY KEY (`apprenant_id`);

--
-- Index pour la table `formateur`
--
ALTER TABLE `formateur`
  ADD PRIMARY KEY (`formateur_id`),
  ADD UNIQUE KEY `UK_tccncb2w4wh81jlyk56gf7c88` (`formateur_email`);

--
-- Index pour la table `liste_presence`
--
ALTER TABLE `liste_presence`
  ADD PRIMARY KEY (`liste_presence_id`);

--
-- Index pour la table `presence_apprenant`
--
ALTER TABLE `presence_apprenant`
  ADD KEY `FK5m2p4cfiufkw0knq474wskewk` (`id_presence`),
  ADD KEY `FKfygbu2rani4oqm1519t5963gi` (`id_apprenant`);

--
-- Index pour la table `presence_formateur`
--
ALTER TABLE `presence_formateur`
  ADD KEY `FKpcwttb23maf0a8lywp9ubq387` (`id_presence`),
  ADD KEY `FKsctu4xcg5936h3qp43uat85eu` (`id_formateur`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `admin`
--
ALTER TABLE `admin`
  MODIFY `admin_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `apprenant`
--
ALTER TABLE `apprenant`
  MODIFY `apprenant_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `formateur`
--
ALTER TABLE `formateur`
  MODIFY `formateur_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `liste_presence`
--
ALTER TABLE `liste_presence`
  MODIFY `liste_presence_id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
