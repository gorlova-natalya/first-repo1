package Java.lesson17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpService {

    public boolean isIpValid(String ip) {
        Pattern pattern = Pattern.compile("^(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)" +
                "\\.(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)" +
                "\\.(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)" +
                "\\.(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$");
        Matcher matcher = pattern.matcher(ip);
        return matcher.find();
    }
}
