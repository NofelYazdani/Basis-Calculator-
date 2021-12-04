package Controller;

import Entity.ExpressionException;
import UseCase.*;
import UseCase.Accounts.UserHistory;
import UseCase.Accounts.UserLogIn;
import UseCase.Accounts.UserSignUp;

import java.io.IOException;

public class CalculatorController {

    private int choice;

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public void handleUser() throws IOException, ClassNotFoundException, ExpressionException {
        if (choice == 1){
            UserLogIn login = new UserLogIn();
            login.logIn();
        }
        else if (choice == 2){
            UserSignUp signup = new UserSignUp();
            signup.signUp();
        }
        else if(choice - 2 == 1){
            BuildExpression expr = new BuildExpression();
            StringBuilder expression = expr.makeExpression();
            InputProcessor process = new InputProcessor(expression.toString());
            System.out.println(process.processInput().compute());
        }
        else if (choice - 5 == 0){
            ComputeMatrix matrix = new ComputeMatrix();
            matrix.computeMatrix();
        }
    }

    public void handleUserHistory(){
        UserHistory history = new UserHistory();
    }
}
