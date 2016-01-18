package org.team2168.subsystems;

import org.team2168.RobotMap;
import org.team2168.commands.shooter.DriveShooterWithJoysticks;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	/**
	 * Private singleton constructor for shooter subsystem
	 */
	private Victor shooter1;
	private Victor shooter2;
	
	static Shooter instance = null;
	
	//Now the singleton classes, we only want to be able to make one instance!!!
	private Shooter(){
		
		shooter1 = new Victor(RobotMap.shooterWheel1);
		shooter2 = new Victor(RobotMap.shooterWheel2);
	}
	
	/**
	 * returns singleton object if shooter subsystem
	 * @return single shooter object
	 */
	public static Shooter getInstance(){
		if(instance == null)
			instance = new Shooter();
		
		return instance;
	}
	
	/**
	 * Drives each shooter wheel in opposite directions
	 * @param speed double from 1 to -1
	 */
	public void driveShooter(double speed){
		
		shooter1.set(speed);
		shooter2.set(-speed);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveShooterWithJoysticks());
    }
}

