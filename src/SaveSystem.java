public interface SaveSystem {
    // interfaces provide consistency and standardization, ensures that all classes have the same methods
    // can do multiple interfaces to a class, not subclasses
    public boolean save();

    public boolean load();
    public boolean autoSave();

}
