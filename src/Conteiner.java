public class Conteiner {
private  Izdanie firstizd;
private Izdanie rearizd;
private int count;
public Conteiner(){
    firstizd = null;
    count=0;
}

    public Izdanie getFirstizd() {
        return firstizd;
    }
    public void add(Izdanie aIzdanide){
        Izdanie current = firstizd;
        if (current==null){
            firstizd =  aIzdanide;
            rearizd = aIzdanide;
        }else {
            rearizd.nextIzd = aIzdanide;
            rearizd= aIzdanide;

        }
        count++;

    }
    public Izdanie delete() {
        Izdanie t = firstizd;
        if (t != null) {
            firstizd = firstizd.nextIzd;
            count--;
        }
        return null;
    }

public Izdanie search(String name){
    Izdanie current = firstizd;

   for(int i = 0;i<=count;i++){
       if(current==null){
           break;
       }
       if (current.getIzName().equals(name)){
           System.out.println(current.print());
       }else{
           current = current.nextIzd;
       }

       current = current.nextIzd;
   }
    return null;
}
public  String getData(){
    Izdanie t = firstizd;
    String text12 = " ";
    while (t != null) {
        text12 = text12+ t.print() ;
        t = t.getNextIzd();
    }
    return text12;
}

}
