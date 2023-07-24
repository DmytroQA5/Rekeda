package Home8;

public class Converter {
    /*Необходимо создать класс конвертер, который будет иметь методы конвертации примитивных типов данных:
метод convertToInt; (конвертирует byte, short, int, long, char, float, double, String).
При вводе boolean выводитсообщение, что введен тип boolean.

convertToDouble;    (конвертирует byte, short, int, long, char, float, double, String).
При вводе boolean выводит сообщение, что введен тип boolean.

converToString;     (конвертирует byte, short, int, long, char, boolean, float, double, String).

У данного класса должен быть только один конструктор, в параметрах которого можно указать его имя.
А также только один метод геттер для получения информации о названии данного конвертра.*/
        private String converterName;

        public Converter(String name) {
            converterName = name;
        }

        public String getConverterName() {
            return converterName;
        }

        public int convertToInt(Object value) {
            if (value instanceof Boolean) {
                System.out.println("Введен тип boolean.");
                return 0;
            } else if (value instanceof Byte || value instanceof Short ||
                    value instanceof Integer || value instanceof Long ||
                    value instanceof Character) {
                return Integer.parseInt(value.toString());
            } else if (value instanceof Float || value instanceof Double) {
                return (int) Double.parseDouble(value.toString());
            } else if (value instanceof String) {
                return Integer.parseInt((String) value);
            } else {
                throw new IllegalArgumentException("Неподдерживаемый тип данных.");
            }
        }

        public double convertToDouble(Object value) {
            if (value instanceof Boolean) {
                System.out.println("Введен тип boolean.");
                return 0.0;
            } else if (value instanceof Byte || value instanceof Short ||
                    value instanceof Integer || value instanceof Long ||
                    value instanceof Character || value instanceof Float ||
                    value instanceof Double) {
                return Double.parseDouble(value.toString());
            } else if (value instanceof String) {
                return Double.parseDouble((String) value);
            } else {
                throw new IllegalArgumentException("Неподдерживаемый тип данных.");
            }
        }

        public String convertToString(Object value) {
            return String.valueOf(value);
        }
    }


