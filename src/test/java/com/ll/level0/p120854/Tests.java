package com.ll.level0.p120854;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[\"We\", \"are\", \"the\", \"world!\"]의 각 원소의 길이인 [2, 3, 3, 6]을 return합니다.")
    void t1() {

        assertThat(new com.ll.level0.p120854.Solution().solution(new String[]{"We", "are", "the", "world!"})).isEqualTo(new int[]{2,3,3,6});

    }

    @Test
    @DisplayName("[\"I\", \"Love\", \"Programmers.\"]의 각 원소의 길이인 [1, 4, 12]을 return합니다.")
    void t2() {

        assertThat(new com.ll.level0.p120854.Solution().solution(new String[]{"I", "Love", "Programmers."})).isEqualTo(new int[]{1,4,12});

    }
}
