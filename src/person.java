public class person {
    private String Schoolname = "Bingham university";
    private String name;

    private String password;

    private String MatricNo;

    private int StaffNo;

    public person(String schoolName, String password,int StaffNo){
     Schoolname = schoolName;
     this.name = name;
     this.password = password;
     StaffNo = StaffNo;
    }
    person(){
        System.out.println("objected created");
    }
    public person (String schoolName, String name, String password,String matricNo){
        Schoolname = "Bingham ";
        this.name = name;
        this. password = password;
        MatricNo = matricNo;

    }
    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }
    String getPassword(){
        return password;
    }
    void setPassword(String password){
        this.password=password;
    }
}


