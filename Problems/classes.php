<?php

    class Test {
        public $vari = 40;

        public function __construct() {
            echo "constructor\n";
            $this->vari = 10; // changes 40 to 10
        }

        public static function addNums($x, $y) {
            return $x + $y;
        }

        public function getVar() {
            return $this->vari;
        }

        public function hello($ext) {
            return "hello $this->vari $ext";
        }

    }

    $classTest = new Test();
    echo $classTest->getVar(); // 10

?>