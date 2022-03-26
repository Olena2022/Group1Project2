package com.syntax.Group1Project2;

public abstract class Marks {

    abstract double getPercentage();
}

class A extends Marks {
    double subject1Marks, subject2Marks, subject3Marks;

    public A(double subject1Marks, double subject2Marks, double subject3Marks) {
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
    }

    @Override
    double getPercentage() {
        double total = ((subject1Marks + subject2Marks + subject3Marks)/ 3);
        return total;
    }
}
class B extends Marks{
    double subject1Marks, subject2Marks, subject3Marks,subject4Marks;

    public B(double subject1Marks, double subject2Marks, double subject3Marks, double subject4Marks) {
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
        this.subject4Marks = subject4Marks;
    }

    @Override
    double getPercentage() {
        double total = ((subject1Marks + subject2Marks + subject3Marks +subject4Marks)/ 4);
        return total;
    }
}