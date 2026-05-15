package project1;

import java.util.regex.Pattern;

public class TextValidator {

    public static ValidationResult validate(String input) {

        if (input == null || input.trim().isEmpty()) {
            return new ValidationResult(false, "Input is empty");
        }

        // Email check
        if (Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", input)) {
            return new ValidationResult(true, "Valid e mail address path");
        }

        // Phone number check (Indian format example)
        if (Pattern.matches("^[6-9][0-9]{9}$", input)) {
            return new ValidationResult(true, "Valid Phone Number");
        }

        // Numeric check
        if (Pattern.matches("\\d+", input)) {
            return new ValidationResult(true, "Valid Numeric Data");
        }

        // Alphanumeric check
        if (Pattern.matches("^[a-zA-Z0-9 ]+$", input)) {
            return new ValidationResult(true, "Valid Alphanumeric Text");
        }

        return new ValidationResult(false, "Invalid Data Format");
    }
}
