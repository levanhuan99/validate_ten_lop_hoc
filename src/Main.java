public class Main {

    public static final String[] validString={"C0220i","A0444K"};
    public static final String[] invalidString={ "L33333)","O4534"};

    public static void main(String[] args) {
        ClassName className=new ClassName();
        for (int i=0;i<validString.length;i++){
            boolean isValid=className.validClassName(validString[i]);
            System.out.println(isValid);
        }
    }
}
