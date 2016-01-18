package org.team2168.subsystems;

import org.team2168.RobotMap;
import org.team2168.commands.shooter.DriveShooterWithJoystick;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Victor shooter1;
	Victor shooter2;
	
	static Shooter instance;
	
	/**
	 * Private singleton constructor for shooter subsystem
	 */
	private Shooter() {
		shooter1 = new Victor(RobotMap.shooterWheel1);
		shooter2 = new Victor(RobotMap.shooterWheel2);
	}
	
	/**
	 * Returns singleton object of shooter subsystem
	 * @return single shooter object
	 */
	public static Shooter getInstance(){
		if(instance == null)
			instance = new Shooter();
		
		return instance;
	}
	
	/**
	 * Drives each shooter wheel in opposite directions
	 * @param double speed from 1 to -1
	 */
	public void driveShooter(double speed) {
		shooter1.set(speed);
		shooter2.set(-speed);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveShooterWithJoystick());
    }
}

