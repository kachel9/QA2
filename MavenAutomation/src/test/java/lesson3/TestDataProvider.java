package lesson3;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {
    @BeforeMethod
    public void beforeMethod2(){
        System.out.println("Before2");
    }
    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {"userName1","password1"},
                {"userName2","password2"},
                {"userName3","password3"}
        };
    }
    @Test(dataProvider="getData")
    public void checkRegister(String userName, String password){
        System.out.println(userName+" "+password);
    }
}
