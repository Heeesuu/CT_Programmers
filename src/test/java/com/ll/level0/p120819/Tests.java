package com.ll.level0.p120819;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("5,500원은 아이스 아메리카노 한 잔을 살 수 있고 잔돈은 0원입니다.")
    void t1() {

        assertThat(new com.ll.level0.p120819.Solution().solution(5500)).isEqualTo(new int[]{1,0});

    }


    @Test
    @DisplayName("15,000원은 아이스 아메리카노 두 잔을 살 수 있고 잔돈은 4,000원입니다.")
    void t2() {

        assertThat(new com.ll.level0.p120819.Solution().solution(15000)).isEqualTo(new int[]{2,4000});

    }
}