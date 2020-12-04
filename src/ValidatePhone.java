import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    private static String REGEX_PHONE = "^[(]\\d{2}[)]-[(]0\\d{9}[)]$";
    private Pattern pattern;

    public ValidatePhone() {
        pattern = Pattern.compile(REGEX_PHONE);
    }

    public boolean isValid(String str) {
        boolean result;
        Matcher matcher = this.pattern.matcher(str);
        result = matcher.matches();
        return result;
    }

}
//(xx)-(0xxxxxxxxx)
//(84)-(0978489648)