public class Docent extends Human{
    int experience;
    String faculty;

    public void sayWhoAmI() {
        System.out.println("Здравствуйте, я " + this.name + ", мне " + this.age + " и я доцент факультета " + this.faculty);
    }
}
