package com.company;

public class Main {

    /*
    Входной параметр - строка, начинающаяся и заканчивающася на подчеркивание,
    на выходе начинается и закагнчивается на букву
    Пример: _abc_ на выходе a_b_c, _abcd_ на выходе a_b_cd
      */

    public static void main(String[] args) {
        System.out.println(stringModifier("_abufc_________"));
        System.out.println(stringModifier("___abu__"));
        System.out.println(stringModifier("_abufcsggsf__"));
        System.out.println(stringModifier("_abu_"));
        System.out.println(stringModifier("_abudgdhshgsh_"));

    }

    public static String stringModifier(String inputString) {
        int length = inputString.length();
        char[] chars = inputString.toCharArray();
        int amount = 0;
        for (char c : chars) {
            if (c == '_') {
                amount++;
            }
        }
        String newString = inputString.replace("_", "");
        int newLength = newString.length();
        int extraSpaces = amount - newLength + 1;
        StringBuilder sb = new StringBuilder(newString);

        for (int i = 1; i < (length - 1); i += 2) {
            if (extraSpaces >= newLength - 1) {
                sb.insert(i, "_");
                extraSpaces--;
                i++;
            }
            if (extraSpaces > 0) {
                sb.insert(i, "_");
                extraSpaces--;
                i++;
            }
            if (amount > 0) {
                sb.insert(i, "_");
                amount--;
            }

        }
        return sb.toString();
    }

}
