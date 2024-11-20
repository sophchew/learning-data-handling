public class Playstation implements SaveSystem {
    @Override
    public boolean save() {
        return false;
    }

    @Override
    public boolean load() {
        return false;
    }

    @Override
    public boolean autoSave() {
        return false;
    }
}
