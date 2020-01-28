package humaresources;

import humaresources.Employee;

public class Researcher extends Employee {

    private ResearchGroup researchGroup;
    private boolean isSenior;
    private IRODetector iroDetector;

    public Researcher(){

        researchGroup=new ResearchGroup();


    }
    public void getExperimentData(){
        iroDetector.viewData();
    }

    @Override
    public void writeEmployeeData() {

    }

    @Override
    public void readEmployeeData() {

    }
}
