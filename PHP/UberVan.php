<?php
require_once('Car.php');

class UberVan extends Car {
    public $typeCarAccepted;
    public $typeMaterial;

    public function __construct($license, $driver, $typeCarAccepted, $typeMaterial) {
        parent::__construct($license, $driver);
        $this->typeCarAccepted = $typeAccepted;
        $this->typeMaterial = $typeMaterial;
    }
}

?>