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

import eu.brain.iot.robot.api.Command;
import eu.brain.iot.robot.api.RobotCommand;

public class PlaceCart extends RobotCommand {

	/* 
	 * Used for matching with the command field of QueryStateValueReturn received by Robot Behaviour  
	 * who will know the QueryStateValueReturn is the response of which robot command(WriteGoTo, pickCart, placeCart)
	 */
	public Command command = Command.PLACE;
	
}
