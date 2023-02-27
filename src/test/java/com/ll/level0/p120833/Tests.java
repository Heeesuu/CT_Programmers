package com.ll.level0.p120833;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("[1, 2, 3, 4, 5]의 1번째 인덱스 2부터 3번째 인덱스 4 까지 자른 [2, 3, 4]를 return 합니다.")
    void t1() {

        assertThat(new com.ll.level0.p120833.Solution().solution(new int[]{1,2,3,4,5},1,3 )).isEqualTo(new int[]{2,3,4});

    }
}

