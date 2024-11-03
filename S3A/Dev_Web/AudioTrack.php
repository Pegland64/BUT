<?php
require_once 'InvalidPropertyValueException.php';
require_once 'InvalidPropertyNameException.php';

class AudioTrack{
    protected string $titre;
    protected string $artiste;
    protected string $date;
    protected string $genre;
    protected string $duree;
    protected string $nomfichier;

    public function __construct(string $titre, string $nomfichier){
        $this->titre = $titre;
        $this->nomfichier = $nomfichier;
    }
    public function __toString(){
        return json_encode($this);
    }
    public function get( string $attrname) : mixed {
        if (property_exists($this, $attrname))
            return $this->$attrname;
        throw new InvalidPropertyNameException("$attrname: invalid property");
    }

    public function setArtiste(string $artiste) {
        $this->artiste = $artiste;
    }

    public function setDate(string $date) {
        $this->date = $date;
    }

    public function setGenre(string $genre) {
        $this->genre = $genre;
    }

    public function setDuree(string $duree) {
        if ($duree < 0) {
            throw new InvalidPropertyValueException("Duration cannot be negative");
        }
        $this->duree = $duree;
    }
};