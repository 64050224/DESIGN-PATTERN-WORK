public class App {
    public static void main(String[] args) {
        LogHandler loggingSystem = new LogHandler();
        ConsoleLH console = new ConsoleLH();
        FileLH file = new FileLH();
        ErrorLH error = new ErrorLH();

        loggingSystem.setNext(error).setNext(file).setNext(console);

        loggingSystem.handleInfo("new Info add");
        System.out.println("=-=-=-=-=-=-=");
        loggingSystem.handleDebug("new Debug");
        System.out.println("=-=-=-=-=-=-=");
        loggingSystem.handleError("new Error found");

    }
}
