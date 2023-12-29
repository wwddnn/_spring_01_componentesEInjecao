package services;

import entities.Employee;

/* essa classe tem uma dependencia com as outras duas classes ( TaxService e PensionService), porque o netSalary é calculado com base no taxService e no PensionService*/
public class SalaryService {

    /* FORMA ERRADA DE FAZER !!! */
    /* vou instanciar aqui dentro da classe SalaryService as outras duas classes*/
    TaxService taxService = new TaxService();
    PensionService pensionService = new PensionService();
    public double netSalary (Employee employee) {
        return employee.getGrossSalary() - taxService.tax(employee.getGrossSalary()) - pensionService.discount(employee.getGrossSalary());
    }

}
