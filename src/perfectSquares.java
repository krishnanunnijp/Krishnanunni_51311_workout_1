public class perfectSquares {
    private int START, END;
    private int smallStart = 0,smallEnd=0;
    private String result;
    perfectSquares(int START,int END){
        this.START = START;
        this.END = END;
        findStart();
        findEnd();
        Process();
    }

    private void findStart() {
        int i;
        for ( i = 0; this.smallStart  < this.START; i++) {
            this.smallStart = i * i;
        }
        this.smallStart = i-1;
    }
    private void findEnd() {
        int i;
        for ( i = 0; this.smallEnd  <= this.END; i++) {
            this.smallEnd = i * i;
        }
        this.smallEnd = i-2;
    }
    public void Process(){
        this.result="";
        for (int i=this.smallStart; i <= this.smallEnd; i++) {
            this.result=this.result+i*i+" ";

        }
    }
    public String getResult(){
        return result;
    }
}
