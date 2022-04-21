package view;

import model.UserPrincipal;
import service.user_principal.UserPrincipalServiceIMPL;

import java.util.List;
import java.util.Scanner;

public class ProfileView {
    Scanner sc = new Scanner(System.in);
    List<UserPrincipal> userPrincipalList = UserPrincipalServiceIMPL.userPrincipalList;
    UserPrincipalServiceIMPL userPrincipalServiceIMPL = new UserPrincipalServiceIMPL();
    public ProfileView(){
        if (userPrincipalList.size()!=0){
            System.out.println("Welcome Profile: " + userPrincipalList.get(0).getName());
            System.out.println("1. Log Out");
        }else {
            System.out.println("Please Login!");

        }
        System.out.println("2. Register");
        System.out.println("3. Back Menu");

        int chooseProfile = sc.nextInt();
        switch (chooseProfile){
            case 1:
                logOut();
                new Main();
                break;
            case 2:
                new RegisterView();
            case 3:
                new Main();

        }
        String backMenu = sc.nextLine();
        if (backMenu.equalsIgnoreCase("quit")){
            new Main();
        }
    }

    public void logOut(){
        UserPrincipalServiceIMPL.userPrincipalList.clear();
        userPrincipalServiceIMPL.findAll();
    }
}
