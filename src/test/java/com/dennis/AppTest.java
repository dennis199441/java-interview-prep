package com.dennis;

import com.dennis.arrstr.StringCompressionTest;
import com.dennis.arrstr.StringPermutationTest;
import com.dennis.arrstr.TwoSumTest;
import com.dennis.arrstr.UniqueStringTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Unit test for simple App.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    TwoSumTest.class,
    UniqueStringTest.class,
    StringPermutationTest.class,
    StringCompressionTest.class
})
 public class AppTest {
}
