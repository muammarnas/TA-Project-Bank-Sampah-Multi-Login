-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 08, 2018 at 12:03 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bank_sampah`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `Username` text NOT NULL,
  `Nama` text NOT NULL,
  `No_Handphone` text NOT NULL,
  `Password` text NOT NULL,
  `Alamat` varchar(50) NOT NULL,
  `Harga_Besi` text NOT NULL,
  `Harga_Tembaga` text NOT NULL,
  `Harga_Plastic` text NOT NULL,
  `Harga_Kaca` text NOT NULL,
  `PIN` int(11) NOT NULL,
  `Berita` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`Username`, `Nama`, `No_Handphone`, `Password`, `Alamat`, `Harga_Besi`, `Harga_Tembaga`, `Harga_Plastic`, `Harga_Kaca`, `PIN`, `Berita`) VALUES
('admin', 'Muammar Nasution', '087788298067', 'admin', 'Prima', '7000', '60000', '4000', '5000', 310392, 'Grand Lauching');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`No_Handphone`(12));

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
