class Aha {
    String name;
    int age;
    String course;

    void introduce() {
        System.out.println("Hi, my name is " + name +
                ". I am " + age +
                " years old and I study " + course + ".");
    }
}

  class sand {
      public static void main(String[] args) {
          Aha student1 = new Aha();
          student1.name = "John";
          student1.age = 18;
          student1.course = "Software Engineering";

          Aha student2 = new Aha();
          student2.name = "Cherish";
          student2.age = 16;
          student2.course = "Computer Science";

          student1.introduce();
          student2.introduce();
      }
  }