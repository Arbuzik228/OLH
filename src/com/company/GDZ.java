package com.company;

class GDZ {

    public static void main(String args[]) {
        GDZ hoop = new GDZ();
//         hoop.god("              ","_____________");
//         System.out.println(args);
//     }
//     public static void god (String o,String l) {
        StringBuffer good = new StringBuffer();
//         for (int r = 1; r <= 1; r++) {
//             good.append(o);
//             good.append(l);
//             good.append("\n");
        good.append("            _____________");
        good.append("\n");
        good.append("          /               \\");
        good.append("\n");
        good.append("         /     |     |     \\");
        good.append("\n");
        kek (good);
        good.append("         \\    \\_______/     /");
        good.append("\n");
        good.append("          \\________________/");

//         }
        System.out.println(good);
    }

    public static StringBuffer kek(StringBuffer good) {
        for (int u = 0; u < 3; u++) {
            good.append("        |                   |");
            good.append("\n");
        }
        return good;
    }
}