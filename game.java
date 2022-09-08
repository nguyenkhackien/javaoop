import java.util.Scanner;

public class game {
    public void play(board b, cellstatus cs,cell c){
        Scanner scanner=new Scanner(System.in);
        cellstatus.status playerturn= cellstatus.status.x;
        int count=1;
        while(count<=9 ) {
            int x;
            int y;
            System.out.println(playerturn + " turn");
            System.out.println("nhap toa do x y");
            x = scanner.nextInt();
            y = scanner.nextInt();
            while (x < 1 || x > 3 || y < 1 || y > 3 || !cs.checkstatus(x, y, b)) {
                System.out.println("loi du lieu! moi nhap lai.");
                x = scanner.nextInt();
                y = scanner.nextInt();
            }
            b.board1[x - 1][y - 1] = playerturn;
            b.printboard();
            if (c.checkwin(b)){
                System.out.println(playerturn + " win");
                break;
            }
            if(count==9){
                System.out.println("draw");
            }
            if(playerturn == cellstatus.status.o)
                playerturn= cellstatus.status.x;
            else
                playerturn = cellstatus.status.o;
            count+=1;
        }
    }

    public static void main(String[] args){
        game  game1 =new game();
        board b=new board();
        cellstatus cs=new cellstatus();
        cell c = new cell();
        cellstatus.status[][] k=new cellstatus.status[3][3];
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                k[i][j]=cellstatus.status.empty;
        b.setboard(k);
        game1.play(b,cs,c);
    }
}
