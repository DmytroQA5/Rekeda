package home7;

// Создать класс Конспект. Класс должен содержать следующие поля:
// ФИО студента;
// Название предмета;
// Количество страниц;
// Год выпуска;
// Цвет обложки.
// Название заведения, где учится студент;
public class Konspect {
    private String studentFullName;
    private String subjectName;
    private int pageCount;
    private int yearOfPublication;
    private String coverColor;
    private String educationalInstitution;


    public Konspect(String studentFullName, String subjectName, int pageCount, int yearOfPublication, String coverColor, String educationalInstitution) {
        this.studentFullName = studentFullName;
        this.subjectName = subjectName;
        this.pageCount = pageCount;
        this.yearOfPublication = yearOfPublication;
        this.coverColor = coverColor;
        this.educationalInstitution = educationalInstitution;
    }

    public String getStudentFullName() {
        return studentFullName;
    }

    public void setStudentFullName(String studentFullName) {
        this.studentFullName = studentFullName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getCoverColor() {
        return coverColor;
    }

    public void setCoverColor(String coverColor) {
        this.coverColor = coverColor;
    }

    public String getEducationalInstitution() {
        return educationalInstitution;
    }

    public void setEducationalInstitution(String educationalInstitution) {
        this.educationalInstitution = educationalInstitution;
    }


}
