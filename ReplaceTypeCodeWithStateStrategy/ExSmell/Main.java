public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        player.play();

        player.setMedia(Media.VIDEO);
        player.play();
        player.stop();

        player.setMedia(Media.MUSIC);
        player.loop();
        player.stop();

        player.setMedia(Media.NULL);
    }
}
