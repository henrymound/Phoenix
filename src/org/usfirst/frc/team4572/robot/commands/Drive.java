package org.usfirst.frc.team4572.robot.commands;

public class Drive extends CommandBase {

	public Drive(){
		requires(mecanumDrive);
	}
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	protected void execute() {
		mecanumDrive.drive(driveStick);

		// TODO: Replace "0" with sensor input
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
