/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2019-2019 the original author or authors.
 */

package org.quickperf.spring;

import org.quickperf.spring.database.ClassWithAFailingTestAndTransactionalTestExecutionListener;

public class JUnit4Spring3Test extends AbstractJUnit4SpringTestBase {

    @Override
    protected Class<?> classWithTestHavingFunctionalAndPerfIssues() {
        return ClassAnnotatedWithQPSpring3RunnerAndWithAMethodHavingFunctionalAndPerfIssues.class;
    }

    @Override
    public Class<?> classWithTestHavingFunctionalAndPerfIssuesAndRunningInADedicatedJvm() {
        return ClassAnnotatedWithQPSpring3RunnerAndWithAMethodHavingFunctionalAndPerfIssuesAndRunningInADedicatedJvm.class;
    }

    @Override
    protected Class<?> aClassWithMethodNoAllocatingAndNoAllocationAnnotation() {
        return ClassAnnotatedWithQPSpring3RunnerWithAMethodHavingAPerfIssueAndRunningInADedicatedJvm.class;
    }

    @Override
    protected Class<?> aClassWithMethodAllocatingAndNoAllocationAnnotation() {
        return ClassAnnotatedWithQPSpring3RunnerAndWithATestMethodAllocatingAndAnnotatedExpectNoHeapAllocation.class;
    }

    @Override
    protected Class<?> aClassAnnotatedWithQPSpringRunnerAndDisableQuickPerf() {
        return ClassAnnotatedWithQPSpring3RunnerAndDisableQuickPerf.class;
    }

    @Override
    protected Class<?> aClassAnnotatedWithQPSpringRunnerAndFunctionalIteration() {
        return ClassAnnotatedWithQPSpring3RunnerAndFunctionalIteration.class;
    }

    @Override
    protected Class<?> aClassAnnotatedWithQPSpringRunnerOneJvm() {
        return ClassAnnotatedWithQPSpring3RunnerWithATestMethodHavingAPerformanceIssueAnRunningInADedicatedJvm.class;
    }

    @Override
    protected Class<?> aClassWithTwoMethodsHavingFunctionnalAndPerfIssues() {
        return ClassAnnotatedWithQPSpring3RunnerAndWithTwoMethodsHavingFunctionalAndPerfIssues.class;
    }

    @Override
    protected Class<?> aClassWithTransactionalTestExecutionListenerAndAFailingTest() {
        return ClassWithAFailingTestAndTransactionalTestExecutionListener.class;
    }

}