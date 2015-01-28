/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.RobotDrive;

import edu.wpi.first.wpilibj.templates.commands.DriveWithJoysticksCommand;

/**
 *
 * @author mlin4_000
 */
public class DriveTrainSystem extends Subsystem {
    public RobotDrive driveTrain = new RobotDrive(
            1, //front left motor
            8, //rear left
            2, //front right
            9  // rear right
    );
    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithJoysticksCommand());
    }
}
