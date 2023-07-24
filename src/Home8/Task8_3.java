package Home8;

public class Task8_3 {
    public static void main(String[] args) {
        Converter converter = new Converter("MyConverter");

        int intValue = converter.convertToInt(65);
        double doubleValue = converter.convertToDouble(8.43);
        String stringValue = converter.convertToString(true);

        System.out.println("Converter name: " + converter.getConverterName());
        System.out.println("int value: " + intValue);
        System.out.println("double value: " + doubleValue);
        System.out.println("string value: " + stringValue);
    }

}
