package com.ruppyrup.scope;

public class ScopeTest {
    public static int x = 13;

    public int giveX() {
        int x = 6;
        return x + ScopeTest.x;
    }

    public class ST2 {
        public int x = 14;

        public int giveInnerX() {
            int x = 7;
            return x + this.x + ScopeTest.x;
        }
    }
}


