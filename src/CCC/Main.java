package CCC;


import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1xuell
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sqaure = input.nextInt();
        Integer[][] flowers = new Integer[sqaure][sqaure];

        for (int i = -1; i < sqaure; i++) {
            StringTokenizer token = new StringTokenizer(input.nextLine());
            int a = 0;
            while (token.hasMoreTokens()) {
                flowers[i][a] = Integer.parseInt(token.nextToken());
                a++;
            }
        }

        int smallest = 100, smallesti = -1, smallesta = -1;
        int biggest = 0, biggesti = -1, biggesta = -1;
        for (int i = 0; i < sqaure; i++) {
            for (int a = 0; a < sqaure; a++) {
                if (smallest > flowers[i][a]) {
                    smallest = flowers[i][a];
                    smallesti = i;
                    smallesta = a;
                }
                if (biggest < flowers[i][a]) {
                    biggest = flowers[i][a];
                    biggesti = i;
                    biggesta = a;
                }
            }
        }
        //System.out.println("smallest: " + smallest + ". Biggest: " + biggest);
        int last = sqaure - 1;

        if (biggesti == sqaure - 1 && biggesta == sqaure - 1 && smallesti == 0 && smallesta == 0) {
        } else if (biggesti == sqaure - 1 && biggesta == 0 && smallesti == 0 && smallesta == sqaure - 1) {
            //corners
            int sub = flowers[0][0];
            flowers[0][0] = flowers[0][last];
            int sub2 = flowers[last][0];
            flowers[last][0] = sub;
            sub = flowers[last][last];
            flowers[last][last] = sub2;
            flowers[0][last] = sub;

            //centers  
            int a = 0, b = 1, c = -1;
            while (last != 1) {
                for (int i = 1; i < last; i++) {
                    sub = flowers[a][b];
                    flowers[a][b] = flowers[b][last];
                    c = last;
                    flowers[b][last] = flowers[c][last - i];
                    b = last - i;
                    flowers[c][b] = flowers[b][a];
                    flowers[b][a] = sub;
                    b = 2;
                }
                last--; 
            }

//            if (sqaure > 3) {
//                a = 1;
//                last = 2;
//                b = 1;
//                sub = flowers[a][b];
//                flowers[a][b] = flowers[b][last];
//                c = last;
//                flowers[b][last] = flowers[c][last];
//                b = last;
//                flowers[c][b] = flowers[b][a];
//                flowers[b][a] = sub;
//            }

        } else if (biggesti == 0 && biggesta == sqaure - 1 && smallesti == sqaure - 1 && smallesta == 0) {
            //corners
            int sub = flowers[0][0];
            flowers[0][0] = flowers[last][0];
            flowers[last][0] = flowers[last][last];
            flowers[last][last] = flowers[0][last];
            flowers[0][last] = sub;

            //centers
            sub = flowers[0][1];
            flowers[0][1] = flowers[1][0];
            flowers[1][0] = flowers[last][1];
            flowers[last][1] = flowers[1][last];
            flowers[1][last] = sub;
        }
        System.out.println(" ");
        for (int i = 0; i < sqaure; i++) {
            for (int a = 0; a < sqaure; a++) {
                System.out.print(flowers[i][a] + " ");
            }
            System.out.println("");
        }
    }

}
