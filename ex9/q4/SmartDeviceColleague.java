public abstract class SmartDeviceColleague {
    SmartHomeMediator shm;
    public void setMediator(SmartHomeMediator shm){
        this.shm = shm;
    }public void removeMediator(){
        this.shm = null;
    }
    public abstract void doTask();
}