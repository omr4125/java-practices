package com.example.passbyreference;

import java.util.Date;

public class Period {

    private Date start;
    private Date end;

    /*
        Referans olarak gelen degiskene bagli farkli referanslar olabilir.
        Bu durum istenmeyen degisikliklere sebep olabilir.
        Pass.by-reference ile gelen degiskenleri new veya clone ile sarmalayarak bu tehlikeden uzaklasabiliriz
     */
    public Period(Date start, Date end) {
        if (start.compareTo(end) > 0)
            throw new IllegalArgumentException(start + " after " + end);
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
    }

    @Override
    public String toString() {
        return "Period{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    public static void main(String[] args) {

        Date start = new Date();
        Date end = new Date();
        Period period = new Period(start, end);
        System.out.println(period);
    }
}
