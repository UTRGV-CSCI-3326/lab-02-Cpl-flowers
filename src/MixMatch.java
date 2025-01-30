public class MixMatch {

    // main() method here
    public static void main(String[] args) {
        String word = "Hello";
        System.out.println(word + " String is a data type that stores a string of letter and words");
        
        char letter = 'A';
        System.out.println(letter + " <- Char can only hold single symbol available within the assci table");
        
        short digit = 3;
        System.out.println(digit + " short is a 2 byte data type and only hold numerical value");

        int number = 10;
        System.out.println(number + " int is a 4 byte data type and can only hold numerical value");

        long bigger_number = 154;
        System.out.println(bigger_number + " long is a 8 byte data type that can only hold a numerical value");

        float decimal = (float) 2.3;
        System.out.println(decimal + " float is a 4 byte data type that can hold 7 digits past the decimal point");

        double bigger_decimal = .5555;
        System.out.println(bigger_decimal + " double is an 8 byte data type that can hold 15 digits past the decimal point");

        boolean bool = true;
        System.out.println(bool + " bool holds true (1) or false (0) values");
    
        System.out.println(decimal + " " + bigger_decimal + " " + word);

        System.out.println(digit + " " + number + " " + bigger_number);

        System.out.println(word + " " + " is a string? " + " " + bool);
    
    
    }
}