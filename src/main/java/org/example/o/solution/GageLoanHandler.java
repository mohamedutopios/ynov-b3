package org.example.o.solution;

public class GageLoanHandler implements LoanHandler{

    private Validator validator;

    public GageLoanHandler(Validator validator) {
        this.validator = validator;
    }

    @Override
    public void approveloan(User user) {
        if(validator.isValid(user)){
            System.out.println("Gage loan approved");
        }
    }
}
