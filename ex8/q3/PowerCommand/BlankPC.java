package PowerCommand;
public class BlankPC implements PowerCommand{

    @Override
    public void on() {
        System.out.println("No command is assigned to this slot");
    }

    @Override
    public void off() {
        // TODO Auto-generated method stub
        System.out.println("No command is assigned to this slot");
    }

    @Override
    public String getRoomName() {
        return "none";
    }
}
