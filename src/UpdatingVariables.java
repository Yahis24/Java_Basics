public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        //bono 200
        salary +=200;
        System.out.println(salary);
        //pension
        salary -= 50;
        System.out.println(salary);
        //2 horas extra 30 c/u
        //comida $45
        salary = (salary)+(30*2)-45;
        System.out.println(salary);
        //actualizando cadenas de texto
        String employeeName = "Yahaira Tituaña ";
        employeeName = employeeName + "Gallardo";
        System.out.println(employeeName);
    }
}
