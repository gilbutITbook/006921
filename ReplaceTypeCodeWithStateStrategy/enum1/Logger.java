public class Logger {
    private State _state;
    public Logger() {
        setState(State.STATE_STOPPED);
    }
    public State getState() {
        return _state;
    }
    public void setState(State state) {
        _state = state;
    }
    public void start() {
        switch (getState()) {
        case STATE_STOPPED:
            System.out.println("** START LOGGING **");
            setState(State.STATE_LOGGING);
            break;
        case STATE_LOGGING:
            /* 아무것도 하지 않음 */
            break;
        default:
            System.out.println("Invalid state: " + getState());
        }
    }
    public void stop() {
        switch (getState()) {
        case STATE_STOPPED:
            /* 아무것도 하지 않음 */
            break;
        case STATE_LOGGING:
            System.out.println("** STOP LOGGING **");
            setState(State.STATE_STOPPED);
            break;
        default:
            System.out.println("Invalid state: " + getState());
        }
    }
    public void log(String info) {
        switch (getState()) {
        case STATE_STOPPED:
            System.out.println("Ignoring: " + info);
            break;
        case STATE_LOGGING:
            System.out.println("Logging: " + info);
            break;
        default:
            System.out.println("Invalid state: " + getState());
        }
    }
}
