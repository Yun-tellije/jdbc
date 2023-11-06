package hello.jdbc.repository;

import hello.jdbc.domain.Member;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class MemberRepositoryV0Test {

    MemberRepositoryV0 repository = new MemberRepositoryV0();

    @Test
    void crud() throws SQLException {
        // 똑같은 값으로 다시 실행 시 에러 발생
        // -> memberId가 PK라서
        Member member = new Member("memberV0", 10000);
        repository.save(member);
    }
}
