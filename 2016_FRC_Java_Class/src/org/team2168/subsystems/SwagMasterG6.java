package org.team2168.subsystems;

import org.team2168.commands.swagmasterg6.Ben;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class SwagMasterG6 extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	static SwagMasterG6 instance;
	
	private SwagMasterG6(){
		
	}
	
	/**
	 * returns singleton instance of SwagMasterG6 object
	 * @return
	 */
	public static SwagMasterG6 getInstance(){
		if(instance == null)
			instance = new SwagMasterG6();
		
		return instance;
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new Ben());
    }
}

