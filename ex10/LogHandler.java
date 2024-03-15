public class LogHandler{
    private LogHandler next;
    public LogHandler setNext(LogHandler next){
        this.next = next;
        return next;
    }
    public void handleError(String msg){
        if(next!=null){
            next.handleError(msg);
        }
    }
    public void handleDebug(String msg){
        if(next!=null){
            next.handleDebug(msg);
        }
    }
    public void handleInfo(String msg){
        if(next!=null){
            next.handleInfo(msg);
        }
    }
}