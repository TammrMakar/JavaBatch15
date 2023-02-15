package Class23;

public class Student {

    public void Study() {
        System.out.println("Studing....");
    }

    void doHomeWork() {
        System.out.println("Solving homeworks");
    }

    void practice() {
        System.out.println("practice the skills");
    }
}

class SyntaxStudent extends Student {
    @Override
    public void Study() {
        System.out.println("Syntax student must study Programming");
    }

    @Override
    void doHomeWork() {
        System.out.println("Syntax students must solve the homeworks before next class");
    }

    @Override
    void practice() {
        System.out.println("Syntax student must practice repls");
    }
}
       class CollegeStudent extends Student {
        @Override
        void practice() {
            System.out.println("College student must practice must practice to get good grades");
        }
    }

        class SchoolStudent extends Student {

        }




