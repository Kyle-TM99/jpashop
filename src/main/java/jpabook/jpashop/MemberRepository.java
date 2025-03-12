package jpabook.jpashop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @PersistenceContext
    // 스프링이 엔티티 매니저를 주입해준다.
    private EntityManager em;

    // 저장
    public Long save(Member member) {
        em.persist(member);
        return member.getId();
    }

    // 조회
    public Member find(Long id) {
        return em.find(Member.class, id);
    }
}
