public class Main {
    public static void main(String[] args) {
        Player[] players = {
            Player.create(Player.MUSIC),
            Player.create(Player.VIDEO),
        };

        for (Player player : players) {
            player.play();
            player.stop();
        }
    }
}
