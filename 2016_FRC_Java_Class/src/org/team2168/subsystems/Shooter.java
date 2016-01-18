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

    private Victor Shooter1;
    private Victor Shooter2;
    
  /**
   * 
   *   Private singleton constructor for Shooter subsystems
   */
    static Shooter instance = null;
    
    
    private Shooter()
    {
    	Shooter1 = new Victor(RobotMap.shooterWheel1);
    	Shooter2 = new Victor(RobotMap.shooterWheel2);
    }
    /**
     * Returns Singleton object of shooter subsystem
     * @return single shooter object
     */
    public static Shooter getInstance()
    {
    	if (instance == null)
    		instance = new Shooter();
    		
    		return instance;
    
    }
    /**
     * 
     * drives each shooter wheel in opposite directions
     * @param speed is a double from 1 to -1
     */
    public void driveShooter(double speed)
    {
    	
    	Shooter1.set(speed);
    	Shooter2.set(-speed);
    	
    }
    
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    setDefaultCommand(new DriveShooterWithJoystick());
    }
}

