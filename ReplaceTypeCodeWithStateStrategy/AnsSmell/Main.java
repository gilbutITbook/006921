public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        player.play();

        player.setMedia(new Video());
        player.play();
        player.stop();

        player.setMedia(new Music());
        player.loop();
        player.stop();

        player.setMedia(null);
    }
}
