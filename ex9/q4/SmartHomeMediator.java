import java.util.ArrayList;

public class SmartHomeMediator {
    private ArrayList<SmartDeviceColleague> deviceList;
    private Alarm alarm;
    public SmartHomeMediator(){
        deviceList = new ArrayList<SmartDeviceColleague>();
        alarm = new Alarm();
    }
    public void alarmAll(){
        for (SmartDeviceColleague device : deviceList) {
            device.doTask();
        }
    }
    public void taskEnd(String from){
        alarm.endAlarm(from);
    }

    public void addDevice(SmartDeviceColleague smc){
        deviceList.add(smc);
        smc.setMediator(this);
    }public void removeDevice(SmartDeviceColleague smc){
        deviceList.remove(smc);
        smc.removeMediator();
    }
    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
        alarm.setMediator(this);
    }
}
