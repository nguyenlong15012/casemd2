package controller;

import model.Role;
import service.role.RoleServiceIMPL;

import java.util.List;

public class RoleController {
    RoleServiceIMPL roleServiceIMPL = new RoleServiceIMPL();

    public List<Role> showListRole() {
        return roleServiceIMPL.findAll();
    }
}
