public class App {
    public static void main(String[] args) {
        Reporter reporter = new Reporter();
        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();
        reporter.add(sub1);
        reporter.add(sub2);

        reporter.footBallReport();
    }
}
