import org.junit.*;

public class TestStudent {
    Student stu = new Student("小明",25);

    @Test
    public void testAddAge(){
        stu.AddAge(10);
        System.out.println(stu.getAge());
    }

    @Test
    public void testAddAge2(){
        stu.AddAge(20);
        System.out.println(stu.getAge());
    }
}
