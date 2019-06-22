package com.guice.app;

import org.apache.commons.math3.analysis.function.Add;

import com.google.inject.Binder;
import com.google.inject.Module;

public class AddMod implements Module {

	@Override
	public void configure(Binder binder) {
		// TODO Auto-generated method stub
		binder.bind(Sum.class).to(SimpleSum.class);
	}

	
	
}
