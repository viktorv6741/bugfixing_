package com;

public class Solution_7 {

    class A {
        private int aValue;
        private B bValue;

        public A() {
            aValue = 0;
            bValue = new B(666);
        }

        @Override
        public String toString() {
            return "A";
        }
    }

    class B {
        private int bValue;
        private A aInstance;

        public B() {
            this.bValue = 10;
            aInstance = new A();
        }

        public B(int bValue) {
            this.bValue = bValue;
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
