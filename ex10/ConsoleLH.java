public class ConsoleLH extends LogHandler{
    @Override
    public void handleError(String msg){
        System.out.println("<Console-Log>: "+ msg);
        super.handleError(msg);
    }
    @Override
    public void handleDebug(String msg){
        System.out.println("<Console-Log>: "+ msg);
        super.handleDebug(msg);
    }
    @Override
    public void handleInfo(String msg){
        System.out.println("<Console-Log>: "+ msg);
        super.handleInfo(msg);
    }
}
