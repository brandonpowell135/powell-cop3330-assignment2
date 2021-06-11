package assignment2.ex25.base;

public class PasswordChecker {
    public int passwordStrength(String input) {
         int result=0;

        if (input.length() >= 8) {
            if (input.matches("(?=.*[0-9]).*")
                    && input.matches("(?=.*[a-zA-Z]).*")
                    && input.matches("(?=.*[!-*]).*")) {
                result = 4;

            } else if (input.matches("(?=.*[0-9]).*")
                    && input.matches("(?=.*[a-zA-Z]).*")
                    && !input.matches("(?=.*[!-*]).*")) {
                result = 3;
            } else
                result = 0;

        } else if (input.length() < 8) {
            if (input.matches("(?=.*[a-zA-Z]).*")
                    && !input.matches("(?=.*[0-9]).*")
                    && !input.matches("(?=.*[!-*]).*")) {
                result = 2;

            } else if (!input.matches("(?=.*[a-zA-Z]).*")
                    && input.matches("(?=.*[0-9]).*")
                    && !input.matches("(?=.*[!-*]).*")) {
                result = 1;
            } else
                result = 0;

        }
        return result;
    }
}

