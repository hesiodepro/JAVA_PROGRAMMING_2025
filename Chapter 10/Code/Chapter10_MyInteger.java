public class Chapter10_MyInteger {
    private int value;

    public Chapter10_MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        if (value < 2) return false;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        if (value < 2) return false;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(Chapter10_MyInteger obj) {
        return obj.isEven();
    }

    public static boolean isOdd(Chapter10_MyInteger obj) {
        return obj.isOdd();
    }

    public static boolean isPrime(Chapter10_MyInteger obj) {
        return obj.isPrime();
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(Chapter10_MyInteger obj) {
        return this.value == obj.value;
    }

    public static int parseInt(char[] chars) {
        return Integer.parseInt(new String(chars));
    }

    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        Chapter10_MyInteger num1 = new Chapter10_MyInteger(7);
        Chapter10_MyInteger num2 = new Chapter10_MyInteger(10);

        System.out.println("num1 is even: " + num1.isEven());
        System.out.println("num1 is odd: " + num1.isOdd());
        System.out.println("num1 is prime: " + num1.isPrime());

        System.out.println("num2 is even: " + Chapter10_MyInteger.isEven(num2));
        System.out.println("num2 is odd: " + Chapter10_MyInteger.isOdd(num2));
        System.out.println("num2 is prime: " + Chapter10_MyInteger.isPrime(num2));

        System.out.println("num1 equals 7: " + num1.equals(7));
        System.out.println("num1 equals num2: " + num1.equals(num2));

        char[] charArray = {'1', '2', '3'};
        System.out.println("Parsed int from char array: " + Chapter10_MyInteger.parseInt(charArray));
        System.out.println("Parsed int from string: " + Chapter10_MyInteger.parseInt("456"));
    }
}
