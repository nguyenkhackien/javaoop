public class cell {
    public boolean checkwin(board b){
        for(int i=0;i<3;i++){
            if(b.board1[i][0]==b.board1[i][1] && b.board1[i][1]==b.board1[i][2] && b.board1[i][0]!= cellstatus.status.empty)
                return true;
            if(b.board1[0][i]==b.board1[1][i] && b.board1[1][i]==b.board1[2][i] && b.board1[0][i]!= cellstatus.status.empty)
                return true;
        }
        if(b.board1[0][0]!= cellstatus.status.empty && b.board1[0][0]==b.board1[1][1] && b.board1[0][0]==b.board1[2][2])
            return true;
        if(b.board1[2][0]!= cellstatus.status.empty && b.board1[2][0]==b.board1[1][1] && b.board1[2][0]==b.board1[0][2])
            return true;
        return false;
    }
    public static void main(String[] args){

    }
}
