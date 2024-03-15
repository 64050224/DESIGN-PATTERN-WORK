public class ErrorLH extends LogHandler{
    @Override
    public void handleError(String msg){
        System.out.println("<Error-Log>: "+ msg);
        super.handleError(msg);
    }
}
