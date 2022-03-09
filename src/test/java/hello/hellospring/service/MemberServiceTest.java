//package hello.hellospring.service;
//
//import hello.hellospring.domain.Member;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import service.MemberService;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.jupiter.api.Assertions.fail;
//
//class MemberServiceTest {
//
//    MemberService memberService = new MemberService();
//
//    //테스트는 한글로 적어도 무관 > 실제코드에 포함되지 않는다.
//    @Test
//    void 회원가입() {
//
//        //given --주어진 상황
//        Member member = new Member();
//        member.setName("hello");
//
//        // when -실행했을때 : 검증부
//         Long saveId = memberService.join(member);
//
//        // then - 나와야 하는 결과
//        Member findMember = memberService.findOne(saveId).get();
//        assertThat(member.getName()).isEqualTo(findMember.getName());
//
//
//    }
//
//    @Test
//    void 중복회원예외() {
//        //given
//        Member member1 = new Member();
//        member1.setName("spring");
//
//        Member member2 = new Member();
//        member2.setName("spring");
//
//        //when :: 중복된 값이기 떄문에 오류나야함
//        memberService.join(member1);
//        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));
//        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
////        try{
////            memberService.join(member2);
////            fail();
////        }catch(IllegalStateException e){
////            assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
////        }
//
//
//        //then
//    }
//
//    @Test
//    void findMembers() {
//    }
//
//    @Test
//    void findOne() {
//    }
//}