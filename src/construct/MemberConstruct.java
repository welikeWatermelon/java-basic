package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //추가
    MemberConstruct(String name, int age){
        this(name,age,50); //자기 자신의 생성자를 호출 -> 파라미터가 세개 있는 생성자로 들어감
    }

    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name = "+name+" age = "+age+" grade = "+grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
