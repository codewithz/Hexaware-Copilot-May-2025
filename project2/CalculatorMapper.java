public class CalculatorMapper {

    public static Calculator toDomainModel(CalculatorDTO dto) {
        Calculator calculator = new Calculator();
        // Map fields from DTO to domain model
        calculator.setA(dto.getA());
        calculator.setB(dto.getB());
        calculator.setOperation(dto.getOperation());
        return calculator;
    }

    public static CalculatorDTO toDTO(Calculator calculator) {
        CalculatorDTO dto = new CalculatorDTO();
        // Map fields from domain model to DTO
        dto.setA(calculator.getA());
        dto.setB(calculator.getB());
        dto.setOperation(calculator.getOperation());
        return dto;
    }
}
