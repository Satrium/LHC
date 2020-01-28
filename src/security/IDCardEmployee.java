package security;

import java.util.ArrayList;

public class IDCardEmployee extends IDCard {
    protected IDCardEmployee() throws Exception {
        id ="HelloLRC2020";
        chip = new Chip();
        chip.cryptPassword(id);
        chip2 = new Chip();
        chip2.cryptPassword2(id);

        permissionList = new ArrayList<Permission>();

    }
    public void addPermission(Permission permission) {
        permissionList.add(permission);}
}
