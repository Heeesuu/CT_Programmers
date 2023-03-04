package com.ll.level0.p120822;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("my_string이 \"jaron\"이므로 거꾸로 뒤집은 \"noraj\"를 return합니다.")
    void t1() {

        assertThat(new com.ll.level0.p120822.Solution().solution("jaron")).isEqualTo("noraj");

    }
}