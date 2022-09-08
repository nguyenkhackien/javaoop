public class cellstatus {
    public enum status{
        x,o,empty
    }
    public boolean checkstatus(int x,int y,board b){
        if (b.board1[x-1][y-1]== cellstatus.status.empty)
            return true;
        return false;
    }
    public static void main(String[] args){

    }
}
