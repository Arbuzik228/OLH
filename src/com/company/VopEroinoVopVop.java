package com.company;

import java.util.Arrays;
import java.util.List;

public class VopEroinoVopVop {
    public void eroino(int a, int b) {
        if (a < b) {
            for (int otdayRukuTvar = a; otdayRukuTvar <= b; otdayRukuTvar++) {
                System.out.println(otdayRukuTvar);
            }
        } else {
            for (int otdayRukuGovnuk = a; otdayRukuGovnuk >= b; otdayRukuGovnuk--) {
                System.out.println(otdayRukuGovnuk);
            }
        }
    }

    public void morshynskaPlus(int n) {
        for (int gdeMoiNalogi = 1; gdeMoiNalogi <= n; gdeMoiNalogi++) System.out.println(gdeMoiNalogi);
    }

    public void nurutooo (int n) {

        if (n < 5)nurutooo(--n);
        System.out.println(n);

    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        numbers.forEach(number -> System.out.println(number));
        String[] seasons  = new String[4];
        seasons[0] = "Winter";
        seasons[1] = "Spring";
        seasons[2] = "Summer";
        seasons[3] = "Autumn";
        //System.out.println(seasons);
        System.out.println(Arrays.toString(seasons));
        int[] kakazya = new int  [8];
        kakazya [0] = 111;
        kakazya [1] = 222;
        kakazya [2] = 333;
        kakazya [3] = 444;
        kakazya [4] = 555;
        kakazya [5] = 666;
        kakazya [6] = 777;
        kakazya [7] = 888;
        System.out.println(Arrays.toString(kakazya));
        int [] kuku = {111,222,333,444,555,666,777,888};
        System.out.println(Arrays.toString(kuku));
       int length = kuku.length;
       System.out.println(length);
       int kukushka =kakazya [5];
       System.out.println(kukushka);
       System.out.println("блин муху съел >=0");
       int i=0;
        while ( i<= kakazya.length -1) {
        System.out.println(kakazya [i]);
        i++;
        }
        for (int o=0; o <= kakazya.length -1; o++ ) {
            if (kakazya[o] % 2 == 0)
                System.out.println(kakazya[o]);
        }
        for (int u:kakazya) {
         System.out.println(u);
        }
        int [] [] [] iceTea = new int [7] [7] [7];
        iceTea [5][0][0]=777;
        iceTea [2][2][4]=777;
        iceTea [6][6][6]=777;
        iceTea [2][2][5]=777;
        iceTea [0][0][5]=777;
        iceTea [0][0][3]=777;
        iceTea [6][0][0]=777;
        iceTea [0][4][0]=777;
        iceTea [0][0][1]=777;
        iceTea [0][0][2]=777;
        System.out.println(Arrays.toString(iceTea));

        for (int itIsDjony=0;itIsDjony < iceTea.length;itIsDjony++) {
            for (int  kotik = 0; kotik < iceTea [itIsDjony].length;kotik++) {
                for (int youtube= 0; youtube < iceTea[itIsDjony][kotik].length ; youtube++) {
                   iceTea[itIsDjony][kotik][youtube] = 777;
                }
            }
        }
        for (int [] [] itIsDjony:iceTea) {
            for (int [] kotik: itIsDjony) {
                for (int youtube: kotik) {
                    System.out.println (youtube);
                }
            }
        }
    }
    }
