package solidLab.p01_SingleResponsibility.p01_DrawingShape;

import p01_SingleResponsibility.p01_DrawingShape.DrawingManager;
import p01_SingleResponsibility.p01_DrawingShape.DrawingRepository;
import p01_SingleResponsibility.p01_DrawingShape.Rengerer;
import p01_SingleResponsibility.p01_DrawingShape.Shape;


public class DrawingManagerImpl implements DrawingManager {

    private final DrawingRepository drawingRepository;
    private final Rengerer renderer;

    public DrawingManagerImpl(DrawingRepository drawingRepository, Rengerer renderer) {
        this.drawingRepository = drawingRepository;
        this.renderer = renderer;
    }


    @Override
    public void draw(Shape shape) {
        shape.draw(this.renderer, this.drawingRepository);
    }
}
