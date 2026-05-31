package com.tejas;

    public class NitroValidator {

        public static int findInvalidChar(String nitroCode) {

            for (int i = 0; i < nitroCode.length(); i++) {

                char currentChar = nitroCode.charAt(i);

                if (currentChar == 'o' || currentChar == 'O') {
                    return i;
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            String badCode1 = "aB3o9XQ";
            String badCode2 = "XYZ89O2";
            String goodCode = "aB309XQ";

            System.out.println("Checking badCode1... Violation at index: " + findInvalidChar(badCode1));
            System.out.println("Checking badCode2... Violation at index: " + findInvalidChar(badCode2));
            System.out.println("Checking goodCode... Violation at index: " + findInvalidChar(goodCode));
        }
    }

