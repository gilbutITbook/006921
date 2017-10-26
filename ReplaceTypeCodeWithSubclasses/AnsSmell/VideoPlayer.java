public class VideoPlayer extends Player {
    @Override public void play() {
        System.out.println("Video: play");
        // 비디오 재생 코드...
    }
    @Override public void loop() {
        System.out.println("Video: loop");
        // 비디오 반복 재생 코드...
    }
    @Override public void stop() {
        System.out.println("Video: stop");
        // 비디오 정지 코드...
    }
}
