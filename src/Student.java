public class Student {

    private Person studentData;
    private Education eduForm;
    private int group;
    private Exam[] exams;

    public Student() {
    }

    public Student(Person studentData, Education eduForm, int group) {
        this.studentData = studentData;
        this.eduForm = eduForm;
        this.group = group;
    }

    public double midleAsses() {
        double midAs = 0.0;

        for (Exam ex : exams) {
            midAs += ex.getAsses();
        }

        return midAs;
    }

    public Person getStudentData() {
        return studentData;
    }

    public void setStudentData(Person studentData) {
        this.studentData = studentData;
    }

    public Education getEduForm() {
        return eduForm;
    }

    public void setEduForm(Education eduForm) {
        this.eduForm = eduForm;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Exam[] getExams() {
        return exams;
    }

    public void setExams(Exam[] exams) {
        this.exams = exams;
    }
}
