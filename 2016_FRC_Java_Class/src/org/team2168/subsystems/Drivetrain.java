package org.team2168.subsystems;

import org.team2168.RobotMap;
import org.team2168.commands.drivetrain.DriveWithJoysticks;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Drivetrain Subsystem
 */
public class Drivetrain extends Subsystem {
    
	private Talon left1;
	private Talon left2;
	private Talon left3;
	private Talon right1;
	private Talon right2;
	private Talon right3;
	
	public static Drivetrain instance = null;
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private Drivetrain() {	
		left1 = new Talon(RobotMap.DRIVETRAIN_TALON_LEFT_1);
		left2 = new Talon(RobotMap.DRIVETRAIN_TALON_LEFT_2);
		left3 = new Talon(RobotMap.DRIVETRAIN_TALON_LEFT_3);
		right1 = new Talon(RobotMap.DRIVETRAIN_TALON_RIGHT_1);
		right2 = new Talon(RobotMap.DRIVETRAIN_TALON_RIGHT_2);
		right3 = new Talon(RobotMap.DRIVETRAIN_TALON_RIGHT_3);
	}
	
	/**
	 * Returns the instance of the Drivetrain singleton class
	 * @return Drivetrain Subsystem Object
	 */
	public static Drivetrain getInstance() {
		if(instance == null)
			instance = new Drivetrain();
		
		return instance;
	}
	
	/**
	 * Drive left side of Drivetrain
	 * @param speed value from -1 to 1
	 */
	public void driveLeft(double speed) {
		left1.set(speed);
		left2.set(speed);
		left3.set(speed);
	}
	
	/**
	 * Drive right side of Drivetrain
	 * @param speed value from -1 to 1
	 */
	public void driveRight(double speed) {
		right1.set(speed);
		right2.set(speed);
		right3.set(speed);
	}
	
	/**
	 * Drives Drivetrain left and right side
	 * @param leftSpeed value from -1 to 1
	 * @param rightSpeed value from -1 to 1
	 */
	public void drive(double leftSpeed, double rightSpeed) {
		driveLeft(leftSpeed);
		driveRight(rightSpeed);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveWithJoysticks());
    }
}

