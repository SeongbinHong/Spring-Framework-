package hello.core.member;

import java.util.HashMap;
import java.util.Map;

//MemberRepository 인터페이스의 구현체를 아래와 같이 생성
// => 메모리 자체에서 임시 회원저장소를 만든 것(이유: 아직 DB를 어떤 것으로 할지 결정 못한 상태에서 개발을 진행해야 하니까)
// 단점) 코드로 만든 '메모리 임시저장소' 이기 때문에 컴퓨터가 종료되면 저장된 데이터는 모두 날라간다.
public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>(); //Map 형태의 store라는 static 변수를 선언하고, 이를 HashMap으로 초기화하였습니다.
                                                            // 여기서 Key는 Long 타입, Value는 Member 객체입니다.
                                                            //static이므로 클래스 단위로 한 번만 생성되고, 모든 객체가 공유합니다.
    /*
    Map은 Key-Value 형태의 데이터를 저장할 수 있는 자료구조입니다.
    이 경우에는 회원의 ID가 Key로, 회원 객체가 Value로 사용되어서, 회원의 ID를 통해 바로 회원 정보를 가져올 수 있게 됩니다. 이런 방식은 검색 속도가 빠르다는 장점이 있습니다.
    HashMap은 Map인터페이스를 구현한 클래스로, 데이터의 저장과 검색 속도가 빠르다는 특징이 있습니다. 그리고 null값도 허용합니다.
     */
    @Override
    public void save(Member member) {
        store.put(member.getId(), member); //member 객체를 인자로 받아서 -> 해당 객체의 ID를 key 값으로, 객체 자체를 Value값으로 store 라는 Map 자료구조에 저장한다.
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId); // Long 타입의 ID를 인자로 받아서, 해당 ID를 key값으로 사용해서 store라는 Map 자료구조에서 Member 객체를 검색하고 반환한다.
    }

}
