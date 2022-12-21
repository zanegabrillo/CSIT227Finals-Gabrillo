public class Person {
    // TODO implement Person and its subclasses in other Java files
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Hello, my name is " + name + ".";
        }
    }

    public class Employee {
        private int monthsWorked;
        private double salary;
        private double thirteenthMonth;

        public Employee(String name, int age, int monthsWorked, double salary) {
            super(name, age);
            this.monthsWorked = monthsWorked;
            this.salary = salary;
            this.thirteenthMonth = 12/ monthsWorked;
        }

        public int getMonthsWorked() {
            return monthsWorked;
        }

        public double getSalary() {
            return salary;
        }

        public double getThirteenthMonth() {
            return thirteenthMonth;
        }

        @Override
        public String toString() {
            return super.toString() + " I have been working for " + monthsWorked + " months.";
        }
    }

    public class Clerk extends Employee {
        public Clerk(String name, int age, int monthsWorked, double salary) {
            super(name, age, monthsWorked, salary);
        }

        @Override
        public String toString() {
            return super.toString() + " How may I help you?";
        }
    }
}
