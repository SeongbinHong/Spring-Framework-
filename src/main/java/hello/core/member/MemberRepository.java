package hello.core.member;

public interface MemberRepository { //임시 메모리 저장소 인터페이스 생성
    void save(Member member); //회원을 저장하는 기능

    Member findById(Long memberId); //회원 아이디로 회원정보를 찾는 기능
}
