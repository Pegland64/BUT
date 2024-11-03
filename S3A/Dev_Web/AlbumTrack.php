<?php
class AlbumTrack extends AudioTrack{

    private string $album;
    private int $npiste;

    public function __construct (string $titre, string $chemin, string $nalbum, int $npiste){
        parent::__construct($titre, $chemin);
        $this->album = $nalbum;
        $this->npiste = $npiste;
        $this->setArtiste("Michael Jackson");
        $this->setDate("1982");
        $this->setGenre("Pop");
        $this->setDuree("358");
    }
}