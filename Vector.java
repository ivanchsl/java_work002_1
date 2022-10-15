public class Vector
{
    public double x, y, z;

    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    // Длина вектора. Корень из суммы квадратов
    double length(){
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    // метод, вычисляющий скалярное произведение
    double scalarProduct(Vector vector){
        return this.x * vector.x + this.y * vector.y + this.z * vector.z;
    }

    // метод, вычисляющий векторное произведение
    Vector crossProduct(Vector vector){
        double x = this.y * vector.z - this.z * vector.y;
        double y = this.z * vector.x - this.x * vector.z;
        double z = this.x * vector.y - this.y * vector.x;
        return new Vector(x, y, z);
    }

    // Косинус между двумя векторами
    double cos(Vector vector){
        return scalarProduct(vector) / (length() * vector.length());
    }

    // Сумма двух векторов
    Vector add(Vector vector){
        return new Vector(this.x + vector.x, this.y + vector.y, this.z + vector.z);
    }

    // Разность двух веторов
    Vector subtract(Vector vector){
        return new Vector(this.x - vector.x, this.y - vector.y, this.z - vector.z);
    }

    @Override
    public int hashCode(){
        return (int)(this.x + this.y + this.z);
    }

    @Override
    public boolean equals(Object obj){
        Vector vector = (Vector) obj;
        return ((this.x == vector.x) && (this.y == vector.y) && (this.z == vector.z));
    }

    @Override
    public String toString(){
        return "Vector(" + this.x + ", " + this.y + ", " + this.z + ")";
    }
}
