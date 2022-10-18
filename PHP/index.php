<?php
// INSTANCES
require_once("Car.php");
require_once("UberX.php");
require_once("UberPool.php");
require_once("Account.php");

// OBJECT CREATIONS
$uberX = new UberX("CVB123", new Account("Andres Herrera", "AND456"), "Chevrolet", "Spark");
$uberX->printDataCar();     /* -> simbol is use to call a inheretence */

$uberPool = new UberPool("TYU567", new Account("Andrea Ferran", "ANDA765"), "Dodge", "Attitude");
$uberPool->printDataCar();
?>