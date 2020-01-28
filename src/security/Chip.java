package security;

import humaresources.IGetPersonName;

public class Chip implements IGetPassword,IChangePassword{
    private Crypting crypting;
    private IGetPersonName iGetPersonName;
    @Override
    public String getPassword(){
        return password;
    }
    public void setPassword(){

    }
    @Override
    public void cryptPassword(String password) throws Exception {

        crypting = new Crypting(password,iGetPersonName.getName());
        this.password= crypting.getAESPassword();
        this.password = password;
    }
    public void cryptPassword2(String password) throws Exception {

        crypting = new Crypting(password,iGetPersonName.getName());
        this.password= crypting.getMD5Password();
        this.password = password;
    }

    private String password;
}
