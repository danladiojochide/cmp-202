public class Main{
    public static void main(String[]args){

        person person = new person();
        person.setName("marvellous");
        System.out.println(person.getName());

        person.setPassword("latitude.e5450");
        System.out.println(person.getPassword());

        physics physics= new physics();
        physics .calculateVelocity(6,4);
       physics .calculateVelocity( 6, 4, 7);
    }
}