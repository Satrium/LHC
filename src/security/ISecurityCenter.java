package security;

import humaresources.Employee;
import humaresources.Person;

public interface ISecurityCenter extends IROSecurityCentre {

    public void createIDCard(Employee employee) throws Exception;
    public void lockIDCard();

}
