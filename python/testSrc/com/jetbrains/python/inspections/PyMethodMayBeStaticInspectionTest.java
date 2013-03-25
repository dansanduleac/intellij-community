package com.jetbrains.python.inspections;

import com.jetbrains.python.fixtures.PyTestCase;

/**
 * User: ktisha
 */
public class PyMethodMayBeStaticInspectionTest extends PyTestCase {

  public void testTruePositive() {
    doTest();
  }

  public void testTrueNegative() {
    doTest();
  }

  public void testEmpty() {
    doTest();
  }

  public void testInit() {
    doTest();
  }

  private void doTest() {
    myFixture.configureByFile("inspections/PyMethodMayBeStaticInspection/" + getTestName(true) + ".py");
    myFixture.enableInspections(PyMethodMayBeStaticInspection.class);
    myFixture.checkHighlighting(false, false, true);
  }
}
