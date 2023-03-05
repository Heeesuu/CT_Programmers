package com.ll.level0.p120818;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("150,000원에서 5%를 할인한 142,500원을 return 합니다.")
    void t1() {

        assertThat(new com.ll.level0.p120818.Solution().solution(150000)).isEqualTo(142500);

    }


    @Test
    @DisplayName("580,000원에서 20%를 할인한 464,000원을 return 합니다.")
    void t2() {

        assertThat(new com.ll.level0.p120818.Solution().solution(580000)).isEqualTo(464000);

    }
}
