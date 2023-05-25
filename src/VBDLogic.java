

public class VBDLogic {
    private String message;
    private boolean status;
    private int bandwidth;
    private int number;

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

    public void stop() {
        status = false;
    }
}