class Journal extends Izdanie {
    private int jSt;
    public Journal(String izName,int jSt) {
        super(izName,null);
        this.jSt= jSt;
    }

    public void setjSt(int jSt) {
        this.jSt = jSt;
    }

    public int getjSt() {
        return jSt;
    }

    @Override
    String print() {
        String text = ("Издание:" +  getIzName() +"\nКоличество статей: " + getjSt()+"\n");

        return text;
    }
}
