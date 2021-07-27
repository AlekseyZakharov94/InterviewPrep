CREATE SCHEMA `cinema` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;

CREATE TABLE `cinema`.`films` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `duration` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;

CREATE TABLE `cinema`.`sessions` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `film_id` INT NOT NULL,
  `start_time` TIME NOT NULL,
  `date` DATE NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `film_id_idx` (`film_id` ASC) VISIBLE,
  CONSTRAINT `film_id`
    FOREIGN KEY (`film_id`)
    REFERENCES `cinema`.`films` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;

CREATE TABLE `cinema`.`prices` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `session_id` INT NOT NULL,
  `price` DECIMAL NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `session_id_idx` (`session_id` ASC) VISIBLE,
  CONSTRAINT `session_id`
    FOREIGN KEY (`session_id`)
    REFERENCES `cinema`.`sessions` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;

CREATE TABLE `cinema`.`tickets` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `session_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `session_id_idx` (`session_id` ASC) VISIBLE,
  CONSTRAINT `tickets_session_id`
    FOREIGN KEY (`session_id`)
    REFERENCES `cinema`.`sessions` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin;

INSERT INTO `cinema`.`films` (`name`, `duration`) VALUES ('FILM1', '60');
INSERT INTO `cinema`.`films` (`name`, `duration`) VALUES ('FILM2', '90');
INSERT INTO `cinema`.`films` (`name`, `duration`) VALUES ('FILM3', '120');
INSERT INTO `cinema`.`films` (`name`, `duration`) VALUES ('FILM4', '60');
INSERT INTO `cinema`.`films` (`name`, `duration`) VALUES ('FILM5', '90');

INSERT INTO `cinema`.`sessions` (`film_id`, `start_time`, `date`) VALUES ('1', '10:00:00', '2021-07-25');
INSERT INTO `cinema`.`sessions` (`film_id`, `start_time`, `date`) VALUES ('2', '10:00:00', '2021-07-25');
INSERT INTO `cinema`.`sessions` (`film_id`, `start_time`, `date`) VALUES ('3', '12:00:00', '2021-07-25');
INSERT INTO `cinema`.`sessions` (`film_id`, `start_time`, `date`) VALUES ('4', '14:00:00', '2021-07-25');
INSERT INTO `cinema`.`sessions` (`film_id`, `start_time`, `date`) VALUES ('5', '16:00:00', '2021-07-25');

INSERT INTO `cinema`.`prices` (`session_id`, `price`) VALUES ('1', '150');
INSERT INTO `cinema`.`prices` (`session_id`, `price`) VALUES ('2', '150');
INSERT INTO `cinema`.`prices` (`session_id`, `price`) VALUES ('3', '300');
INSERT INTO `cinema`.`prices` (`session_id`, `price`) VALUES ('4', '400');
INSERT INTO `cinema`.`prices` (`session_id`, `price`) VALUES ('5', '500');

INSERT INTO `cinema`.`tickets` (`session_id`) VALUES ('1');
INSERT INTO `cinema`.`tickets` (`session_id`) VALUES ('1');
INSERT INTO `cinema`.`tickets` (`session_id`) VALUES ('1');
INSERT INTO `cinema`.`tickets` (`session_id`) VALUES ('2');
INSERT INTO `cinema`.`tickets` (`session_id`) VALUES ('2');
INSERT INTO `cinema`.`tickets` (`session_id`) VALUES ('3');
INSERT INTO `cinema`.`tickets` (`session_id`) VALUES ('4');
INSERT INTO `cinema`.`tickets` (`session_id`) VALUES ('5');
