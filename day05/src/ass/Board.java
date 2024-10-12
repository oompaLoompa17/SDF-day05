package ass;

public class Board {

public int gen;
public int size = 3;
public char[][] board;

    // Constructor
    public Board(int size, int gen){
        this.size = size;
        this.gen = gen;
        this.board[][] = new char[size][size];
    }

    // method to turn ' ' to '*'
    public void appear(){
        this.board[][] = '*';
    }
    // method to turn '*' to ' '
    public void vanish(){
        this.board[][] = ' ';
    }

    // method to print board
    public void printBoard(){
        
        setGen(this.gen++);
    }

    // G+S
    public int getGen() {return gen;}
    public void setGen(int gen) {this.gen = gen;}

    public int getSize() {return size;}
    public void setSize(int size) {this.size = size;}
}
