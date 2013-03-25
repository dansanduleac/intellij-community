package com.jetbrains.python.quickFixes;

import com.jetbrains.python.PyBundle;
import com.jetbrains.python.inspections.PyMethodMayBeStaticInspection;

/**
 * User: ktisha
 */
public class PyMakeMethodStaticQuickFixTest extends PyQuickFixTestCase {

  public void testOneParam() {
    doInspectionTest(PyMethodMayBeStaticInspection.class, PyBundle.message("QFIX.NAME.make.static"));
  }

  public void testTwoParams() {
    doInspectionTest(PyMethodMayBeStaticInspection.class, PyBundle.message("QFIX.NAME.make.static"));
  }

  public void testEmptyParam() {
    doInspectionTest(PyMethodMayBeStaticInspection.class, PyBundle.message("QFIX.NAME.make.static"));
  }

}
