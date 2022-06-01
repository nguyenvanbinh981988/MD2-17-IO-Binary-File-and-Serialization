package QLSV;

public class Student implements Comparable<Student>{
    private String id;
    private String name;
    private String age;
    private String sex;
    private String address;
    private String point;

    public Student() {
    }

    public Student(String id, String name, String age, String sex, String address, String point) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.point = point;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", point='" + point + '\'' +
                '}';
    }

    public String write() {
        return id  +
                "," + name  +
                "," + age  +
                "," + sex +
                "," + address  +
                ", " + point;
    }

    @Override
    public int compareTo(Student o){
        return this.getName().compareTo(o.getName());
        }

    }
