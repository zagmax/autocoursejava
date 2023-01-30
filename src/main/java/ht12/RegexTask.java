package ht12;

public class RegexTask {
    public boolean matchStringToRegex(String text, String regex){
        return (text.matches(regex));
    }
    public boolean isStringEmail(String email){
        return matchStringToRegex(email,"/abc/"));
    }
    public boolean isStringIPAddress(String IP){
        return (IP.matches("/abc/"));
    }
    public boolean isStringBankCardNumber(String number){
        return (number.matches("/abc/"));
    }
}
