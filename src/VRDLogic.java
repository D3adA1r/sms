public class VRDLogic {
    protected int number;

    public VRDLogic() {
    }

    public void setNumber(){
        number=(int)(Math.random()*100000);
    }
    public String toStringNumber(){
        setNumber();
        return String.valueOf(number) ;
    }
}
