public class MusicPlayer extends Player {
    @Override public void play() {
        System.out.println("Music: play");
        // 음악 재생 코드...
    }
    @Override public void loop() {
        System.out.println("Music: loop");
        // 음악 반복 재생 코드...
    }
    @Override public void stop() {
        System.out.println("Music: stop");
        // 음악 정지 코드...
    }
}
