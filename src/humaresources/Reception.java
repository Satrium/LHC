package humaresources;

import security.*;

public enum Reception {
    instance;

    private IDCardVisitor idCardVisitor;

    IROIrisScanner irisScanner;

    public void setIrisScanner(IROIrisScanner scanner) {
        this.irisScanner = scanner;
    }


    public void createIDCard(Visitor visitor) throws Exception{

    idCardVisitor=new IDCardVisitor();
    idCardVisitor.addPermission(Permission.Visitor);
    String iris = irisScanner.scanIris(visitor);


    }
}
