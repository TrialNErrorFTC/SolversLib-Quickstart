package org.firstinspires.ftc.teamcode.subsystems;

import com.seattlesolvers.solverslib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.hardware.motors.Motor;
import com.seattlesolvers.solverslib.hardware.motors.MotorGroup;


public class AngleSubsystem extends SubsystemBase {


    private final Motor angle_motor_left;
    private final Motor angle_motor_right;
    private final MotorGroup angle_motors;

    /**
     * A subsystem that controls the extension mechanism of a robot.
     * This subsystem is responsible for extending and retracting the robot's arm or mechanism.
     * @param hMap The hardware map to access the motors.
     */
    public AngleSubsystem(final HardwareMap hMap) {
        angle_motor_left = new Motor(hMap, "motorTwo", Motor.GoBILDA.RPM_312);
        angle_motor_right = new Motor(hMap, "motorTwo", Motor.GoBILDA.RPM_312);
        angle_motors = new MotorGroup(angle_motor_right, angle_motor_left);
        angle_motor_left.setInverted(true);
    }

    /**
     * Extends to a certain position(DO NOT USE THIS, THIS IS FOR TESTING PURPOSES ONLY).
     */
    public void angleTo(int target_position) {
        angle_motors.setRunMode(Motor.RunMode.PositionControl);

        angle_motors.setTargetPosition(target_position);      // an integer representing
        // desired tick count

        angle_motors.set(0);

        angle_motors.setPositionTolerance(13.6);   // allowed maximum error

        while (!angle_motor_right.atTargetPosition()) {
            angle_motor_left.set(0.75);
        }
        angle_motors.set(0.75);
    }
    public int getCurrentPosition() {
        return angle_motors.getCurrentPosition();
    }
    /**
     * Releases a stone.
     */

}
