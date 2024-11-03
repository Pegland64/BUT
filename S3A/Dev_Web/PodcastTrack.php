<?php
class PodcastTrack extends AudioTrack{
    public function __construct(string $titre, string $nomfichier){
        parent::__construct($titre, $nomfichier);
        $this->setArtiste("Michael Jackson");
        $this->setDate("1982");
        $this->setGenre("Pop");
        $this->setDuree("358");
    }
}