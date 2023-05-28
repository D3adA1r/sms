import java.util.LinkedList;

public class BTSLogicLeft {
    protected int liczbaDone;
    protected int liczbaWait;
    String SMSCNumber;
    String recipientNumber;
    String message;
    protected VBDLogic vbdLogic;
        protected int numberBTS;

    protected LinkedList<VBDLogic> sms;
    public BTSLogicLeft() {
        numberBTS=1;
        sms=new LinkedList<>();

    }
    public void codeVBD(VBDLogic vbdLogic){
        this.vbdLogic=vbdLogic;
        message= vbdLogic.message;


    }
}
