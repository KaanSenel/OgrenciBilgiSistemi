import java.text.DecimalFormat;

public class Student {
    String _name;
    int _stuNo;
    String _classes;
    Course _course1;
    Course _course2;
    Course _course3;
    double _average;

    public Student(String name,int stuNo,String classes,Course course1,Course course2,Course course3){
        _name=name;
        _stuNo=stuNo;
        _classes=classes;
        _course1=course1;
        _course2=course2;
        _course3=course3;
        _average=0.0;
    }

    public void addBulkExamNote(int note1,int quiz1,int note2,int quiz2,int note3,int quiz3){
        if(note1>=0 && note1<=100){
            _course1._note = note1;
        }
        if(quiz1>=0 && quiz1<=100){
            _course1._quiz=quiz1;
        }
        if(note2>=0 && note2<=100){
            _course2._note = note2;
        }
        if(quiz2>=0 && quiz2<=100){
            _course2._quiz=quiz2;
        }
        if(note3>=0 && note3<=100){
            _course3._note = note3;
        }
        if(quiz3>=0 && quiz3<=100){
            _course3._quiz=quiz3;
        }
    }

    public void printNote(){
        System.out.println("Dersin Adı: "+_course1._name+", Sınav Notu : "+_course1._note);
        System.out.println("Dersin Adı: "+_course2._name+", Sınav Notu : "+_course2._note);
        System.out.println("Dersin Adı: "+_course3._name+", Sınav Notu : "+_course3._note);

        System.out.println("Dersin Adı: "+_course1._name+", Sözlü Notu : "+_course1._quiz);
        System.out.println("Dersin Adı: "+_course2._name+", Sözlü Notu : "+_course2._quiz);
        System.out.println("Dersin Adı: "+_course3._name+", Sözlü Notu : "+_course3._quiz);
    }

    public void calcAverageWithQuizNote(){
        _course1._finalNote=(_course1._quiz*_course1._quizRatio)+(_course1._note*(1-_course1._quizRatio));
        _course2._finalNote=(_course2._quiz*_course2._quizRatio)+(_course2._note*(1-_course2._quizRatio));
        _course3._finalNote=(_course3._quiz*_course3._quizRatio)+(_course3._note*(1-_course3._quizRatio));
        calcAverage();

    }

    public void calcAverage(){
        _average=(_course1._finalNote+_course2._finalNote+_course3._finalNote)/3.0;
        System.out.println("Ortalamanız : "+ new DecimalFormat("###.#").format(_average));
        //isPass();
    }

    public String isPass(){
        return _average> 55 ? "Sınıfı geçtiniz " : "Sınıfta kaldınız." ;
    }
}
