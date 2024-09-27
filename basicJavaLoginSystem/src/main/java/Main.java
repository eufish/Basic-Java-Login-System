public class Main {
    public static void main(String[] args){

        IDandPasswords idandpassswords = new IDandPasswords();
        

        LoginPage loginpage = new LoginPage(idandpassswords.getLoginInfo());


    }
}
