public class Printer {
    public int numberOfSheets;
    public int tonerVolume;
    public Printer(int numberOfSheets, int tonerVolume){
        this.numberOfSheets = numberOfSheets;
        this.tonerVolume = tonerVolume;
    }

    public int getNumberOfSheets(){
        return this.numberOfSheets;
    }

    public void print(int numCopies, int numPages){
        if (this.numberOfSheets >= (numCopies * numPages) && (this.tonerVolume >= numPages)){
            this.numberOfSheets = this.numberOfSheets - (numCopies * numPages);
            this.tonerVolume = this.tonerVolume - (numCopies * numPages);
        }
    }
}
