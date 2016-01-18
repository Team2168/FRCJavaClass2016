package org.team2168;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	////Joysticks//////
	public static final int driverJoystick = 0;
	public static final int operatorJoystick = 1;
	
	
	////////PWM/////////// 0 - 9
	public static final int leftDriveTrain1 = 0;
	public static final int leftDriveTrain2 = 1;
	public static final int leftDriveTrain3 = 2;
	public static final int rightDriveTrain1 = 3;
	public static final int rightDriveTrain2 = 4;
	public static final int rightDriveTrain3 = 5;
	
	public static final int shooterWheel1 = 6;
	public static final int shooterWheel2 = 7;
	
	///Solendods//////
	
	
	
	
	//// Relays////////
	

	
	/// DIO////////
	
	
	
	////Drivetrain Parameters////
	public static final boolean reverseLeft = false;
	public static final boolean reverseRight = true;
	
	
	
}
