package Ch6_problem;

public class Student {
    private String name;
    private int grade;

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public int setGrade(int grade) {
        if (grade < 0) {
            grade = 1;
            this.grade = grade;
        } else {
            this.grade = grade;
        }
        return grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        Student student = new Student();

        student.setName("홍길동");
        student.setGrade(3);

        System.out.println("이름: " + student.getName());
        System.out.println("학년: " + student.getGrade());
        System.out.println();

        Student student2 = new Student();

        student2.setName("정동형");
        student2.setGrade(-30); // 학년이 마이너스면 1로 초기화

        System.out.println("이름: " + student2.getName());
        System.out.println("학년: " + student2.getGrade());
    }
}


