package view;

import model.Role;
import model.RoleName;
import model.UserPrincipal;
import service.user_principal.UserPrincipalServiceIMPL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public Main() {
        Scanner sc = new Scanner(System.in);
        if (UserPrincipalServiceIMPL.userPrincipalList.size() == 0) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Show List Role");
            System.out.println("4. Show list Album");
            System.out.println("5. ");
            System.out.println("Enter a number: ");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    new RegisterView();
                    break;
                case 2:
                    new LoginView();
                    break;
                case 3:
                    new RoleView().showListRole();
                    break;
            }

            //new LoginView();
        }

//
        List<UserPrincipal> userPrincipalList = UserPrincipalServiceIMPL.userPrincipalList;
        boolean checkLogin = false;
        Set<Role> roleSet = userPrincipalList.get(0).getRoleSet();
        List<Role> roleList = new ArrayList<>(roleSet);
        //System.out.println("roleList ===== " + roleList);
        boolean checkAdmin = roleList.get(0).getName() == RoleName.ADMIN;

        System.out.println("=================== MY NAVBAR ==================");
        if (userPrincipalList.size() != 0) {
            checkLogin = true;
        } else {
            checkLogin = false;
        }
        if (!checkLogin) {
            System.out.println("1. Register");
            System.out.println("2. Login");
        } else {

            System.out.println("3. Show List Role");

            System.out.println("5. My Profile");

            System.out.println("6. Add Album");

            System.out.println("7. Show List Album");

            if (checkAdmin) {
                System.out.println("4. Show List User");
            }
        }


        int chooseMenu = sc.nextInt();
        switch (chooseMenu) {
            case 1:
                new RegisterView();
                break;
            case 2:
                new LoginView();
                break;
            case 3:
                new RoleView().showListRole();
                break;
            case 4:
                if (checkAdmin) {
                    new ListUserView();
                    break;
                } else {
                    System.out.println("You have not permission! ");
                    new Main();
                }

            case 5:
                new ProfileView();
                break;
            case 6:
                new AddAlbumView();
                break;
            case 7:
                new ListAlbum();
                break;
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
