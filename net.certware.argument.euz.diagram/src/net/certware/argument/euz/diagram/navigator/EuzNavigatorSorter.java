/*
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.euz.diagram.navigator;

import net.certware.argument.euz.diagram.part.EuzVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class EuzNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4021;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof EuzNavigatorItem) {
			EuzNavigatorItem item = (EuzNavigatorItem) element;
			return EuzVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
