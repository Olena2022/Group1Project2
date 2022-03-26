package com.syntax.Group1Project2;

    class MarksTester{
        public static void main(String[] args) {
            A a=new A(55,67,89);
            System.out.println("Student's 'A' grades average is "+a.getPercentage());

            B b=new B(98,98,77, 99);
            System.out.println("Student's 'B' grades average is "+b.getPercentage());

        }
    }

