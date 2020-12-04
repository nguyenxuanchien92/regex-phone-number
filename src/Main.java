public class Main {
    public static void main(String[] args) {
        String[] list = {"(84)-(0978489648)", "(a8)-(22222222)"};

        ValidatePhone validatePhone = new ValidatePhone();
        for (String e : list) {
            System.out.println("phone number: " + e + "is valid: " + validatePhone.isValid(e));
        }
    }
}
