import core.basesyntax.dao.animal.AnimalDao;
import core.basesyntax.dao.animal.AnimalDaoImpl;
import core.basesyntax.dao.figure.FigureDao;
import core.basesyntax.dao.figure.FigureDaoImpl;
import core.basesyntax.model.figure.Circle;
import core.basesyntax.model.figure.Figure;
import core.basesyntax.model.figure.Triangle;
import core.basesyntax.model.zoo.Animal;
import core.basesyntax.model.zoo.Cat;
import core.basesyntax.model.zoo.Dog;
import core.basesyntax.util.HibernateUtil;

public class Main {
    public static void main(String[] args) {

        FigureDao<Figure> figureDao = new FigureDaoImpl<>(HibernateUtil.getSessionFactory());

        Triangle triangle = new Triangle();
        triangle.setColor("red");
        triangle.setArea(10);
        Figure actualTriangle = figureDao.save(triangle);

        Circle circle = new Circle();
        circle.setColor("pink");
        circle.setRadius(5);
        Figure actualCircle = figureDao.save(circle);




    }
}
