CREATE TABLE `student` (
 `id` int(11) NOT NULL AUTO_INCREMENT,
 `name` varchar(255) NOT NULL,
 `class` varchar(255) NOT NULL,
 `father_name` varchar(255) NOT NULL,
 `mother_name` varchar(255) NOT NULL,
 `created_by` varchar(50) DEFAULT NULL,
 `created_at` datetime NOT NULL,
 `updated_by` varchar(50) DEFAULT NULL,
 `updated_at` datetime NOT NULL,
 PRIMARY KEY (`id`),
 KEY `is_active` (`is_active`)
) ENGINE=InnoDB;

CREATE TABLE `teacher` (
 `id` int(11) NOT NULL AUTO_INCREMENT,
 `name` varchar(255) NOT NULL,
 `class` varchar(255) NOT NULL,
 `father_name` varchar(255) NOT NULL,
 `mother_name` varchar(255) NOT NULL,
 `created_by` varchar(50) DEFAULT NULL,
 `created_at` datetime NOT NULL,
 `updated_by` varchar(50) DEFAULT NULL,
 `updated_at` datetime NOT NULL,
 PRIMARY KEY (`id`),
 KEY `is_active` (`is_active`)
) ENGINE=InnoDB;