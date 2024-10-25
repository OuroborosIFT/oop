import java.util.Calendar;

class Exam {
    String subject;
    int asses;
    Calendar examDate;

    Exam() {
        subject = "";
        asses = 0;
        examDate = Calendar.getInstance();
    }

    Exam(String subject, int asses, Calendar calendar) {
        this.subject = subject;
        this.asses = asses;
        examDate = calendar;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getAsses() {
        return asses;
    }

    public void setAsses(int asses) {
        this.asses = asses;
    }

    public Calendar getExamDate() {
        return examDate;
    }

    public void setExamDate(Calendar examDate) {
        this.examDate = examDate;
    }

    @Override
    public String toString() {
        return "Дата экзамена: " + examDate.get(Calendar.DATE) + " " + examDate.get(Calendar.MONTH) + " " + examDate.get(Calendar.YEAR) +
                "\nВремя экзамена: " + examDate.get(Calendar.HOUR) + examDate.get(Calendar.MINUTE) +
                "\nПредмет: " + subject +
                "\nОценка: " + asses;
    }
}
