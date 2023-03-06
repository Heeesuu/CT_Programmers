package com.ll.level0.p120583;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("[1, 1, 2, 3, 4, 5] 에는 1이 2개 있습니다.")
    void t1() {
        assertThat(new com.ll.level0.p120583.Solution().solution(new int[]{1,1,2,3,4,5}, 1)).isEqualTo(2);

    }

    @Test
    @DisplayName("[0, 2, 3, 4] 에는 1이 0개 있습니다.")
    void t2() {
        assertThat(new com.ll.level0.p120583.Solution().solution(new int[]{0, 2, 3, 4}, 1)).isEqualTo(0);

    }
}