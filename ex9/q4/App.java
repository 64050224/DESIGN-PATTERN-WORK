public class App {
    public static void main(String[] args) {
        Sprinkler sprinkler = new Sprinkler();
        CoffeePot coffeePot = new CoffeePot();
        Alarm alarm = new Alarm();
        SmartHomeMediator shm = new SmartHomeMediator();
        shm.addDevice(sprinkler);
        shm.addDevice(coffeePot);
        shm.setAlarm(alarm);

        alarm.doAlarm();
    }
}
