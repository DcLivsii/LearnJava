public class Student extends Human{
    int courseOfStudy;
    String faculty;
    String group;

    public void sayWhoAmI() {
        System.out.println("Здравствуйте, я " + this.name + ", мне " + this.age + " и я студент группы " + this.group);
    }
}
