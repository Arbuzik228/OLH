package com.company;

public class GDZ {
    public String lol (int kek){
        int lolkekcheburek =1;

        StringBuffer mInfoTextView =new StringBuffer();

        for ( int i = 1; i <= kek; i++) {
            for ( int j = 0; j < i ; j++) {
                if (lolkekcheburek == kek + 1) {
                    break;
                }
                mInfoTextView.append(" " + lolkekcheburek++);
            }
            if (lolkekcheburek==kek+1) {
                break;
            }
            mInfoTextView.append("\n");
        }
       return mInfoTextView.toString();
    }
    public static void main(String args[]){
        GDZ youTube = new GDZ();
        String lolker=youTube.lol(21);
        System.out.println(lolker);
    }
}
