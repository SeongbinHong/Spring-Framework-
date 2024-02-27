package hello.core.member;

//회원 속성 엔티티는 클래스로 만듦
public class Member {

    private Long id;
    private String name;
    private Grade grade;

    //생성자 만들기  (Alt + Insert)
    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //Getter Setter 만들기 -> Setter를 통해서 , private으로 설정된 변수의 값을 설정 가능
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
