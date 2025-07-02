package org.firstinspires.ftc.teamcode;

import com.seattlesolvers.solverslib.command.CommandOpMode;
import com.seattlesolvers.solverslib.command.button.Button;
import com.seattlesolvers.solverslib.command.button.GamepadButton;
import com.seattlesolvers.solverslib.drivebase.MecanumDrive;
import com.seattlesolvers.solverslib.gamepad.GamepadEx;
import com.seattlesolvers.solverslib.gamepad.GamepadKeys;
import com.seattlesolvers.solverslib.hardware.motors.MotorEx;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.CommandSample.DriveSubsystem;
@TeleOp(name = "Sample TeleOp")
@Disabled
public class robotTeleOp extends CommandOpMode {


    private MotorEx frontLeft, frontRight, backLeft, backRight;
    private MecanumDrive m_drive;
    private GamepadEx m_driverOp;
    private DriveSubsystem m_driveCommand;
    private Button m_grabButton, m_releaseButton;

    @Override
    public void initialize() {
        frontLeft = new MotorEx(hardwareMap, "frontLeft");
        frontRight = new MotorEx(hardwareMap, "frontRight");
        backLeft = new MotorEx(hardwareMap, "backLeft");
        backRight = new MotorEx(hardwareMap, "backRight");
//
        m_drive = new MecanumDrive(frontLeft, frontRight,
                backLeft, backRight);



        m_driverOp = new GamepadEx(gamepad1);
        //TODO: Add Buttons and Driving
    }

}