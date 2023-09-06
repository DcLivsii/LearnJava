public class Main {
    public static void main(String[] args) {
        Student alex = new Student();
        Docent lebedenko = new Docent();

        lebedenko.age = 44;
        lebedenko.name = "Lebedenko";
        lebedenko.faculty = "MKMT";

        alex.age = 19;
        alex.name = "Alex";
        alex.faculty = "MKMT";
        alex.courseOfStudy = 3;
        alex.group = "MKIS35";

        lebedenko.sayWhoAmI();
        alex.sayWhoAmI();
    }
}
