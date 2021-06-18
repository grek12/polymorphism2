abstract class Izdanie {
    private String izName;
    protected    Izdanie nextIzd;




    public Izdanie(String izName,Izdanie anext) {
        this.izName= izName;
        this.nextIzd = anext;

    }


    public Izdanie getNextIzd() {
        return nextIzd;
    }



    public String getIzName() {
        return izName;
    }



    abstract String print();
}
