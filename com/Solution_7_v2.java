package com;

public class Solution_7 {

    //Gm...  There is an indirect recursion :)

    class A {
        private int aValue;
        private B bValue;

        public A() {
            aValue = 0;
            bValue = new B(this);
        }

        @Override
        public String toString() {
            return "A";
        }
    }

    class B {
        private int bValue;
        private A aInstance;

        public B(A newInstanceA) {
            this.bValue = 10;
            this.aInstance = newInstanceA;
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
