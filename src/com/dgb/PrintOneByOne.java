package com.dgb;

public class PrintOneByOne extends Thread{
    String str;

    public PrintOneByOne(String str) {
        this.str=str;
    }

    @Override
    public void run() {
        String[] ch = str.split("");
        int i;
        for (i = 0; i <= ch.length - 1; i++) {
            System.out.print(ch[i]);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("");

    }
}
