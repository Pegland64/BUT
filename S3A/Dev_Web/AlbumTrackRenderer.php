<?php
class AlbumTrackRenderer extends AudioTrackRenderer{
    protected function rendercompact():string{
        return "<div class='track'>
                    <p>Title: " . htmlspecialchars($this->track->get("titre")) . "</p>
                    <audio controls src='" . htmlspecialchars($this->track->get("nomfichier")) . "' type='audio/mpeg'>
                    </audio>
                </div>";
    }

    protected function renderlarge():string{
        return "<div class='track'>
                    <p>Title: " . htmlspecialchars($this->track->get("titre")) . "</p>
                    <p>Artist: " . htmlspecialchars($this->track->get("artiste")) . "</p>
                    <p>Album: " . htmlspecialchars($this->track->get("album")) . "</p>
                    <p>Year: " . htmlspecialchars($this->track->get("date")) . "</p>
                    <p>Track number: " . htmlspecialchars($this->track->get("npiste")) . "</p>
                    <p>Genre: " . htmlspecialchars($this->track->get("genre")) . "</p>
                    <p>Duration: " . htmlspecialchars($this->track->get("duree")) . "</p>
                    <p>Filename: " . htmlspecialchars($this->track->get("nomfichier")) . "</p>
                    <audio controls src='" . htmlspecialchars($this->track->get("nomfichier")) . "' type='audio/mpeg'>
                    </audio>
                </div>";
    }
}