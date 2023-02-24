package com.ll.level0.p120830;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("10인분을 시켜서 서비스로 음료수를 하나 받았을 때 가격")
    void t1() {

        assertThat(new com.ll.level0.p120830.Solution().solution(10, 3)).isEqualTo(124000);
    }


    @Test
    @DisplayName("64분을 시켜서 서비스로 음료수를 6개 받았을 때 가격")
    void t2() {

        assertThat(new com.ll.level0.p120830.Solution().solution(64, 6)).isEqualTo(768000);
    }




}
