package com.nativegame.nattyengine.entity.particles.initializer;

import com.nativegame.nattyengine.entity.particles.Particle;

import java.util.Random;

public class RotationInitializer implements ParticleInitializer {

    private final int mMinAngle;
    private final int mMaxAngle;

    public RotationInitializer(int minAngle, int maxAngle) {
        mMinAngle = minAngle;
        mMaxAngle = maxAngle;
    }

    @Override
    public void initParticle(Particle particle, Random random) {
        particle.mRotation = random.nextFloat() * (mMaxAngle - mMinAngle) + mMinAngle;
    }

}
