public class Sprinkler extends SmartDeviceColleague{
    @Override
    public void doTask() {
        System.out.println("I am sprinkler,... doing my task");
        shm.taskEnd("Sprinkler");
    }
}