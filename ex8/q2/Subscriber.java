public class Subscriber implements MyObserver{
    private String currentReport;

    @Override
    public void update(Source s) {
        currentReport = ((Reporter)s).getLastScore();
        System.out.println("live result: "+currentReport);
    }
}
