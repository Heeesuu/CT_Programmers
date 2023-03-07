package com.ll.level0.p120826;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("\"abcdef\" 에서 \"f\"를 제거한 \"abcde\"를 return합니다.")
    void t1() {

        assertThat(new com.ll.level0.p120826.Solution().solution("abcdef", "f")).isEqualTo("abcde");

    }
}