package view;

import controller.RoleController;

import java.util.Scanner;

public class RoleView {
    Scanner sc = new Scanner(System.in);
    RoleController roleController = new RoleController();
    public void showListRole(){
        System.out.println(roleController.showListRole());
        System.out.println("Enter quit back to Menu: ");
        String backMenu = sc.nextLine();
        if (backMenu.equalsIgnoreCase("quit")){
            new Main();
        }
    }
}
