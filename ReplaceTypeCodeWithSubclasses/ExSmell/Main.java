public class Main {
    public static void main(String[] args) {
        Player[] players = {
            new Player(Player.MUSIC),
            new Player(Player.VIDEO),
        };

        for (Player player : players) {
            player.play();
            player.stop();
        }
    }
}
