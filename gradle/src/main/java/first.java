
import org.apache.commons.lang3.StringUtils;
public class first
{


        public static void main(String[] args) {
            System.out.println("hello world");
           // SecondClass obj= new SecondClass();
           // obj.output();

            String input= StringUtils.deleteWhitespace("hey there you");
            System.out.println(input);
        }

}