package com.practice.multiThreading;

public class DeadLockThread {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread t1 = new Thread(new Task1(pen, paper), "task1");
        Thread t2 = new Thread(new Task2(pen, paper), "task2");

        t1.start();
        t2.start();
    }

}

class Pen {
    public synchronized void usePenToWriteOnPaper(Paper paper) {
        System.out.println(Thread.currentThread().getName() + "trying to get Paper");
        paper.finishedWritingUsingPaper();
    }

    public synchronized void finishedWritingUsingPen() {
        System.out.println("Pen Executed Successfully");
    }
}

class Paper {
    public synchronized void usePenToWriteOnPaper(Pen pen) {
        System.out.println(Thread.currentThread().getName() + "trying to get Pen");
        pen.finishedWritingUsingPen();
    }

    public synchronized void finishedWritingUsingPaper() {
        System.out.println("Paper Executed Successfully");
    }
}

class Task1 implements Runnable {
    private Pen pen;
    private Paper paper;

    public Task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        synchronized (paper) { // this synchronized marks consitency to prevent deadlock
            pen.usePenToWriteOnPaper(paper);
        }
    }
}

class Task2 implements Runnable {
    private Pen pen;
    private Paper paper;

    public Task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        paper.usePenToWriteOnPaper(pen);
    }
}