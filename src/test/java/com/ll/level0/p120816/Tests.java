package com.ll.level0.p120816;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("10명이 7조각으로 자른 피자를 한 조각 이상씩 먹으려면 최소 2판을 시켜야 합니다.")
    void t1() {

        assertThat(new Solution().solution(7,10)).isEqualTo(2);

    }

    @Test
    @DisplayName("12명이 4조각으로 자른 피자를 한 조각 이상씩 먹으려면 최소 3판을 시켜야 합니다.")
    void t2() {

        assertThat(new Solution().solution(4,12)).isEqualTo(3);

    }

}