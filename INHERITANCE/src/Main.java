public class Main{
    String name;
    String password;

    String logo(){
        return "logged in";
}
Void register() {
    if (name.equals("") || password.equals("")) {
        System.out.print("invalid login");
    } else {
        System.out.println("sucess");
    }
}

 }