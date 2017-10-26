public class Player {
    public static final int MUSIC = 0;
    public static final int VIDEO = 1;
    private final int _type;
    public Player(int type) {
        if (type != MUSIC && type != VIDEO) {
            throw new IllegalArgumentException("type = " + type);
        }
        _type = type;
    }
    public void play() {
        switch (_type) {
        case MUSIC:
            System.out.println("Music: play");
            // 음악 재생 코드...
            break;
        case VIDEO:
            System.out.println("Video: play");
            // 비디오 재생 코드...
            break;
        default:
            assert false;
        }
    }
    public void loop() {
        switch (_type) {
        case MUSIC:
            System.out.println("Music: loop");
            // 음악 반복 재생 코드...
            break;
        case VIDEO:
            System.out.println("Video: loop");
            // 비디오 반복 재생 코드...
            break;
        default:
            assert false;
        }
    }
    public void stop() {
        switch (_type) {
        case MUSIC:
            System.out.println("Music: stop");
            // 음악 정지 코드...
            break;
        case VIDEO:
            System.out.println("Video: stop");
            // 비디오 정지 코드...
            break;
        default:
            assert false;
        }
    }
}
