package view;

import service.user.UserServiceIMPL;

import java.util.Scanner;

public class ListUserView {
    Scanner sc = new Scanner(System.in);
    public ListUserView(){
        System.out.println(UserServiceIMPL.userList);
        System.out.println("Enter quit to back MENU: ");
        String backMenu = sc.nextLine();
        if (backMenu.equals("quit")){
            new Main();
        }
    }
}
