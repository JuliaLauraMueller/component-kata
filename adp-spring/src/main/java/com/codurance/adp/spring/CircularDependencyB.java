package com.codurance.adp.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircularDependencyB {

	private CircularDependencyA circA;

	@Autowired
	public CircularDependencyB(CircularDependencyA circA) {
		this.circA = circA;
	}
}
