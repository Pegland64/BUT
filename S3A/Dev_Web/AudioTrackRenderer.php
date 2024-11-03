<?php
abstract class AudioTrackRenderer implements Renderer{
    protected AudioTrack $track;
    public function __construct(AudioTrack $track){
        $this->track = $track;
    }
    public function render(int $selector):string{
        switch($selector){
            case self::COMPACT:
                return $this->rendercompact();
            case self::LONG:
                return $this->renderlarge();
            default:
                return $this->rendercompact();
        }
    }

    protected abstract function rendercompact():string;
    protected abstract function renderlarge():string;
}