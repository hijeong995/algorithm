package org.example;

public class Quiz11_Puff {
    public static void puff(int n, int a, int b, int cnt){

        String tab = "";
        for(int i = 0; i < cnt; i++){
            tab += "    ";
        }
        if(n  <= 0) {
            System.out.printf("%s %d : %d %d %d%n", tab, cnt, n, a, b);
            return;
        }else{
            System.out.printf("%s %d : %d %d %d%n", tab, cnt, n, a, b);
        }
        cnt++;

        puff(n - 3, a, b + n, cnt);
        puff(n - 1, b, a + n, cnt);
        puff(n - 2, b, a + n, cnt);
    }
}
