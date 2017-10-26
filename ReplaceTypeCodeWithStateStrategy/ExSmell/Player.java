class Media {
    public static final Media NULL = new Media();
    public static final Media VIDEO = new Media();
    public static final Media MUSIC = new Media();
}

class Player {
    private Media _media = Media.NULL;
    public void play() {
        if (_media == Media.VIDEO) {
            System.out.println("Video: play");
            // 비디오 재생 코드...
        } else if (_media == Media.MUSIC) {
            System.out.println("Music: play");
            // 음악 재생 코드...
        } else if (_media == Media.NULL) {
            System.out.println("Null: play");
        } else {
            assert false;
        }
    }
    public void loop() {
        if (_media == Media.VIDEO) {
            System.out.println("Video: loop");
            // 비디오 반복 재생 코드...
        } else if (_media == Media.MUSIC) {
            System.out.println("Music: loop");
            // 음악 반복 재생 코드...
        } else if (_media == Media.NULL) {
            System.out.println("Null: loop");
        } else {
            assert false;
        }
    }
    public void stop() {
        if (_media == Media.VIDEO) {
            System.out.println("Video: stop");
            // 비디오 정지 코드...
        } else if (_media == Media.MUSIC) {
            System.out.println("Music: stop");
            // 음악 정지 코드...
        } else if (_media == Media.NULL) {
            System.out.println("Null: stop");
        } else {
            assert false;
        }
    }
    public void setMedia(Media media) {
        if (media == null) {
            _media = Media.NULL;
        } else {
            _media = media;
        }
    }
}
