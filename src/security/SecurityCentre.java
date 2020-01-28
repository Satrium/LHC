package security;

import humaresources.Employee;
import humaresources.Visitor;
import security.Chip;
import security.IDCard;
import security.IROIrisScanner;
import security.Permission;

public enum SecurityCentre implements ISecurityCenter {
    instance;

    private Chip chip;
    private IDCardEmployee idCard;

    IROIrisScanner irisScanner;
    @Override
    public void setIrisScanner(IROIrisScanner scanner) {
        this.irisScanner = scanner;
    }


    @Override
    public void createIDCard(Employee employee) throws Exception {
            idCard=new IDCardEmployee();

           String iris = irisScanner.scanIris(employee);

        }



    @Override
    public void lockIDCard() {

    }

    @Override
    public void readEmployee() {

    }
}
