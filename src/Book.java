class Book extends Izdanie{
    private String avtorName;

    public Book(String izName, String avtorName ) {
        super(izName,null);
        this.avtorName=avtorName;
    }

    public String getAvtorName() {
        return avtorName;
    }



    @Override
    String print() {
        String text = ("Издание:" +  getIzName() +"\nАвтор: " + getAvtorName()+"\n");

        return text;
    }
}