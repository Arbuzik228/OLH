package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean as=true;
        boolean boo=true;
        System.out.println(""+ !(as||boo) + (!as&&!boo) );
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        int hoop=666666665;
        while (hoop<666666666) {
            System.out.println("cat eat chicken");
            hoop++;
        }
        for (int tgh=0;tgh<hoop;tgh+=666666666){
            System.out.println(tgh);
        }
        int food=666666665;
        int fod=666666666;
        do  {
            System.out.println("/////////////////////////////");
            food++;
        }while (food<=fod);
        int[] minecraaaaft = {1,2,3,4,5,6,7,8,9};
        for (int minecraaaaaft : minecraaaaft)
        {
            System.out.println(++minecraaaaaft);
        }
        short[] tooot = {1,2,3,4,5,6,7,8,9,10};
        for (short hooot : tooot)
        {
            System.out.println(--hooot);
        }
        {
            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////драсте
        }
        int[] dvoyka = {1,2,3,4,5,6,7,8,9,10,11,12};
        int troyka = 0;
        for (int num : dvoyka) {
            troyka = num + troyka;
        }
        double youtube = ((double) troyka / dvoyka.length);
        System.out.println(youtube);
        List          <Integer>            numbers          =                 new
                ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
        numbers.forEach(s  -> System.out.println(s + " "));
        int i, j;

        StringBuffer mInfoTextView =new StringBuffer();

        for (i = 1; i <= 10; i++) {
            for (j = 0; j < i ; j++) {
                mInfoTextView.append(i);
            }
            mInfoTextView.append("\n");
        }
        System.out.println(mInfoTextView);
    }
}