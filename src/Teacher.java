public class Teacher {
    String _name;
    String _mpno;
    String _branch;

    public Teacher(String name,String mpno,String branch){
        _name=name;
        _mpno=mpno;
        _branch=branch;
    }

    public void print(){
        System.out.println("Adı : "+_name);
        System.out.println("Telefonu : "+_mpno);
        System.out.println("Branşı : "+_branch);
    }
}
