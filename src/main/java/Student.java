public class Student {
    public Student(String Name, int Age){
        this.setAge(Age);
        this.setName(Name);
    }
    private String Name;
    private int Age;

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setName(String name) {
        Name = name;
    }
    public int AddAge(int num){
        this.setAge(this.Age + num);
        return this.getAge();
    }
}
