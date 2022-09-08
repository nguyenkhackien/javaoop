public class board {
    public cellstatus.status[][] board1;
    public void setboard(cellstatus.status[][] board ) {
        this.board1=board ;
    }

    public void printboard(){
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                if (this.board1[i][j] == cellstatus.status.empty)
                    System.out.print("-" + " ");
                else
                    System.out.print(this.board1[i][j].toString()+" ");
            }
            System.out.println("");
        }
    }
    public static void main (String[] args){

    }
}
