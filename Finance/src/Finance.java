import java.util.ArrayList;

public class Finance {
    ArrayList<InterestCalc> list;

    public Finance() {
        list = new ArrayList<>();
    }

    public InterestCalc createList(String name,String number,int principal, int month, double rate){
        return new InterestCalc(name,number,principal,month,rate);
    }

    public void addList(InterestCalc newList){
        list.add(newList);
    }


}
