package assignment2.ex27.base;

public class Validation {
    public String firstNameValidation(String firstName){
        if (firstName.length()<2) {
            return "The first name must be at least 2 characters long.";
        }
        else if (firstName.length()==0) {
            return "The first name must be filled in.";
        }
        else
            return "";
    }

}
