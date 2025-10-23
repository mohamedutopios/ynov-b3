package org.example.o.solution;

public class PersonalLoanHandler implements LoanHandler{

    private Validator validator;

    public PersonalLoanHandler(Validator validator) {
        this.validator = validator;
    }

    @Override
    public void approveloan(User user) {
        if(validator.isValid(user)){
            System.out.println("personnel loan approved ");
        }
    }
}
