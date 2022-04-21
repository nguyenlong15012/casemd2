package service.role;

import model.Role;
import model.RoleName;
import service.IServiceGeneric;

public interface IRoleService extends IServiceGeneric<Role> {
    Role finByName(RoleName name);
}
