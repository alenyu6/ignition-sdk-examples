package com.inductiveautomation.examples.sfc.gateway;

import com.inductiveautomation.examples.sfc.common.AbstractExampleStepDelegate;
import com.inductiveautomation.ignition.common.config.Property;
import com.inductiveautomation.sfc.api.ChartContext;
import com.inductiveautomation.sfc.api.ChartStep;
import com.inductiveautomation.sfc.api.ChartStepFactory;
import com.inductiveautomation.sfc.api.XMLParseException;
import com.inductiveautomation.sfc.api.elements.StepFactory;
import com.inductiveautomation.sfc.definitions.StepDefinition;
import com.inductiveautomation.sfc.uimodel.ChartCompilationResults;
import com.inductiveautomation.sfc.uimodel.ChartUIElement;

public class ExampleStepFactory extends AbstractExampleStepDelegate implements StepFactory {

    @Override
    public ChartStep create(ChartContext chartContext, StepDefinition definition) {
        return new ExampleStep(chartContext, definition);
    }
}
