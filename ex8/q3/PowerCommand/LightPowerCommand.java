package PowerCommand;
import Receiver.Light;

public class LightPowerCommand implements PowerCommand{
    private Light theLight;
    public LightPowerCommand(Light theLight){
        setTheLight(theLight);
    }
    @Override
    public void on() {
        theLight.on();
    }

    @Override
    public void off() {
        theLight.off();
    }

    
    public Light getTheLight() {
        return theLight;
    }

    public void setTheLight(Light theLight) {
        this.theLight = theLight;
    }
    @Override
    public String getRoomName() {
        return theLight.getRoomName();
    }
}
