import PowerCommand.AirconditionerPowerCommand;
import PowerCommand.LightPowerCommand;
import Receiver.Airconditioner;
import Receiver.Light;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Remote remote = new Remote();
        Light bedLight = new Light("Bed room");
        Light kitchenLight = new Light("Kitchen");
        Airconditioner bedAirconditioner = new Airconditioner("Bed room");

        remote.set(0, new LightPowerCommand(bedLight))
                .set(1, new LightPowerCommand(kitchenLight))
                .set(2, new AirconditionerPowerCommand(bedAirconditioner));

        System.out.println("slot 0, light Bed Room");
        testTheRemote(remote, 0);
        System.out.println("----------------------");
        System.out.println("slot 1, light Kitchen");
        testTheRemote(remote, 1);
        System.out.println("----------------------");
        System.out.println("slot 2, AC Bed Room");
        testTheRemote(remote, 2);
        System.out.println("----------------------");
        System.out.println("test one unavailable slot, slot 3");
        testTheRemote(remote, 3);
    }

    public static void testTheRemote(Remote remote, int slot){
        System.out.print("On button ");
        remote.onAt(slot);
        System.out.print("Off button ");
        remote.offAt(slot);
    }
}