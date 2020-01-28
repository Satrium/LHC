package humaresources;

import humaresources.Employee;
import security.IROIrisScanner;
import security.ISecurityCenter;

public class SecurityOfficer  extends Employee {
    private boolean hasWeapon;

    private ISecurityCenter iSecurityCenter;
    private IROIrisScanner scanner;
    private Employee employee;
    private IROIrisScanner iroIrisScanner;

    public void setScanIris(){
        iSecurityCenter.setIrisScanner(iroIrisScanner);
    }
    public void createIDCardVisitor() throws Exception {
        iSecurityCenter.createIDCard(employee);

    }

    @Override
    public void writeEmployeeData() {

    }

    @Override
    public void readEmployeeData() {

    }
}
