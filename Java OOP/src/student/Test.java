package student;

public class Test {
    public static void main(String[] args) {
        Array_List_Student st = new Array_List_Student();
        Date dt = new Date(11, 12, 2001);
        Student s1 = new Student("Ly Thanh Long", "11122001", 21, dt, "021105", Department.INTERNATIONAL,Class.K25_CMU_TMP1);
        Student s2 = new Student("Ly Thanh B", "11122001", 21, dt, "021105", Department.INTERNATIONAL,Class.K25_CMU_TMP1);
        st.add(s1);
        st.add(s2);
        System.out.println(s1.number);

    }
}
