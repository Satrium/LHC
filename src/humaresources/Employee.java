package humaresources;

import humaresources.Person;
import humaresources.hrd.IEmployee;
import humaresources.hrd.IROEmployee;

public abstract class Employee extends Person implements IROEmployee, IEmployee {
    protected boolean isManager;
    protected boolean isMentor;
    protected boolean hasBudgetResponsibility;


}
