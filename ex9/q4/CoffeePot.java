public class CoffeePot extends SmartDeviceColleague{
    @Override
    public void doTask() {
        System.out.println("I am coffee pot,... doing my task");
        shm.taskEnd("Coffee pot");
    }
}
