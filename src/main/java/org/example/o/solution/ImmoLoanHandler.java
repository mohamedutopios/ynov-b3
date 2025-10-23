package org.example.o.solution;

public class ImmoLoanHandler implements LoanHandler{

    private Validator validator;

    public ImmoLoanHandler(Validator validator) {
        this.validator = validator;
    }

    @Override
    public void approveloan(User user) {
        if(validator.isValid(user)){
            System.out.println("Immo loan approved");
        }
    }
}
