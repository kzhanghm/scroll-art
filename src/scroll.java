
import java.util.Random;
public class scroll {
    
     static int width = getTerminalWidth() - 1;
     static int height = 30;
     static int snorlax_width = 35;
     static int snorlax_height = 25;

     static int heart_width = 21;
     static int heart_height = 15;
    static final int TOTORO_HEIGHT = 16;
    static final int TOTORO_WIDTH = 29;

    
    public static void main(String[] args) throws InterruptedException {
        
        char[][] canvas = printCanvas(); 
        char[][] heart = printHeartCanvas();

        int x = 0;
    
    while (true) {
        x++;
        if (x % 2 == 0) {
            canvas = printCanvas();
            
        } else {
            canvas = printHeartCanvas();
        }
        
        int snorlax_height = canvas.length;
        int snorlax_width = canvas[0].length;

        for (int i = 0; i < snorlax_height; i++) {
            for (int j = 0; j < snorlax_width; j++) {
                System.out.print(canvas[i][j] == '\0' ? ' ' : canvas[i][j]);
            }
            System.out.println();
            Thread.sleep(30);
        }
char[][] woodstock = getWoodstock();

        for (int y = 0; y < woodstock[0].length; y++) {
            for (int z = 0; z < woodstock.length; z++) {
                Thread.sleep(30);
                System.out.print(woodstock[z][y]);
            }
            System.out.println();
        }

        char[][] snoopy = getSnoopy();

        for(int y = 0; y < snoopy[0].length; y++) {
            for(int z = 0; z < snoopy[0].length; z++) {
                Thread.sleep(30);
                System.out.print(snoopy[z][y]);
            }
            System.out.println();
        }
        char[][]totoro = getTotoro();
        for (int y = 0; y < totoro.length; y++) {
            System.out.println(new String(totoro[y]));
        }
        Thread.sleep(30);
    }
        // for (int i = 0; i < heart_height; i++) {
        //     for (int j = 0; j < heart_width; j++) {
        //         System.out.print(heart[i][j] == '\0' ? ' ' : heart[i][j]);
        //     }
        //     System.out.println();
        //     Thread.sleep(30);
        // }
    }




     public static int getTerminalWidth() {
         return 100; 
     }

     
 
    static char [][] getTotoro() {
        char[][] img = new char[TOTORO_HEIGHT][TOTORO_WIDTH];
        for (int y = 0; y < TOTORO_HEIGHT; y++){
            for (int x = 0; x < TOTORO_WIDTH; x++) {
                img[y][x] = ' ';
            }
        }
        //individual character
        img[0][9]  ='/';
        img[0][10] = '\\';
        img[0][18] = '/';
        img[0][19] = '\\';
        img[1][8] = '/';
        img[1][9] = '|';
        img[1][10] = '|';
        img[1][11] = '\\';
        img[1][17] = '/';
        img[1][18] = '|';
        img[1][19] = '|';
        img[1][20] = '\\';
        img[2][8] = '.';
        img[2][9] = '.';
        img[2][10] = '-';
        img[2][11] = '-';
        img[2][12] = '-';
        img[2][13] = '-';
        img[2][14] = '-';
        img[2][15] = '-';
        img[2][16] = '-';
        img[2][17] = '-';
        img[2][18] = '-';
        img[2][19] = '.';
        img[2][20] = '.';
        img[3][6] = '.';
        img[3][7] = '\'';
        img[3][21] = '\'';
        img[3][22] = '.';
        img[4][6] = '/';
        img[4][8] = '(';
        img[4][9] = '*';
        img[4][10] = ')';
        img[4][14] = 'v';
        img[4][18] = '(';
        img[4][19] = '*';
        img[4][20] = ')';
        img[4][22] = '\\';
        img[4][25] = '.';
        img[4][26] = '-';
        img[4][27] = '-';
        img[4][28] = '.';
        img[5][6] = '|';
        img[5][11] = '\'';
        img[5][12] = '_';  
        img[5][13] = '_';
        img[5][14] = '_';
        img[5][15] = '_';
        img[5][16] = '_';  
        img[5][17] = '\'';
        img[5][22] = '|';
        img[5][24] = '/';
        img[5][28] = '|';
        img[6][7] = '\\';
        img[6][21] = '/';
        img[6][22] = '-';
        img[6][23] = '\'';
        img[6][27] = '.';
        img[6][28] = '\'';
        img[7][4] = '.';
        img[7][5] = '-';
        img[7][6] = '\'';
        img[7][8] = '\'';
        img[7][9] = '\'';
        img[7][10] = '-';
        img[7][11] = '.';
        img[7][12] = '.';
        img[7][13] = '-';
        img[7][14] = '-';
        img[7][15] = '-';
        img[7][16] = '.';
        img[7][17] = '.';
        img[7][18] = '-';
        img[7][19] = '\'';
        img[7][21] = '\'';
        img[7][26] = '/';
        img[8][3] = '/';
        img[8][9] = '.';
        img[8][10] = '\'';
        img[8][12] = '^';
        img[8][14] = '^';
        img[8][16] = '^';
        img[8][18] = '\'';
        img[8][19] = '.';
        img[8][24] = '.';
        img[8][25] = '\'';
        img[9][2] = '/';
        img[9][8] = '/';
        img[9][10] ='^';
        img[9][12] = '^';
        img[9][14] = '^';
        img[9][16] = '^';
        img[9][18] = '^';
        img[9][20] = '\\';
        img[9][23] = '/';
        img[10][2] = '|';
        img[10][5] = '|';
        img[10][7] = '|';
        img[10][21] = '|';
        img[10][23] = '|';
        img[11][2] = '\'';
        img[11][3] = '-';
        img[11][4] = '.';
        img[11][5] = '|';
        img[11][7] = '|';
        img[11][21] = '|';
        img[11][23] = '|';
        img[12][6] = '\\';
        img[12][8] = '\\';
        img[12][20] = '/';
        img[12][22] = '/';
        img[13][7] = '\\';
        img[13][9] = '\'';
        img[13][10] = '.';
        img[13][18] = '.';
        img[13][19] = '\'';
        img[13][21] = '/';
        img[14][8] = '\\';
        img[14][11] = '\'';
        img[14][12] = '\'';
        img[14][13] = '-';
        img[14][14] = '-';
        img[14][15] = '-';
        img[14][16] = '\'';
        img[14][17] = '\'';
        img[14][20] = '/';
        img[15][7] = '.';
        img[15][8] = '\'';
        img[15][9] = '_';
        img[15][10] = '_';
        img[15][11] = '_';
        img[15][12] = '_';
        img[15][13] = '/';
        img[15][14] = '-';
        img[15][15] = '\\';
        img[15][16] = '_';
        img[15][17] = '_';
        img[15][18] = '_';
        img[15][19] = '_';
        img[15][20] = '\'';
        img[15][21] = '.';
        img[15][25] = 'C';
        img[15][26] = 'K';
        return img;
    }


     static char[][] printHeartCanvas() {
        char heart [][] = new char[heart_height][heart_width];
         heart[0][4] = '_';
        heart[0][5] = '_';
        heart[0][6] = '_';
        heart[0][7] = '_';
        heart[0][13] = '_';
        heart[0][14] = '_';
        heart[0][15] = '_';
        heart[0][16] = '_';

        // upper curves
        heart[1][2] = '(';
        heart[1][8] = '\\';
        heart[1][12] = '/';
        heart[1][18] = ')';

        heart[2][1] = '(';
        heart[2][9] = '\\';
        heart[2][11] = '/';
        heart[2][19] = ')';

        // sides of heart
        heart[3][1] = '\\';
        heart[3][19] = '/';

        heart[4][2] = '\\';
        heart[4][18] = '/';

        heart[5][3] = '\\';
        heart[5][17] = '/';

        heart[6][4] = '\\';
        heart[6][16] = '/';

        heart[7][5] = '\\';
        heart[7][15] = '/';

        heart[8][6] = '\\';
        heart[8][14] = '/';

        heart[9][7] = '\\';
        heart[9][13] = '/';

        heart[10][8] = '\\';
        heart[10][12] = '/';

        heart[11][9] = '\\';
        heart[11][11] = '/';

        // bottom point
        heart[12][10] = 'v';

        //initials
        heart[12][12] = 'k';
        heart[12][13] = 'z';

        return heart;
     }
     static char[][] printCanvas() {
        char canvas [][] = new char[snorlax_height][snorlax_width];
        // ears
        canvas[0][5] = '/';
        canvas[0][6] = '\\';
        canvas[0][28] = '/';
        canvas[0][29] = '\\';

        canvas[1][4] = '/';
        canvas[1][7] = '\\';
        canvas[1][27] = '/';
        canvas[1][30] = '\\';

        canvas[2][3] = '|';
        canvas[2][8] = '\\';
        canvas[2][26] = '/';
        canvas[2][31] = '|';

        // top of head
        canvas[3][5] = '.';
        canvas[3][6] = '-';
        canvas[3][7] = '-';
        canvas[3][8] = '-';
        canvas[3][9] = '-';
        canvas[3][10] = '-';
        canvas[3][11] = '-';
        canvas[3][12] = '-';
        canvas[3][13] = '-';
        canvas[3][14] = '-';
        canvas[3][15] = '-';
        canvas[3][16] = '-';
        canvas[3][17] = '-';
        canvas[3][18] = '-';
        canvas[3][19] = '-';
        canvas[3][20] = '-';
        canvas[3][21] = '-';
        canvas[3][22] = '-';
        canvas[3][23] = '-';
        canvas[3][24] = '-';
        canvas[3][25] = '-';
        canvas[3][26] = '-';
        canvas[3][27] = '-';
        canvas[3][28] = '.';

        // sides of head
        canvas[4][3] = '(';
        canvas[4][29] = ')';
        canvas[5][2] = '|';
        canvas[5][30] = '|';

        // eyes
        canvas[5][10] = '-';
        canvas[5][11] = '-';
        canvas[5][23] = '-';
        canvas[5][24] = '-';

        // mouth and teeth
        canvas[6][14] = '^';
        canvas[6][20] = '^';
        canvas[7][14] = '\\';
        canvas[7][15] = '_';
        canvas[7][16] = '_';
        canvas[7][17] = '_';
        canvas[7][18] = '_';
        canvas[7][19] = '/';

        // bottom of head
        canvas[8][4] = '\\';
        canvas[8][5] = '_';
        canvas[8][6] = '_';
        canvas[8][7] = '_';
        canvas[8][8] = '_';
        canvas[8][9] = '_';
        canvas[8][10] = '_';
        canvas[8][11] = '_';
        canvas[8][12] = '_';
        canvas[8][13] = '_';
        canvas[8][14] = '_';
        canvas[8][15] = '_';
        canvas[8][16] = '_';
        canvas[8][17] = '_';
        canvas[8][18] = '_';
        canvas[8][19] = '_';
        canvas[8][20] = '_';
        canvas[8][21] = '_';
        canvas[8][22] = '_';
        canvas[8][23] = '_';
        canvas[8][24] = '_';
        canvas[8][25] = '_';
        canvas[8][26] = '_';
        canvas[8][27] = '_';
        canvas[8][28] = '/';

        // arms
        canvas[9][2] = '/';
        canvas[9][3] = '|';
        canvas[9][31] = '|';
        canvas[9][32] = '\\';

        canvas[10][1] = '/';
        canvas[10][3] = '|';
        canvas[10][31] = '|';
        canvas[10][33] = '\\';

        canvas[11][1] = '|';
        canvas[11][3] = '|';
        canvas[11][31] = '|';
        canvas[11][33] = '|';

        // belly
        canvas[12][5] = '(';
        canvas[12][29] = ')';

        canvas[13][4] = '|';
        canvas[13][30] = '|';

        canvas[14][4] = '|';
        canvas[14][30] = '|';

        canvas[15][5] = '\\';
        canvas[15][29] = '/';

        // body
        canvas[16][3] = '|';
        canvas[16][31] = '|';
        canvas[17][3] = '|';
        canvas[17][31] = '|';
        canvas[18][4] = '\\';
        canvas[18][30] = '/';

        // feet
        canvas[19][2] = '(';
        canvas[19][8] = ')';
        canvas[19][26] = '(';
        canvas[19][32] = ')';

        canvas[20][1] = '(';
        canvas[20][9] = ')';
        canvas[20][25] = '(';
        canvas[20][33] = ')';

        canvas[21][2] = '\\';
        canvas[21][8] = '/';
        canvas[21][26] = '\\';
        canvas[21][32] = '/';

        // claws
        canvas[22][3] = 'v';
        canvas[22][6] = 'v';
        canvas[22][28] = 'v';
        canvas[22][31] = 'v';

        // bottom
        canvas[20][10] = '-';
        canvas[20][11] = '-';
        canvas[20][12] = '-';
        canvas[20][13] = '-';
        canvas[20][14] = '-';
        canvas[20][15] = '-';
        canvas[20][16] = '-';
        canvas[20][17] = '-';
        canvas[20][18] = '-';
        canvas[20][19] = '-';
        canvas[20][20] = '-';
        canvas[20][21] = '-';
        canvas[20][22] = '-';
        canvas[20][23] = '-';
        canvas[20][24] = '-';
    
        //initials
        canvas[21][12] = 'k';
        canvas[21][13] = 'z';
        return canvas;
    }


    static char[][] getWoodstock() {
        char[][] arr = new char[10][10];

        for (int y = 0; y < arr[0].length; y++) {
            for (int x = 0; x < arr.length; x++) {
                arr[x][y] = ' ';
            }
        }

        arr[2][2] = '_';
        arr[3][2] = '(';
        arr[4][2] = '\\';
        arr[5][2] = '(';
        arr[6][2] = '_';
        arr[2][3] = '<';
        arr[5][3] = '\'';
        arr[6][3] = '_';
        arr[7][3] = ')';
        arr[3][4] = ')';
        arr[5][4] = '(';
        arr[2][5] = '<';
        arr[3][5] = '/';
        arr[6][5] = ')';
        arr[4][6] = '√';
        arr[5][6] = '√';
        arr[7][7] = 'S';
        arr[8][7] = 'C';


        return arr;
    }
    static char[][] getSnoopy() {
        char[][] arr = new char[17][17];

        for(int y = 0; y < arr[0].length; y++) {
            for(int x = 0; x < arr.length; x++) {
                arr[x][y] = ' ';
            }
        }
        arr[4][1] = '_';
        arr[5][1] = '_';
        arr[6][1] = '_';
        arr[7][1] = '_';
        arr[8][1] = '_';
        arr[3][2] = '/';
        arr[4][2] = '\\';
        arr[7][2] = '@';
        arr[8][2] = '@';
        arr[9][2] = '\\';
        arr[10][2] = '_';
        arr[11][2] = '_';
        arr[12][2] = '_';
        arr[2][3] = '/';
        arr[3][3] = '#';
        arr[4][3] = '#';
        arr[5][3] = '\\';
        arr[12][3] = '•';
        arr[13][3] = '\\';
        arr[2][4] = '|';
        arr[3][4] = '#';
        arr[4][4] = '#';
        arr[5][4] = '|';
        arr[10][4] = '_';
        arr[11][4] = '_';
        arr[12][4] = '_';
        arr[13][4] = '|';
        arr[2][5] = '\\';
        arr[3][5] = '#';
        arr[4][5] = '#';
        arr[5][5] = '/';
        arr[6][5] = '\\';
        arr[7][5] = '_';
        arr[8][5] = '_';
        arr[9][5] = '_';
        arr[10][5] = '_';
        arr[11][5] = '_';
        arr[12][5] = '_';
        arr[13][5] = '/';
        arr[5][6] = '|';
        arr[8][6] = '|';
        arr[1][7] = '\\';
        arr[2][7] = '\\';
        arr[3][7] = '\\';
        arr[5][7] = '|';
        arr[6][7] = '|';
        arr[7][7] = '|';
        arr[9][7] = '\\';
        arr[3][8] = '\\';
        arr[4][8] = '\\';
        arr[5][8] = '|';
        arr[6][8] = 'π';
        arr[7][8] = 'π';
        arr[9][8] = '|';
        arr[5][9] = '\\';
        arr[6][9] = '_';
        arr[7][9] = '_';
        arr[8][9] = '_';
        arr[9][9] = '/';
        arr[6][10] = '|';
        arr[7][10] = '|';
        arr[12][12] = 'S';
        arr[13][12] = 'C';



        return arr;
    }
}

