package org.usfirst.frc.team4572.robot.commands;

import com.ni.vision.NIVision;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class CameraUpdate extends CommandBase {
	
    public CameraUpdate() {
    	requires(camera);
    }
    // Called just before this Command runs the first time
    protected void initialize() {
    	NIVision.IMAQdxConfigureGrab(camera.session);
    	SmartDashboard.putString("Camera Update", "Initialized");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	NIVision.IMAQdxGrab(camera.session, camera.frame, 1);
    	CameraServer.getInstance().setImage(camera.frame);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	NIVision.IMAQdxStopAcquisition(camera.session);
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	
    }
}
