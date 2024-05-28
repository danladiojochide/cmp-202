public class student {
    String matricNo;
    String admission_no;

    String register() {
        if (admission_no.equals("") || matricNo.equals("")) {
            return "cant be empty";
        } else {
            return "success";
        }
    }
    Void registercourses(String courses){
    System.out.println("course");
    }
    String checkResult(){
        return" cmp202" + "" + 70;
    }
    public static void main(String[] args){
        student student= new student();
        student.registercourses("cmp202");
        System.out.println(student.checkResult());
    }
}







