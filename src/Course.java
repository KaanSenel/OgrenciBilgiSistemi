public class Course {
    String _name;
    String _code;
    String _prefix;
    int _note;
    int _quiz;
    double _finalNote;
    Teacher _teacher;
    double _quizRatio;

    public Course(String name,String code,String prefix,double quizRatio){
        _name=name;
        _code=code;
        _prefix=prefix;
        _note=0;
        _quiz=0;
        _quizRatio=quizRatio;
    }

    public void addTeacher(Teacher teacher){
        if(_prefix.equals(teacher._branch)){
            _teacher=teacher;
            System.out.println("Atama işlemi başarılı.");
        }
        else
            System.out.println("Atama işelmi başarısız.");
    }

    public void printTeacher(){
        if(_teacher!=null)
            _teacher.print();
        else
            System.out.println("Öğretmeni yok");
    }
}
