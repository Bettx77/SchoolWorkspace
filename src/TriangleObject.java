public class TriangleObject {
    double stranaA, stranaB, stranaC;
    TriangleObject(double stranaA, double stranaB, double stranaC){
        if(stranaA <= 0 || stranaB <=0 || stranaC <=0){
            throw new ArithmeticException();
        }
        if(stranaA + stranaB <= stranaC || stranaB + stranaC <= stranaA || stranaA + stranaC <= stranaB){
            throw new ArithmeticException();
        }

        this.stranaA = stranaA;
        this. stranaB = stranaB;
        this.stranaC = stranaC;
    }

    double obvod(){
        return (stranaA + stranaB + stranaC);
    }

    double obsah(){
        double s = obvod()/2;
        return (Math.sqrt(s*(s-stranaA)*(s-stranaB)*(s-stranaC)));
    }
}
