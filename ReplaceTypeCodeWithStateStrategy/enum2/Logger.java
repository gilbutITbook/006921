public class Logger {
    private State _state;
    public Logger() {
        setState(State.STATE_STOPPED);
    }
    public void setState(State state) {
        _state = state;
    }
    public void start() {
        _state.start();
        setState(State.STATE_LOGGING);
    }
    public void stop() {
        _state.stop();
        setState(State.STATE_STOPPED);
    }
    public void log(String info) {
        _state.log(info);
    }
}
