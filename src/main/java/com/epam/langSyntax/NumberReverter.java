package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int revertNum = (number % 10) * 100 + ((number / 10) % 10) * 10 + ((number / 100) % 10);
        System.out.println(revertNum);
    }
}
