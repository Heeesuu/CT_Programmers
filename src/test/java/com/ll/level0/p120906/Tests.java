package com.ll.level0.p120906;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("1 + 2 + 3 + 4 = 10을 return합니다.")
    void t1() {

        assertThat(new com.ll.level0.p120906.Solution().solution(1234)).isEqualTo(10);

    }

    @Test
    @DisplayName("9 + 3 + 0 + 2 + 1 + 1 = 16을 return합니다.")
    void t2() {

        assertThat(new com.ll.level0.p120906.Solution().solution(930211)).isEqualTo(16);

    }
}

