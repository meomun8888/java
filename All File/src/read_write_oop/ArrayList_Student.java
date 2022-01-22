package read_write_oop;

import java.util.ArrayList;

public class ArrayList_Student {
    private ArrayList<Student> arrayList;

    public ArrayList_Student() {
        this.arrayList = new ArrayList<Student>();
    }

    public ArrayList_Student(ArrayList<Student> arrayList) {
        this.arrayList = arrayList;
    }

    public void add_student(Student sv) {
        this.arrayList.add(sv);
    }

    public void printList() {
        for (Student st : arrayList) {
            System.out.println(st.toString());
        }
    }

    public int size() {
        return this.arrayList.size();
    }

    public boolean checkList() {
        return this.arrayList.isEmpty();
    }

    public void removeList() {
        this.arrayList.removeAll(arrayList);
    }

    public void studentGpa(String Max_or_Min) {
        final String max = "Max";
        final String min = "Min";
        if (max.equalsIgnoreCase(Max_or_Min) == false && min.equalsIgnoreCase(Max_or_Min) == false) {
            System.out.println("Input Max or Min !");
        } else {
            if (max.equalsIgnoreCase(Max_or_Min)) {
                for (Student st : arrayList) {
                    if (st.getMediumScore() >= 8.0) {
                        System.out.println(st);
                    }
                }
            }
            if(min.equalsIgnoreCase(Max_or_Min)){
                for (Student st : arrayList) {
                    if (st.getMediumScore() < 8.0) {
                        System.out.println(st);
                    }
                }
            }
        }
    }

    public Boolean checkStudent(Student sv) {
        return this.arrayList.contains(sv);
    }
}
