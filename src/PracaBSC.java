import java.util.LinkedList;

public class PracaBSC  {
    LinkedList<BSCVisual> bscVisualLinkedList;

    public PracaBSC() {
        bscVisualLinkedList =new LinkedList<>();
    }

    public BSCVisual create(){
        BSCLogic bscLogic=new BSCLogic();
        BSCVisual bscVisual=new BSCVisual(bscLogic);
        bscVisualLinkedList.add(bscVisual);
        return bscVisual;
    }

}
