package humaresources;

import security.IROIrisScanner;

public class ReceptionStaff extends Employee {
    private IReception iReception;
    private IROIrisScanner scanner;
    private Visitor visitor;
    public void setScanIris(){
        iReception.setIrisScanner(scanner);
    }
    public void createIDCardVisitor() throws Exception {
        iReception.createIDCard(visitor);

    }

    @Override
    public void writeEmployeeData() {

    }

    @Override
    public void readEmployeeData() {

    }
}
