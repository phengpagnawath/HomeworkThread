package com.dgb;

public class ThreadView {

    public ThreadView() {
        try {
            displayThread();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void displayThread() throws InterruptedException {
        DownloadThread downloadThread = new DownloadThread(Constants.DOWNLOAD);
        PrintOneByOne p1=new PrintOneByOne(Constants.HELLO_DGB);
        PrintOneByOne p2=new PrintOneByOne(Constants.STAR);
        PrintOneByOne p3=new PrintOneByOne(Constants.COMMITMENT);
        PrintOneByOne p4=new PrintOneByOne(Constants.LINE);
        p1.start();
        p1.join();
        p2.start();
        p2.join();
        p3.start();
        p3.join();
        p4.start();
        p4.join();
        downloadThread.start();
        downloadThread.join();
    }
}
