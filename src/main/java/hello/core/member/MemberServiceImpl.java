package hello.core.member;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository = new MemoryMemberRepository(); // 구현 객체를 지정해줘야 Nullpoint 예외가 발생하지 않는다.

    @Override
    public void join(Member member) {
        memberRepository.save(member); //다형성에 의해서, memberRepository 인터페이스가 아니라, 그 구현체인 MemoryMemberRepository의 save 함수가 호출된다.
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
