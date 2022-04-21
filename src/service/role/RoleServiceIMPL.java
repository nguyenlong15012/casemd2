package service.role;

import config.ConfigReadAndWriteFile;
import model.Role;
import model.RoleName;
import java.util.List;

public class RoleServiceIMPL implements IRoleService{
    public static String PATH_ROLE = ConfigReadAndWriteFile.PATH+"role.txt";
    public static List<Role> roleList = new ConfigReadAndWriteFile<Role>().readFromFile(PATH_ROLE);
    @Override
    public List<Role> findAll() {
        //K có điều kiện, mỗi lần add thêm sẽ có thêm nhiều role,VD: 123112
        //Fix cứng thì sẽ chỉ có 1 2 3 thôi!
        if (roleList.size()>=3){
            return roleList;
        }else {
            roleList.add(new Role(1, RoleName.USER));
            roleList.add(new Role(2,RoleName.PM));
            roleList.add(new Role(3,RoleName.ADMIN));
        }
        //Ghi ra
        new ConfigReadAndWriteFile<Role>().writeToFile(PATH_ROLE, roleList);
        return roleList;
    }

    @Override
    public void save(Role role) {
        roleList.add(role);
    }

    @Override
    public Role finByName(RoleName name) {
        for (int i = 0; i < roleList.size(); i++) {
            if (name == roleList.get(i).getName()){
                return roleList.get(i);
            }
        }
        return null;
    }
}
