package p01_SingleResponsibility.p01_DrawingShape;

public interface Rengerer {
    void render(DrawingRepository drawingRepository, Shape shape);
}
