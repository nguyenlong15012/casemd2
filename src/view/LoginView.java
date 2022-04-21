package view;

import controller.UserController;
import dto.SignInDTO;
import service.user.UserServiceIMPL;

import java.util.Scanner;

public class LoginView {
    Scanner sc = new Scanner(System.in);
    UserController userController = new UserController();
    public LoginView(){
        System.out.println("LOGIN FORM");
        System.out.println("Enter your user name: ");
        String username = sc.nextLine();
        System.out.println("Enter your password: ");
        String password = sc.nextLine();
        SignInDTO signInDTO = new SignInDTO(username, password);
        if (userController.login(signInDTO)){
            new ProfileView();
        }else {
            System.err.println("Login failed! Please check username or password! ");
            new LoginView();
        }
    }
}
