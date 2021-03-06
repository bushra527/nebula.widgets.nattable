/*******************************************************************************
 * Copyright (c) 2012 Original authors and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Original authors and others - initial API and implementation
 ******************************************************************************/
package org.eclipse.nebula.widgets.nattable.freeze.command;

import org.eclipse.nebula.widgets.nattable.command.AbstractLayerCommandHandler;

public class ReorderFrozenAreaCommandHandler extends AbstractLayerCommandHandler<ReorderFrozenAreaCommand> {

	public boolean doCommand(ReorderFrozenAreaCommand command) {
		return false;
	}

	public Class<ReorderFrozenAreaCommand> getCommandClass() {
		return ReorderFrozenAreaCommand.class;
	}

}
