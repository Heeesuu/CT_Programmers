package com.ll.level0.p120837;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("hp가 23이므로, 장군개미 네마리와 병정개미 한마리로 사냥할 수 있습니다. 따라서 5를 return합니다")
    void t1() {

        assertThat(new com.ll.level0.p120837.Solution().solution(23)).isEqualTo(5);

    }

    @Test
    @DisplayName("hp가 999이므로, 장군개미 199 마리 병정개미 한마리 일개미 한마리로 사냥할 수 있습니다. 따라서 201을 return합니다.")
    void t2() {

        assertThat(new com.ll.level0.p120837.Solution().solution(999)).isEqualTo(201);

    }
}
