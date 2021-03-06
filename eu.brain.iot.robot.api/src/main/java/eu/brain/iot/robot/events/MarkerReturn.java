/*******************************************************************************
 * Copyright (C) 2021 LINKS Foundation
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package eu.brain.iot.robot.events;

import eu.brain.iot.robot.api.RobotCommand;

public class MarkerReturn extends RobotCommand {
	
	/* 
	 * marker ID contained in QR Code of any objects(e.g. Cart, Door) scanned by robot camera.
	 * 
	 */
	public int markerID;
}
