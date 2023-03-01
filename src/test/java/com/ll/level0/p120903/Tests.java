package com.ll.level0.p120903;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {

    @Test
    @DisplayName("\"b\"와 \"c\"가 같으므로 2를 return합니다.")
    void t1() {

        assertThat(new com.ll.level0.p120903.Solution().solution(new String[]{"a","b","c"}, new String[]{"com", "b", "d", "p", "c"})).isEqualTo(2);

    }
}

