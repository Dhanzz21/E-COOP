-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 20, 2025 at 01:39 PM
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

CREATE TABLE `data_barang` (
  `id_Barang` varchar(5) NOT NULL,
  `nama_Barang` varchar(20) NOT NULL,
  `harga_Barang` int(15) NOT NULL,
  `Stock` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `data_guru`
--

CREATE TABLE `data_guru` (
  `Id` varchar(5) NOT NULL,
  `Nama_Guru` varchar(25) NOT NULL,
  `Status` varchar(15) NOT NULL,
  `Nip` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_guru`
--

INSERT INTO `data_guru` (`Id`, `Nama_Guru`, `Status`, `Nip`) VALUES
('G01', 'Surandi, S. Pd', 'Aktif', '197003101995121001');

-- --------------------------------------------------------

--
-- Table structure for table `pinjaman_guru`
--

CREATE TABLE `pinjaman_guru` (
  `kode_guru` varchar(20) NOT NULL,
  `nama_guru` varchar(100) DEFAULT NULL,
  `jenis_pinjaman` varchar(50) DEFAULT NULL,
  `jumlah_pinjaman` int(11) DEFAULT NULL,
  `tanggal_pinjam` date DEFAULT NULL,
  `tanggal_jatuh_tempo` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pinjaman_guru`
--

INSERT INTO `pinjaman_guru` (`kode_guru`, `nama_guru`, `jenis_pinjaman`, `jumlah_pinjaman`, `tanggal_pinjam`, `tanggal_jatuh_tempo`) VALUES
('G06', 'Balerina, S. Pd', 'Produktif', 2000000, '2025-05-30', '2025-08-12'),
('G08', 'Ramhat, S/Pd', 'Produktif', 3000000, '2025-05-30', '2025-09-30');

-- --------------------------------------------------------

--
-- Table structure for table `simpanan_guru`
--

CREATE TABLE `simpanan_guru` (
  `kode_guru` varchar(10) NOT NULL,
  `nama_guru` varchar(100) NOT NULL,
  `jenis_simpanan` enum('pokok','wajib','sukarela') NOT NULL,
  `jumlah_simpanan` decimal(15,2) NOT NULL,
  `tanggal_simpanan` date NOT NULL DEFAULT curdate()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_barang`
--
ALTER TABLE `data_barang`
  ADD PRIMARY KEY (`id_Barang`);

--
-- Indexes for table `data_guru`
--
ALTER TABLE `data_guru`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `pinjaman_guru`
--
ALTER TABLE `pinjaman_guru`
  ADD PRIMARY KEY (`kode_guru`);

--
-- Indexes for table `simpanan_guru`
--
ALTER TABLE `simpanan_guru`
  ADD PRIMARY KEY (`kode_guru`,`tanggal_simpanan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
