package ass;

import java.io.*;

public class Main {
    
    public static void main(String[] args) {
        // read from console
        Console cons = System.console();
        String source = cons.readLine();
        File gol = new File(source);
        
        ?? FileReader.ReadFile(gol);

        // iterate through board
        for (int idy=0; idy < size; idy++){
            for (int idx=0; idx < size; idx++){

                // check outcome of star
                if (board[idx][idy] == '*'){
                    
                    int starCounter = 0;
                    // count stars in surrounding squares
                    for (int sqy=0; sqy < (sqy+1); sqy++){
                        for (int sqx=0; sqx < (sqx+1); sqx++){
                            if (board[sqx][sqy] == '*'){
                                starCounter++;
                            }
                        }
                    if (starCounter <= 1 || starCounter >= 4){   
                        // star dies
                        vanish;
                    }
                   }
                   // check outcome of space
                } else if (board[idx][idy] == ' '){
                    int starCounter = 0;
                    // count stars in surrounding squares
                    for (int sqy=0; sqy < (sqy+1); sqy++){
                        for (int sqx=0; sqx < (sqx+1); sqx++){
                            if (board[sqx][sqy] == '*'){
                                starCounter++;
                            }
                        }
                    if (starCounter >= 3){
                        appear;
                    }
                }
            }
        }
    }

}
