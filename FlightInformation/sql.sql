CREATE DATABASE hangban
USE hangban
CREATE TABLE flights(
id INT PRIMARY KEY AUTO_INCREMENT,
flightCode VARCHAR(20) NOT NULL,
flightDate DATETIME NOT NULL,
airline VARCHAR(50) NOT NULL,
`type` VARCHAR(50) NOT NULL,
takeoffAirportId INT NOT NULL,
landingAirportId INT NOT NULL,
takeoffTime DATETIME NOT NULL,
landingTime DATETIME NOT NULL,
flightTime VARCHAR(20) NOT NULL,
stopAirport VARCHAR(50),
referencePrice INT NOT NULL
)
SELECT f.flightCode,f.flightDate,f.airline,f.`type`,f.takeoffAirportId,f.landingAirportId,
f.takeoffTime,f.landingTime,f.flightTime,f.stopAirport,f.referencePrice 
FROM flights f WHERE f.flightDate='2018-01-20',airports a WHERE f.takeoffAirportId=a.id
INSERT INTO flights(flightCode,flightDate,airline,`type`,takeoffAirportId,landingAirportId,takeoffTime,landingTime,flightTime,stopAirport,referencePrice)
VALUE('WHJ666','2018-1-20','亚洲航空','空客330（宽体机）',1,2,'2018-1-20 14:30','2018-1-20 16:55','2小时25分','无经停',950)
CREATE TABLE airports(
id INT PRIMARY KEY AUTO_INCREMENT,
airportName VARCHAR(50) NOT NULL,
cityName VARCHAR(50) NOT NULL
)
INSERT INTO airports(airportName,cityName)VALUE('咸阳机场','西安省'),('吉隆坡国际机场','马来西亚'),('首都机场','北京')
CREATE TABLE flight_ticket(
id INT PRIMARY KEY AUTO_INCREMENT,
flightId INT NOT NULL,
ticketPrice INT NOT NULL,
sellCompany VARCHAR(15) NOT NULL
)
INSERT INTO flight_ticket(flightId,ticketPrice,sellCompany)VALUE(1,1209,'亚洲航空官网'),(1,1224,'祥和航空代购'),(1,1520,'中提代购'),(2,2000,'马来西亚代购'),(2,1820,'中提代购'),(2,19000,'马来西亚航空官网'),(3,500,'咸阳机场官网'),(3,800,'亚洲代购')