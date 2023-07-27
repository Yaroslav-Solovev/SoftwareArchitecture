package HW_Les_1;

public class ModelStore {
    public
        PoligonalModel Models;
        Scene Scenes;
        Flash Flashes;
        Camera  Cameras;
    private 
        IModelChangeObserver changeObservers;
    public
        Scene GetScena(Int) {return scene;} 
        void NotifyChange(IModelChanger sender) {};
}