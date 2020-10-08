package eu.brain.iot.robot.events;

public class CheckValueReturn extends RobotCommand {
	
	/* 
	 * marker ID contained in QR Code of any objects(e.g. Cart, Door) scanned by robot camera.
	 * 
	 */
	public int markerID;
}