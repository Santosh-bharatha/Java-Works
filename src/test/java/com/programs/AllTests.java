package com.programs;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AllTests.class, StringHelperParameterizedTest.class, StringHelperTest.class })

public class AllTests {

}
