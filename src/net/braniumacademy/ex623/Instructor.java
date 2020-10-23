package net.braniumacademy.ex623;

public class Instructor {
    private String id;      // mã nhân viên
    private String fullName;// họ và tên
    private String major;   // chuyên môn
    private long salary;   // lương
    private float experience; // số năm kinh nghiệm

    public Instructor() {
    }

    public Instructor(String id) {
        this.id = id;
    }

    public Instructor(String id, String fullName,
                      String major, long salary, float experience)
            throws InvalidSalaryException {
        this.id = id;
        this.fullName = fullName;
        this.major = major;
        this.setSalary(salary);
        this.experience = experience;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) throws InvalidSalaryException {
        if (salary >= 0 && salary <= 50000000l) {
            this.salary = salary;
        } else {
            this.salary = 0;
            var msg = "Mức lương không hợp lệ: " + salary
                    + ", giá trị hợp lệ phải nằm trong đoạn [0, 50000k]";
            throw new InvalidSalaryException(msg, salary);
        }
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }
}
