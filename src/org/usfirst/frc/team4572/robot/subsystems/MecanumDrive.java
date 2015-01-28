package org.usfirst.frc.team4572.robot.subsystems;

import org.usfirst.frc.team4572.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;

class BarlowDrive extends RobotDrive {

	public BarlowDrive(SpeedController frontLeftMotor,
			SpeedController rearLeftMotor, SpeedController frontRightMotor,
			SpeedController rearRightMotor) {
		super(frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);
	}
	
	public void mecanumDrive_Cartesian() {
		
	}
}

public class MecanumDrive extends Subsystem {
	
	private RobotDrive driveTrain = new RobotDrive(
			RobotMap.frontLeftMotor,
			RobotMap.backLeftMotor,
			RobotMap.frontRightMotor,
			RobotMap.backRightMotor
	);
	
	protected void initDefaultCommand() {

	}
	
	public void drive(Joystick joystick) {
		driveTrain.mecanumDrive_Cartesian(
				joystick.getX(),
				joystick.getY(), 
				joystick.getTwist(), 
				0);
		
	}

}
