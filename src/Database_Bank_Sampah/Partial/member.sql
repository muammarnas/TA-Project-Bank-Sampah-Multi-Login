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
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `Tanggal` text NOT NULL,
  `Username` text NOT NULL,
  `Nama` text NOT NULL,
  `No_Handphone` text NOT NULL,
  `Password` text NOT NULL,
  `Alamat` text NOT NULL,
  `No_Rec` text NOT NULL,
  `Nama_Bank` text NOT NULL,
  `Saldo_Total` int(11) NOT NULL,
  `Status` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`Tanggal`, `Username`, `Nama`, `No_Handphone`, `Password`, `Alamat`, `No_Rec`, `Nama_Bank`, `Saldo_Total`, `Status`) VALUES
('08/06/2018', 'member', 'Muammar Nasution', '087788298067', 'member', 'Prima\n', '15485226', 'Bank Mandiri', 7200000, 'System Register'),
('08/06/2018', 'member1', 'Andre', '123', 'member1', 'azka', '-', '-', 0, 'System Register'),
('08/06/2018', 'member2', 'azka', '155', 'member2', 'ackaaa', '-', '-', 0, 'System Register');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`No_Handphone`(12));

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
