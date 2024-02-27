package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

// 회원 도메인 실행과 테스트를 위한 '클라이언트' 용 클래스
public class MemberApp {

    public static void main(String[] args) {
        //회원 가입 실행해보기
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L,"memberA", Grade.VIP); //member 엔티티 클래스를 선언해서, 해당 매개변수에 값들을 인자로 넣어준다.
        MemberService.join(member);

        //회원 가입이 제대로 되었는지 확인 해보기
        memberService.findMember(1L);
    }
}
