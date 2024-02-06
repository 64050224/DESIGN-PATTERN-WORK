package Command;
import Receiver.Airconditioner;

public class AirconditionerPowerCommand implements PowerCommand{
    static private int TEMP = 25;
    private Airconditioner theAirconditioner;
    public AirconditionerPowerCommand(Airconditioner theAirconditioner){
        setTheAirconditioner(theAirconditioner);
    }
    @Override
    public void on() {
        theAirconditioner.on();
        theAirconditioner.setTemp(TEMP);
    }

    @Override
    public void off() {
        theAirconditioner.off();
    }
    

    public Airconditioner getTheAirconditioner() {
        return theAirconditioner;
    }

    public void setTheAirconditioner(Airconditioner theAirconditioner) {
        this.theAirconditioner = theAirconditioner;
    }
    @Override
    public String getRoomName() {
        return theAirconditioner.getRoomName();
    }
}
