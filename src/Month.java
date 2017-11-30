public class Month {
    private int month;

    /**
     * Constructs a new Month object
     * @param month the number of the month
     */
    public Month(int month) {
        this.month = month;
    }

    /**
     * Checks which month is chosen, and returns the appropriate length
     * @return the month's length
     */
    public int getLength(){
        int length;
        if (this.month == 1 ||
                this.month == 3 ||
                this.month == 5 ||
                this.month == 7 ||
                this.month == 8 ||
                this.month == 10 ||
                this.month == 12){
            length = 31;
        }else if(this.month == 4 ||
                this.month == 6 ||
                this.month == 9 ||
                this.month == 11){
            length = 30;
        }else{
            length = 28;
        }
        return length;
    }
}
