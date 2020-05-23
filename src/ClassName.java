import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static final String CLASS_NAME="^[CAP]\\d{4}[G-M]$";
    private static Pattern pattern;
    private Matcher matcher;
    public ClassName(){
        pattern=Pattern.compile(CLASS_NAME);
    }
    public boolean validClassName(String regex){
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }
}