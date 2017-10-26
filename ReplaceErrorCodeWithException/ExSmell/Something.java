public class Something {
    private String _errorMessage;
    public String getErrorMessage() {
        return _errorMessage;
    }
    public boolean method1() {
        // ...
        return true;
    }
    public boolean method2() {
        // ...
        return true;
    }
    public boolean method3() {
        // ...
        _errorMessage = "method3: file open error.";
        return false;
    }
    // ...
}
