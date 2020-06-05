package com.dgb;

public class DownloadThread extends Thread {
    String name;

    public DownloadThread(String name) {
        this.name=name;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.print("\r" + name + i + "%");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("\rCompleted..!");
    }
}
