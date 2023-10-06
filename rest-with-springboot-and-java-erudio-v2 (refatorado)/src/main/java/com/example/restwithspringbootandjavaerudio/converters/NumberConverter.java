package com.example.restwithspringbootandjavaerudio.converters;

public class NumberConverter {

    //conversão para double

public static Double convertToDouble(String strNumber) {
    
    if(strNumber == null) return 0D;

    String number = strNumber.replaceAll(",", ".");

    if(isNumeric(number)) return Double.parseDouble(number);

    return 0D;

}
    

    //verificar se é numero


   public static boolean isNumeric(String strNumber) {
        if (strNumber == null)
            return false;
        String number = strNumber.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
    
}
