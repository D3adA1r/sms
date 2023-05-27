import java.util.LinkedList;

public class BTSLogicLeft {
    protected int liczbaDone;
    protected int liczbaWait;
    protected VBDLogic vbdLogic;
        protected int numberBTS;

    protected LinkedList<VBDLogic> sms;
    public BTSLogicLeft() {
        numberBTS=1;
        sms=new LinkedList<>();

    }
    public void getVBD(VBDLogic vbdLogic){
        this.vbdLogic=vbdLogic;
        sms.add(this.vbdLogic);
    }
    public void codeVBD(){

    }
}
