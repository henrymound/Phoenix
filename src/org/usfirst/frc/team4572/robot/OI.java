package org.usfirst.frc.team4572.robot;

//import com.ni.vision.NIVision;
import com.ni.vision.NIVision.DrawMode;
import com.ni.vision.NIVision.Image;
import com.ni.vision.NIVision.ShapeMode;

import edu.wpi.first.wpilibj.CameraServer;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.ADXL345_I2C;
import edu.wpi.first.wpilibj.vision.AxisCamera;
 import edu.wpi.first.wpilibj.buttons.Button;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

public class OI {
	
	Image frame;
	
	public static Joystick driveStick = new Joystick(0);
	public static Joystick rotateStick = new Joystick(1);
	
	public static AxisCamera camera = new AxisCamera(null);
	
}

