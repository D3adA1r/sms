

public class VBDLogic {
    protected String message;
    protected boolean status;
    protected int bandwidth;
    protected int number;
    protected int counter;

    public VBDLogic(String message) {
        this.message = message;
        this.status = true;
        this.bandwidth = 0;
        this.number = 021;
    }

    public int getNumber() {
        return number;
    }

    public int getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }
    public void setNumber(){
        number=(int)(Math.random()*1000);
    }
    public String toStringNumber(){
        setNumber();
        return String.valueOf(number) ;
    }

    public void stop() {
        status = false;
    }
}