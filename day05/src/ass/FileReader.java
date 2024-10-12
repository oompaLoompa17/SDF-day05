package ass;

import java.awt.Frame;
import java.io.*;
import java.text.ParseException;

import ass.Board;

public class FileReader {
    
    public void ReadFile(String file) throws FileNotFoundException, IOException{
        
       Reader reader = new FileReader(file);
       BufferedReader br = new BufferedReader(reader);

       char[][] grid;
       int size = 300;
       char[] starline;
       int xit;
       int yit;

       String line = "x";

       While (line != null){
        line = br.readLine();
        String[] text = line.split(" ");

        switch(text[0]){

            case "#":
            break;

            case "GRID":
            this.Board.setSize(Integer.parseInt(text[1]));
            grid = new char[size][size];
            break;

            case "START":
            xit = Integer.parseInt(text[1]);
            yit = Integer.parseInt(text[2]);
            break;

            case "DATA":
            while (line != null){

                // read subsequent line 
                line = br.readLine();
                // end of shape
                if (line == null){break;}
                // pass into char array
                char[] spaces_and_stars = line.toCharArray();
                
                for (int idy=0; idy < size; idy++){
                    for (int idx=0; idx < spaces_and_stars.length; idx++){
                        if (spaces_and_stars[idx] == '*'){
                            grid[idx][idy+yit] = '*';
                        }
                    }
                }
            }
            break;
        }
       }

       br.close();
       reader.close();
    }
}
