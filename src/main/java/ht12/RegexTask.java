package ht12;

public class RegexTask {
    public boolean matchStringToRegex(String text, String regex) {
        return (text.matches(regex));
    }

    public boolean isStringEmail(String email) {
        return email.matches("[A-Za-z0-9_]{1,10}@[A-Za-z0-9]{1,10}/.[A-Za-z0-9]{1,4}");
    }

    public boolean isStringIPAddress(String IP) {
        return (IP.matches("[0-9]{1,3}/.[0-9]{1,3}/.[0-9]{1,3}/.[0-9]{1,3}"));
    }

    public boolean isStringBankCardNumber(String number) {
        return (number.matches("[0-9]{16}"));
    }
}
