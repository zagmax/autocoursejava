package ht12;

public class RegexTask {
    public boolean matchStringToRegex(String text, String regex) {
        return (text.matches(regex));
    }

    public boolean isStringEmail(String email) {
        return email.matches("[A-Za-z0-9_]+@[A-Za-z0-9]+\\.[A-Za-z0-9]{1,4}");
    }
    public boolean isStringIPAddress(String IP) {
        return (IP.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
    }
    public boolean isStringBankCardNumber(String number) {
        return (number.matches("\\d{16}"));
    }
}
