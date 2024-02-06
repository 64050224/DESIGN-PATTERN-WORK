import java.util.HashMap;

import PowerCommand.BlankPC;
import PowerCommand.PowerCommand;

public class Remote {
    private static int SIZE = 6;
    private HashMap<Integer, PowerCommand> buttons;
    Remote(){
        buttons = new HashMap<Integer, PowerCommand>();
        for (int i = 0; i < SIZE; i++) {
            buttons.put(i, new BlankPC());
        }
    }
    public Remote set(int slotNumber, PowerCommand command){
        buttons.put(slotNumber, command);
        return this;
    }
    public void onAt(int slotNumber){
        buttons.get(slotNumber).on();
    }public void offAt(int slotNumber){
        buttons.get(slotNumber).off();
    }
    public String nameAt(int slotNumber){
        return buttons.get(slotNumber).getRoomName();
    }
}
