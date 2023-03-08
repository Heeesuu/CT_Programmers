package com.ll.level0.p120585;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("[1, 1, 2, 3, 4, 5] 에는 1이 2개 있습니다.")
    void t1() {
        assertThat(new com.ll.level0.p120585.Solution().solution(new int[]{149, 180, 192, 170}, 167)).isEqualTo(3);

    }
}
