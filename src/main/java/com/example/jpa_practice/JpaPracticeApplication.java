package com.example.jpa_practice;

import com.example.jpa_practice.domain.Member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.*;
import java.util.List;

@SpringBootApplication
public class JpaPracticeApplication {
    public static void main(String[] args) {
        SpringApplication.run(JpaPracticeApplication.class, args);
    }
//    public static void main(String[] args) {
//        // 엔티티 매니저 팩토리 - 생성
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_practice");
//        // 엔티티 매니저 - 생성
//        EntityManager em = emf.createEntityManager();
//        // 트랜잭션 - 흭득
//        EntityTransaction tx = em.getTransaction();
//
//        try{
//            tx.begin();
//            logic(em);
//            tx.commit();
//        } catch (Exception e){
//            tx.rollback();
//        } finally {
//            em.close();
//        }
//        emf.close();
//    }
//    private static void logic(EntityManager em){
//        String id = "id1";
//        Member member = new Member();
//        member.setId(id);
//        member.setUsername("지한");
//        member.setAge(2);
//
//        //등록
//        em.persist(member);
//        //수정
//        member.setAge(20);
//        //한 건 조회
//        Member findMember = em.find(Member.class, id);
//        System.out.println("findMember="+findMember.getUsername()
//            + ", age=" + findMember.getAge());
//        //목록 조회
//        List<Member> members =
//                em.createQuery("select m from Member m", Member.class).getResultList();
//        System.out.println("memebers.size=" + members.size());
//        //삭제
//        em.remove(member);
//
//    }

}
