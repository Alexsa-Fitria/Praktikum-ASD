package P2jobsheet10;
public class StudentKRS {
    String nim, name, studyProgram, className;
    public StudentKRS(String nim, String name, String studyProgram, String className){
        this.nim = nim;
        this.name = name;
        this.studyProgram = studyProgram;
        this.className = className;
    }
    void print(){
        System.out.println(nim+ " - " + name+ " - " + studyProgram+ " - " +className );
    }
}