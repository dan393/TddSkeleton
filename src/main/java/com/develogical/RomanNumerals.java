package com.develogical;


import java.security.AlgorithmConstraints;
import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

    public String convertNumeralToString(int i){

        //break into digits (level and digit) e.g. [1, 1], [2, 5], etc.
        //convert each digit to symbols e.g. [1, alpha], [2, beta], etc.
        //convert actual roman numerals for right level, [1, I], [2, L] etc.
        int level=1;
        String result = "";
     while (i>0) {
         result += convertToSymbol(i%10, level++);
         i = i/10;
     }
     return result;
    }


    private String convertToSymbol(int i, int level){
        String numeral = "";
        String BETA = "BETA";
        String ALPHA = "ALPHA";
        String GAMMA = "GAMMA";
        switch(i) {
            case 0:
                break;
            case 1:
                numeral += ALPHA;
                break;
            case 2:
                numeral += ALPHA + ALPHA;
                break;
            case 3:
                numeral += ALPHA + ALPHA + ALPHA;
                break;
            case 4:
                numeral += ALPHA + BETA;
                break;
            case 5:
                numeral += BETA;
                break;
            case 6:
                numeral += BETA + ALPHA;
                break;
            case 7:
                numeral += BETA + ALPHA + ALPHA;
                break;
            case 8:
                numeral += BETA + ALPHA + ALPHA + ALPHA;
                break;
            case 9:
                numeral += ALPHA + GAMMA;
                break;
        }
        return convertLevel(numeral, level);
    }

    private String convertLevel(String numeral, int level) {


                switch (level) {
                    case 1:
                        numeral = numeral.replace("ALPHA", "I");
                        numeral = numeral.replace("BETA", "V");
                        numeral =  numeral.replace("GAMMA", "X");
                        break;
                    case 2:
                        numeral =  numeral.replace(".ALPHA", "X");
                        numeral =  numeral.replace(".BETA", "L");
                        numeral =  numeral.replace("GAMMA", "C");
                        break;
                    case 3:
                        numeral =  numeral.replace("ALPHA", "C");
                        numeral = numeral.replace("BETA", "D");
                        numeral = numeral.replace("GAMMA", "M");
                        break;
                    case 4:
                        numeral = numeral.replace("ALPHA", "M");
                        numeral = numeral.replace("BETA", "Z");
                        numeral = numeral.replace("GAMMA", "Z");
                        break;
                }

            return numeral;
        }
    }


//    public String covertNumeralToString1(int i) {
//        String numeral = "";
//        if (i<=3) {
//            for (int x = 0; x < i; x++) {
//                numeral += "I";
//            }
//        } else if (i == 5) {
//            return "V";
//        } else if (i == 4){
//            return "IV";
//        }
//        return numeral;
//    }
//
//    public String covertNumeralToString(int i){
//
//        if (romanSymbols.containsKey(i)) {
//            return romanSymbols.get(i);
//        }
//        int diffUp =0;
//        int diffDown = 0;
//        while (true) {
//            diffUp++;
//            diffDown++;
//            if (romanSymbols.containsKey(i+diffUp)) {
//                return covertNumeralToString(diffUp) + romanSymbols.get(i+diffUp);
//            } else if (romanSymbols.containsKey(i- diffDown)) {
//                return romanSymbols.get(i-diffDown) + covertNumeralToString(diffDown);
//            }
//        }
////        return "Not available number";
//    }
//
//    static Map<Integer, String> level1 = new HashMap<>();
//
//    static {
//        level1.put(1, "I");
//        level1.put(2, "II");
//        level1.put(3, "III");
//        level1.put(5, "V");
//        level1.put(10, "X");
//    }

//    public String covertNumeralToString3(int i){
//        if(i>3000) return "Error";
//        String numeral = "";
//
//        String alpha = "M";
//        String beta = "Z";
//        String gamma = "Z";
//        int firstDigit = Math.floor(i,1000);
//        int remainder = i % 1000;
//        switch(firstDigit){
//            case 0:
//                break;
//            case 1:
//                numeral += alpha;
//                break;
//            case 2:
//                numeral += alpha + alpha;
//                break;
//            case 3:
//                numeral += alpha + alpha + alpha;
//                break;
//            case 4:
//                numeral += alpha + beta;
//                break;
//            case 5:
//                numeral += beta;
//                break;
//            case 6:
//                numeral += beta + alpha;
//                break;
//            case 7:
//                numeral += beta + alpha + alpha;
//                break;
//            case 8:
//                numeral += beta + alpha + alpha;
//                break;
//            case 9:
//                numeral += alpha + gamma;
//                break;
//        }
//
//
//    }






