public class Alarm {
    SmartHomeMediator shm;
    public void doAlarm() {
        System.out.println("Alarm is sending event to all...");
        shm.alarmAll();
    }
    public void endAlarm(String from) {
        System.out.println("Alarm event ended from " + from);
    }
    
    public void setMediator(SmartHomeMediator shm){
        this.shm = shm;
    }public void removeMediator(){
        this.shm = null;
    }
}