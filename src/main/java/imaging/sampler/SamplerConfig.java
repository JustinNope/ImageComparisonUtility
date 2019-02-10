package imaging.sampler;

// TODO: Rename to SamplerFingerprintConfig
public class SamplerConfig {

    private int accuracyX;

    private int accuracyY;

    private int passesPerBlock;

    public int getAccuracyX() {
        return accuracyX;
    }

    public int getAccuracyY() {
        return accuracyY;
    }

    public int getPassesPerBlock() {
        return passesPerBlock;
    }

    public SamplerConfig(int accuracyX, int accuracyY, int passesPerBlock) {
        this.accuracyX = accuracyX;
        this.accuracyY = accuracyY;
        this.passesPerBlock = passesPerBlock;
    }

    public boolean equals(SamplerConfig other) {
        if (other != null) {
            return ((other.getAccuracyX() == accuracyX) && (other.getAccuracyY() == getAccuracyY())
                    && (other.getPassesPerBlock() == passesPerBlock));
        }
        return false;
    }
}
