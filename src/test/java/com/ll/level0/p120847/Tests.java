package com.ll.level0.p120847;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[1, 2, 3, 4, 5] > 20")
    void t1() {

        assertThat(new com.ll.level0.p120847.Solution().solution(new int[]{1,2,3,4,5})).isEqualTo(20);

    }
}
