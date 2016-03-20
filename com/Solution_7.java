package com;

public class Solution_7 {

    //Gm...  There is an indirect recursion :)

    class A {
        private int aValue;
        private B bValue = null;

        public A() {
            aValue = 0;
            bValue = new B();
        }

        @Override
        public String toString() {
            return "A";
        }
    }

    class B {
        private int bValue;
        private A aInstance = null;

        public B() {
            bValue = 10;
            // aInstance = new A();
        }

        @Override
        public String toString() {
            return "B";
        }
    }

    public static void main(String[] args) {
        A obj = new Solution_7().new A();
        System.out.println(obj.toString());
    }
}
