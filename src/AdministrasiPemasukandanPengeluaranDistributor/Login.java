package AdministrasiPemasukandanPengeluaranDistributor;

import java.util.Scanner;

public class Login {
    public boolean doLogin(){
        boolean isLogin=true;
        String ID="admin123";
        String idInput="";

        Scanner sc=new Scanner(System.in);
        System.out.println("Silahkan Masukan ID Anda");
        System.out.println("=========================");
        System.out.print("ID : ");
        idInput = sc.nextLine();
        if(!idInput.equalsIgnoreCase(ID)){
            System.out.println("ID Anda Salah -> "+idInput);
            isLogin=false;
        }

        return isLogin;
    }
}