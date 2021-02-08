public class Printer {
    private int numberOfSheets;
    public Printer(int numberOfSheets){
        this.numberOfSheets = numberOfSheets;
    }

    public int getNumberOfSheets(){
        return this.numberOfSheets;
    }

    public int print(int numCopies, int numPages){
        if (this.numberOfSheets >= (numPages * numCopies)){
            this.numberOfSheets = this.numberOfSheets - (numPages * numCopies);
            return this.numberOfSheets;
        } else {
            return this.numberOfSheets;
        }
    }
}
