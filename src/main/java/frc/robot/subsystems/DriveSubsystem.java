/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import edu.wpi.first.wpilibj.Spark;
import frc.robot.RobotMap;
import frc.robot.commands.TeleopDrive;


/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  
  Spark leftMotor = new Spark(RobotMap.LEFT_MOTOR_PWM_PORT);
  Spark rightMotor = new Spark(RobotMap.RIGHT_MOTOR_PWM_PORT);

  DifferentialDrive drive = new DifferentialDrive(leftMotor, rightMotor);

  public DriveSubsystem(){

  }
  
  public void teleopDrive(double leftPower, double rightPower) {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    drive.tankDrive(leftPower, rightPower);
  }

  public void initDefaultCommand(){
    setDefaultCommand(new TeleopDrive());
  }
}
