-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 20, 2025 at 01:03 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `koperasi`
--
CREATE DATABASE IF NOT EXISTS `koperasi` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `koperasi`;

-- --------------------------------------------------------

--
-- Table structure for table `data_barang`
--

DROP TABLE IF EXISTS `data_barang`;
CREATE TABLE IF NOT EXISTS `data_barang` (
  `id_Barang` varchar(5) NOT NULL,
  `nama_Barang` varchar(20) NOT NULL,
  `harga_Barang` int(15) NOT NULL,
  `Stock` int(10) NOT NULL,
  PRIMARY KEY (`id_Barang`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Truncate table before insert `data_barang`
--

TRUNCATE TABLE `data_barang`;
--
-- Dumping data for table `data_barang`
--

INSERT DELAYED IGNORE INTO `data_barang` (`id_Barang`, `nama_Barang`, `harga_Barang`, `Stock`) VALUES
('B01', 'Buku Tulis', 5000, 30);

-- --------------------------------------------------------

--
-- Table structure for table `data_guru`
--

DROP TABLE IF EXISTS `data_guru`;
CREATE TABLE IF NOT EXISTS `data_guru` (
  `Id` varchar(5) NOT NULL,
  `Nama_Guru` varchar(25) NOT NULL,
  `Status` varchar(15) NOT NULL,
  `Nip` varchar(50) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Truncate table before insert `data_guru`
--

TRUNCATE TABLE `data_guru`;
--
-- Dumping data for table `data_guru`
--

INSERT DELAYED IGNORE INTO `data_guru` (`Id`, `Nama_Guru`, `Status`, `Nip`) VALUES
('G01', 'Surandi, S. Pd', 'Aktif', '197003101995121001');

-- --------------------------------------------------------

--
-- Table structure for table `pinjaman_guru`
--

DROP TABLE IF EXISTS `pinjaman_guru`;
CREATE TABLE IF NOT EXISTS `pinjaman_guru` (
  `kode_guru` varchar(20) NOT NULL,
  `nama_guru` varchar(100) DEFAULT NULL,
  `jenis_pinjaman` varchar(50) DEFAULT NULL,
  `jumlah_pinjaman` int(11) DEFAULT NULL,
  `tanggal_pinjam` date DEFAULT NULL,
  `tanggal_jatuh_tempo` date DEFAULT NULL,
  PRIMARY KEY (`kode_guru`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Truncate table before insert `pinjaman_guru`
--

TRUNCATE TABLE `pinjaman_guru`;
--
-- Dumping data for table `pinjaman_guru`
--

INSERT DELAYED IGNORE INTO `pinjaman_guru` (`kode_guru`, `nama_guru`, `jenis_pinjaman`, `jumlah_pinjaman`, `tanggal_pinjam`, `tanggal_jatuh_tempo`) VALUES
('G02', 'Sabrina, S. Pd', 'Pokok', 5000000, '2025-05-23', '2025-07-23'),
('G06', 'Balerina, S. Pd', 'Sukarela', 2000000, '2025-05-30', '2025-08-12'),
('G08', 'Ramhat, S/Pd', 'Sukarela', 3000000, '2025-05-30', '2025-09-30');

-- --------------------------------------------------------

--
-- Table structure for table `simpanan_guru`
--

DROP TABLE IF EXISTS `simpanan_guru`;
CREATE TABLE IF NOT EXISTS `simpanan_guru` (
  `kode_guru` varchar(10) NOT NULL,
  `nama_guru` varchar(100) NOT NULL,
  `jenis_simpanan` enum('pokok','wajib','sukarela') NOT NULL,
  `jumlah_simpanan` decimal(15,2) NOT NULL,
  `tanggal_simpanan` date NOT NULL DEFAULT curdate(),
  PRIMARY KEY (`kode_guru`,`tanggal_simpanan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Truncate table before insert `simpanan_guru`
--

TRUNCATE TABLE `simpanan_guru`;
--
-- Dumping data for table `simpanan_guru`
--

INSERT DELAYED IGNORE INTO `simpanan_guru` (`kode_guru`, `nama_guru`, `jenis_simpanan`, `jumlah_simpanan`, `tanggal_simpanan`) VALUES
('G02', 'Sabrina, S. Pd', 'pokok', 1000000.00, '2025-04-12'),
('G05', 'Angga, S. Pd', 'sukarela', 500000.00, '2025-05-20');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
