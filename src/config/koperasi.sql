-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 03, 2025 at 04:53 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

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
  `Id` varchar(7) NOT NULL,
  `nama_Barang` varchar(30) NOT NULL,
  `harga_Barang` int(15) NOT NULL,
  `Stock` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_barang`
--

INSERT INTO `data_barang` (`Id`, `nama_Barang`, `harga_Barang`, `Stock`) VALUES
('ATR001', 'Topi', 35000, 20),
('ATR002', 'Sabuk', 35000, 15),
('ATR003', 'Dasi', 30000, 18),
('ATR004', 'Satu Paket Bed Sekol', 25000, 20),
('ATK001', 'Jangka', 10000, 20),
('ATK002', 'Role Tip (15 m)', 8000, 20),
('ATK003', 'Role Tip (8 m)', 7500, 20),
('ATK004', 'Buku Tulis 58 Lembar', 5000, 20),
('ATK005', 'Buku Gambar', 5000, 20),
('ATK006', 'Pulpen Hitam', 4000, 20),
('ATK007', 'Pensil Faber Castell', 4000, 20),
('ATK008', 'Pulpen Merah', 4000, 20),
('ATK009', 'Buku Tulis 38 Lembar', 4000, 20),
('ATK010', 'Buku Kotak-kotak', 3500, 20),
('ATK011', 'Penggaris', 3000, 20),
('ATK012', 'Lem Glue Stick', 3000, 20),
('ATK013', 'Busur', 2500, 20),
('ATK014', 'Rautan', 2500, 20),
('ATK015', 'Pensil 2B', 2000, 20),
('ATK016', 'Penghapus', 1500, 20),
('ATK017', 'Kertas Folio 1 Lemba', 500, 20);

-- --------------------------------------------------------

--
-- Table structure for table `data_guru`
--

DROP TABLE IF EXISTS `data_guru`;
CREATE TABLE IF NOT EXISTS `data_guru` (
  `Id` varchar(4) NOT NULL,
  `Nama_Guru` varchar(50) NOT NULL,
  `Status` varchar(10) NOT NULL,
  `Nip` varchar(50) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_guru`
--

INSERT INTO `data_guru` (`Id`, `Nama_Guru`, `Status`, `Nip`) VALUES
('G01', 'Surandi, S.Pd', 'PNS', '197003101195121001'),
('G02', 'Genoveva Sri Redjeki Handajani, S.Pd', 'PNS', '19680251998032004'),
('G03', 'Dra. Ninik Sugiharti', 'PNS', '19680529198202201'),
('G04', 'Jude Sussilawaty, S.Pd', 'PNS', '196812252005121205'),
('G05', 'Suci Wulandari Martuninghsih, S.S', 'PNS', '19770312009092003'),
('G06', 'Tini Haryati, S.S', 'PNS', '198005072014122004'),
('G07', 'Atiek Indriani, S.Pd', 'PNS', '19800720140122004'),
('G08', 'Mardiyah, S.Pd', 'PNS', '198404072019032008'),
('G09', 'Susi Komariah, S.Pd', 'PNS', '198009152014122002'),
('G10', 'Deni Susanti, S.Pd', 'PNS', '19900712210392006'),
('G11', 'Husni Thamrin, S.Pd', 'PPPK', '197205201202211002'),
('G12', 'Neng Ika Rahmadila, S.Pd', 'PPPK', '199003140222201201'),
('G13', 'Rizka Dwic Suwalandi, S.Pd', 'PPPK', '19983121020212001'),
('G14', 'Nur Burdah Fitrani, S.Pd', 'PPK', '1990315202321016'),
('G15', 'Amin Rohayati, S.Pd', 'PPK', '1990202822032217'),
('G16', 'Rika Desi Kencana, S.Pd', 'PPK', '1993111722042481'),
('G17', 'Atilah Wulandari, S.Pd', 'PKT', '1986209202042480'),
('G18', 'Ahmad Mujalisk, S.Pd', 'PKT', '1999161020242483'),
('G19', 'Wida Awu Frydani, S.Pd', 'PKT', '1994012402024840'),
('G20', 'Dimas Rakatama, S.Si', 'PKT', '1986070202424894'),
('G21', 'Susi Sumarhati, S.Pd', 'PKT', '199711240242486'),
('G22', 'Wulan Sari Abisah, S.Pd', 'PKT', '1986125020242492'),
('G23', 'Putri Sekar Ayu Antoni, S.Pd', 'PKT', '1995123202024847'),
('G24', 'Resti Dyah Susiti, S.Pd', 'PKT', '1992011902022487'),
('G25', 'Agnes Hikmatila, M.Pd', 'PKT', '1994011820242490'),
('G26', 'Amar Iim, S.Sn', 'PKT', '1991022020242488'),
('G27', 'Auliya Hanun Fauziyah, S.Or', 'PKT', '1991082020242489'),
('G28', 'Catur Addy Wijaya, S.Pd., I. MM', 'PKT', '1981010102022493'),
('G29', 'Dimas Hanggono, S.Pd', 'PKT', '1988061620242494'),
('G30', 'Rizki Aliyah, M.Pd', 'PKT', '1976022020242495'),
('G31', 'Sarah Fauziah, S.Mpd', 'PKT', '19911010120242496');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `username` varchar(30) NOT NULL,
  `password_hash` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password_hash`) VALUES
('admin@koperasi', '827ccb0eea8a706c4c34a16891f84e7b');

-- --------------------------------------------------------

--
-- Table structure for table `pinjaman_guru`
--

DROP TABLE IF EXISTS `pinjaman_guru`;
CREATE TABLE IF NOT EXISTS `pinjaman_guru` (
  `Id` varchar(10) DEFAULT NULL,
  `nama_guru` varchar(100) DEFAULT NULL,
  `jenis_pinjaman` varchar(50) DEFAULT NULL,
  `jumlah_pinjaman` decimal(15,2) DEFAULT NULL,
  `tanggal_pinjam` date DEFAULT NULL,
  `tanggal_jatuh_tempo` date DEFAULT NULL,
  KEY `Id` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pinjaman_guru`
--

INSERT INTO `pinjaman_guru` (`Id`, `nama_guru`, `jenis_pinjaman`, `jumlah_pinjaman`, `tanggal_pinjam`, `tanggal_jatuh_tempo`) VALUES
('G01', 'Surandi, S. Pd', 'Produktif', 300000.00, '2025-05-30', '2025-07-31'),
('G02', 'Genoveva Sri Redjeki Handajani, S.Pd', 'Konsumtif', 45333.00, '2025-06-02', '2025-06-30'),
('G03', 'Dra. Ninik Sugiharti', 'Produktif', 1246666.00, '2025-06-03', '2025-06-30');

-- --------------------------------------------------------

--
-- Table structure for table `simpanan_guru`
--

DROP TABLE IF EXISTS `simpanan_guru`;
CREATE TABLE IF NOT EXISTS `simpanan_guru` (
  `Id` varchar(10) DEFAULT NULL,
  `nama_guru` varchar(100) DEFAULT NULL,
  `jenis_simpanan` varchar(50) DEFAULT NULL,
  `jumlah_simpanan` decimal(15,2) DEFAULT NULL,
  `tanggal_simpanan` date DEFAULT NULL,
  KEY `Id` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `simpanan_guru`
--

INSERT INTO `simpanan_guru` (`Id`, `nama_guru`, `jenis_simpanan`, `jumlah_simpanan`, `tanggal_simpanan`) VALUES
('G01', 'Surandi, S. Pd', 'Wajib', 1000000.00, '2025-05-30');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pinjaman_guru`
--
ALTER TABLE `pinjaman_guru`
  ADD CONSTRAINT `pinjaman_guru_ibfk_1` FOREIGN KEY (`Id`) REFERENCES `data_guru` (`Id`);

--
-- Constraints for table `simpanan_guru`
--
ALTER TABLE `simpanan_guru`
  ADD CONSTRAINT `simpanan_guru_ibfk_1` FOREIGN KEY (`Id`) REFERENCES `data_guru` (`Id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
