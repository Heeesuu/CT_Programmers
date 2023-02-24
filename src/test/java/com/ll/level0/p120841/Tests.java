package com.ll.level0.p120841;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("배열이 [2, 4]일때 결과는 1")
    void t1() {

        assertThat(new com.ll.level0.p120841.Solution().solution(new int[]{2,4})).isEqualTo(1);

    }
    @Test
    @DisplayName("배열이 [-7, 9]일때 결과는 2")
    void t2() {

        assertThat(new com.ll.level0.p120841.Solution().solution(new int[]{-7,9})).isEqualTo(2);

    }
}
