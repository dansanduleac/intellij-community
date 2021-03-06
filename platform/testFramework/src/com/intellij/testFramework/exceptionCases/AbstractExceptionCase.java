/*
 * Copyright 2000-2009 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.testFramework.exceptionCases;

/**
 * @author Roman Chernyatchik
 *
 * Base class of block, annotated with exception. Inheritors of this
 * class specifies concrete Exception classes
 */
public abstract class AbstractExceptionCase<T extends Throwable> {

    public abstract Class<T> getExpectedExceptionClass();

  /**
   * Suspicious code must be in implementation of this closure
   * @throws T
   */
    public abstract void tryClosure() throws T;

    public String getAssertionErrorMessage() {
        return getExpectedExceptionClass().getName() + " must be thrown.";
    }
}
