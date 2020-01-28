package security;

import java.util.ArrayList;

public class IDCardVisitor extends IDCard{
    public  IDCardVisitor() throws Exception {

        chip = new Chip();
        chip.cryptPassword(id);

        permissionList = new ArrayList<Permission>();

    }
    public void addPermission(Permission permission) {
        permissionList.add(permission);}
}
