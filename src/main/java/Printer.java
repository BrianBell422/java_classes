public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper(){
        return paper;
    }

    public int getToner(){
        return toner;
    }

    public boolean printDocument(int pages, int copies){
        int usage = pages * copies;
        if (this.paper >= usage && this.toner >= usage){
            this.paper -= usage;
            this.toner -= usage;
            return true;
        } else {
            return false;
        }
    }

}
