<?php
require_once 'Renderer.php';
require_once 'AudioTrackRenderer.php';
require_once 'AudioTrack.php';
require_once 'AlbumTrack.php';
require_once 'AlbumTrackRenderer.php';
require_once 'PodcastTrack.php';
require_once 'PodcastTrackRenderer.php';
require_once 'InvalidPropertyNameException.php';
require_once 'InvalidPropertyValueException.php';

try {
    $t = new AlbumTrack("thriller", "thriller.flac", "thriller", 1);;
    $r = new AlbumTrackRenderer($t);
    print $r->render(2);

    $t = new PodcastTrack("thriller", "thriller.flac");;
    $r = new PodcastTrackRenderer($t);
    print $r->render(2);
}catch (InvalidPropertyNameException $e) {
    print "InvalidPropertyNameException: ".$e->getMessage()."\n";
}catch (InvalidPropertyValueException $e) {
    print "InvalidPropertyValueException: ".$e->getMessage()."\n";
}catch (Exception $e) {
    print "Exception: ".$e->getMessage()."\n";
}