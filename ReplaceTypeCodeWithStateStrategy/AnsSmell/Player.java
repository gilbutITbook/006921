abstract class Media {
    public abstract void play();
    public abstract void loop();
    public abstract void stop();
    public static final Media Null = new Media() {
        @Override public void play() {
            System.out.println("Null: play");
        }
        @Override public void loop() {
            System.out.println("Null: loop");
        }
        @Override public void stop() {
            System.out.println("Null: stop");
        }
    };
}

class Music extends Media {
    @Override public void play() {
        System.out.println("Music: play");
        // 음악 재생 코드
    }
    @Override public void loop() {
        System.out.println("Music: loop");
        // 음악 반복 재생 코드
    }
    @Override public void stop() {
        System.out.println("Music: stop");
        // 음악 정지 코드
    }
}

class Video extends Media {
    @Override public void play() {
        System.out.println("Video: play");
        // 비디오 재생 코드
    }
    @Override public void loop() {
        System.out.println("Video: loop");
        // 비디오 반복 재생 코드
    }
    @Override public void stop() {
        System.out.println("Video: stop");
        // 비디오 정지 코드
    }
}

class Player {
    private Media _media = Media.Null;
    public void play() {
        _media.play();
    }
    public void loop() {
        _media.loop();
    }
    public void stop() {
        _media.stop();
    }
    public void setMedia(Media media) {
        if (media == null) {
            _media = Media.Null;
        } else {
            _media = media;
        }
    }
}
