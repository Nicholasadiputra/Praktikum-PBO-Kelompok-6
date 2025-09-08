public class WrapperDanKonversi {
    public static void main(String[] args) {
        // Autoboxing dan Unboxing
        int primitifInt = 100;
        Integer wrapperInt = primitifInt; // Autoboxing
        int anotherPrimitif = wrapperInt; // Unboxing
        System.out.println("Hasil Unboxing: " + anotherPrimitif);

        // Konversi String ke wrapper/primitif
        String strNumber = "123";
        String strDouble = "45.67";
        
        int num = Integer.parseInt(strNumber);
        double decimal = Double.parseDouble(strDouble);
        System.out.println("Parsed int: " + num);
        System.out.println("Parsed double: " + decimal);
        
        Integer wrapperNum = Integer.valueOf(strNumber);
        Double wrapperDecimal = Double.valueOf(strDouble);
        System.out.println("Wrapper Integer: " + wrapperNum);
        System.out.println("Wrapper Double: " + wrapperDecimal);

        // Konversi wrapper/primitif ke String
        int value = 789;
        String strValue1 = Integer.toString(value);
        String strValue2 = String.valueOf(value);
        System.out.println("toString(): " + strValue1);
        System.out.println("valueOf(): " + strValue2);
    }
}
