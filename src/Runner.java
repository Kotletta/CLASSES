import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Student> studentsArrayList = new ArrayList<>();

        studentsArrayList.add(new Student(1,"Александр", "Овечкин", "Михайлович", 1980, "Москва", "9997894561122", "ФизМат", 5, 51));
        studentsArrayList.add(new Student(2,"Илья", "Сперанский", "Владимирович", 1992, "Тверь", "9997893355", "Юридический", 4, 41));
        studentsArrayList.add(new Student(3,"Валерий", "Сперанский", "Владимирович", 1992, "Тверь", "9997894545", "ПГС", 2, 21));
        studentsArrayList.add(new Student(4,"Илья", "Ковальчук", "Валерьевич", 1983, "Тула", "9105343232", "ФизМат", 5, 51));
        studentsArrayList.add(new Student(5,"Ольга", "Тихонова", "Александровна", 1993, "Ржев", "9105557878", "Юридический", 4, 41));

        System.out.println("СТУДЕНТЫ ЮРИДИЧЕСКОГО ФАКУЛЬТЕТА");
        for (Student st : studentsArrayList) { //вывести список студентов Юридического факультета (faculty)
            if (st.getFaculty().equals("Юридический")){
                System.out.println(st.getLastName() + " " + st.getName() + " " + st.getPatronymic());
            }
        }
        System.out.println(" ");
        System.out.println("СПИСКИ СТУДЕНТОВ ДЛЯ КАЖДОГО ФАКУЛЬТЕТА И КУРСА");

        for (Student st : studentsArrayList) {
            System.out.println(st.getLastName() + " " + st.getName() + " " + st.getPatronymic() + " из " + st.getFaculty() + " факультета " + st.getCourse() + " курса." );
        }

        System.out.println(" ");
        System.out.println("СТУДЕНТЫ РОДИВШИЕСЯ ПОСЛЕ 1990го ГОДА");

        for (Student st: studentsArrayList) {
            if(st.getBirthday() >= 1990 ) {
                System.out.println(st.getLastName() + " " + st.getName() + " " + st.getPatronymic() + " " + st.getBirthday() + " года рождения.");
            }
        }

        System.out.println(" ");
        System.out.println("СПИСОК СТУДЕНТОВ ИЗ 51 ГРУППЫ");

        for (Student st: studentsArrayList) {
            if (st.getGroup().equals(51)){
                System.out.println(st.getLastName() + " " + st.getName() + " " + st.getPatronymic() + " из" + st.getGroup() + " группы.");
            }
        }
    }
}

