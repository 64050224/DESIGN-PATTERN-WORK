public class FileLH extends LogHandler{
    @Override
    public void handleError(String msg){
        System.out.println("<File-Log>: "+ msg);
        super.handleError(msg);
    }
    @Override
    public void handleDebug(String msg){
        System.out.println("<File-Log>: "+ msg);
        super.handleDebug(msg);
    }
}
