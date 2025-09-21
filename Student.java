public class Student{
    public int id;
    public String name;
    public int age;
    public String major;
    public String course;

    public Student()
    {     
    }
    public Student(int id, String name, int age, String major, String course)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.major=major;
        this.course=course;
    }

    public void setId(int id)
    {
        this.id=id;
    }

    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age=age;
    }

    public int getAge()
    {
        return age;
    }

    public void setMajor(String major)
    {
        this.major=major;
    }

    public String getMajor()
    {
        return major; 
    }

    public void setCourse(String course)
    {
        this.course=course;
    }

    public String getCourse()
    {
        return course; 
    }

}
