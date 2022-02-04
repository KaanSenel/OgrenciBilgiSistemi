public class Main {

    public static void main(String[] args) {
	// write your code here
        Teacher teacher= new Teacher("Kaan","21323233","TRH");
        Teacher teacher1= new Teacher("Mehmet","123221","MAT");
        Teacher teacher2= new Teacher("Ayşe","3435412","ALG");
        //teacher.print();

        Course tarih=new Course("Tarih","TRH101","TRH",0.25);
        tarih.addTeacher(teacher);

        Course matematik=new Course("Matematik","MAT101","MAT",0.2);
        matematik.addTeacher(teacher1);

        Course algoritma= new Course("Algoritma","ALG101","ALG",0.3);
        algoritma.addTeacher(teacher2);

        Student student = new Student("ali",12,"MEK-1",tarih,matematik,algoritma);
        student.addBulkExamNote(55,32,99,11,78,322);
        student.printNote();
        student.calcAverageWithQuizNote();
        System.out.println(student.isPass());

        System.out.println("-----------------------------------------------");
        Student student1= new Student("veli",22,"4",tarih,matematik,algoritma);
        student1.addBulkExamNote(45,75,87,42,22,43);
        student1.printNote();
        student1.calcAverageWithQuizNote();
        System.out.println(student1.isPass());


    }
}
