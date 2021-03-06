package org.usfirst.frc.team4572.robot.commands;

//import from our packages
import org.usfirst.frc.team4572.robot.Robot;
import org.usfirst.frc.team4572.robot.subsystems.MecanumDrive;
import org.usfirst.frc.team4572.robot.subsystems.Camera;
import org.usfirst.frc.team4572.robot.OI;


//import from wpilibj
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Joystick;

/**
 *
 */
public class CommandBase extends Command {
	protected static OI oi = Robot.oi;
	protected static MecanumDrive mecanumDrive = Robot.mecanumDrive;
	protected static Camera camera = Robot.camera;
	protected static Joystick driveStick = OI.driveStick;
	
    public CommandBase() {
    	
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
