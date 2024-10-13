package ass;

public class Board {

public int gen;
public int size = 3;
public char[][] board;

    // Constructor
    public Board(int size, int gen){
        this.size = size;
        this.gen = gen;
        this.board = new char[size][size];
    }

    // method to turn ' ' to '*'
    public void appear(int x, int y){
        this.board[x][y] = '*';
    }
    // method to turn '*' to ' '
    public void vanish(int x, int y){
        this.board[x][y] = ' ';
    }

    // method to print board
    public void printBoard(){
        for(int x=0; x < this.size; x++){
            System.out.println();
            for(int y=0; y < this.size; y++){
                System.out.printf("%c", this.board[x][y]);
            }
        }
        setGen(this.gen++);
    }



    // G+S
    public int getGen() {return gen;}
    public void setGen(int gen) {this.gen = gen;}

    public int getSize() {return size;}
    public void setSize(int size) {this.size = size;}
}
