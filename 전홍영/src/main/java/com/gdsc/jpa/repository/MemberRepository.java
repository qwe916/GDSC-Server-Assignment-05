package com.gdsc.jpa.repository;

import com.gdsc.jpa.entity.Member;
import com.gdsc.jpa.entity.Team;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    /*
    SQL
    select *
    from member
    where team_id = ?
     */
    List<Member> findAllByTeam(Team team);

    Page<Member> findAllByTeam(Team team, Pageable pageable);
}
