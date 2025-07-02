package org.firstinspires.ftc.teamcode.subsystems;

import com.seattlesolvers.solverslib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.hardware.motors.Motor;
import com.seattlesolvers.solverslib.hardware.motors.MotorGroup;


public class ExtensionSubsystem extends SubsystemBase {


    private final Motor extension_motor_left;
    private final Motor extension_motor_right;
    private final MotorGroup extension_motors;

    /**
     * A subsystem that controls the extension mechanism of a robot.
     * This subsystem is responsible for extending and retracting the robot's arm or mechanism.
     *
     * @param hMap The hardware map to access the motors.
     * @param name The name of the subsystem.
     */
    public ExtensionSubsystem(final HardwareMap hMap, final String name) {
        extension_motor_left = new Motor(hMap, "motorTwo", Motor.GoBILDA.RPM_312);
        extension_motor_right = new Motor(hMap, "motorTwo", Motor.GoBILDA.RPM_312);
        extension_motors = new MotorGroup(extension_motor_right, extension_motor_left);
        extension_motor_left.setInverted(true);
    }

    /**
     * Extends to a certain position(YOU CANNOT USE THIS, THIS IS FOR TESTING PURPOSES ONLY).
     */
    public void extendTo(int target_position) {
        extension_motors.setRunMode(Motor.RunMode.PositionControl);

        extension_motors.setTargetPosition(target_position);      // an integer representing
        // desired tick count

        extension_motors.set(0);

        extension_motors.setPositionTolerance(13.6);   // allowed maximum error

        while (!extension_motor_right.atTargetPosition()) {
            extension_motor_left.set(0.75);
        }
        extension_motors.set(0.75);
    }

    /**
     * Releases a stone.
     */

}