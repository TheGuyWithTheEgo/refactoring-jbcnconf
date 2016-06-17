package com.refactoring.jbcnconf.bridge;


import com.refactoring.jbcnconf.bridge.handler.IntArraySortHandlerFactory;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

/**
 * Refactoring idea by Wlodek Krakowski
 */
@RunWith(JUnitParamsRunner.class)
public class IntArraySelectionSorterTest extends AbstractIntArraySorterTest{

    @Override
    protected Sorter<int[]> getIntArraySorter() {
        return new SelectionSorter<int[]>(new IntArraySortHandlerFactory());
    }
}